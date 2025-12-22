import java.util.Scanner;
public class CalendarDisplay
{

    // Array of month names
    public static String getMonthName(int month)
	{
        String[] months = { "January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December" };
        return months[month - 1];
    }

    // Check if year is leap
    public static boolean isLeapYear(int year)
	{
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get number of days in a month
    public static int getDaysInMonth(int month, int year)
	{
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year))
		{
            return 29;
        }
        return days[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year)
	{
        int y = year;
        int m = month;
        if (m < 3) 
		{
            m += 12;
            y -= 1;
        }
        int k = y % 100; 
        int j = y / 100; 
        int h = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        
        int day = ((h + 6) % 7); // shift so 0 = Sunday
        return day;
    }


    public static void displayCalendar(int month, int year)
	{
        System.out.println("    " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);
		
        for (int i = 0; i < firstDay; i++)
		{
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++)
		{
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0)
			{
                System.out.println(); 
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        displayCalendar(month, year);

        scanner.close();
    }
}
