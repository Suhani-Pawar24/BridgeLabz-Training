import java.util.*;
public class BusAttendanceSystem
 {
    public static void attendanceCalculator() 
	{
        Scanner input = new Scanner(System.in);

        String[] students = new String[10];
        System.out.println("Enter the names of 10 students:");

        // Input student names
        for (int i = 0; i < 10; i++)
		{
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
        }

        int present = 0;
        int absent = 0;

        // Take attendance using for-each loop
        for (String name : students)
		{
            System.out.print(name + " - Present or Absent? ");
            String status = input.next();

            // Check input ignoring case
            if (status.equalsIgnoreCase("Present"))
			{
                present++;
            }
			else if (status.equalsIgnoreCase("Absent")) 
			{
                absent++;
            } 
			else
			{
                System.out.println("Invalid input, counting as Absent.");
                absent++;
            }
        }

        System.out.println("\nTotal Present: " + present);
        System.out.println("Total Absent: " + absent);

        input.close();
    }

    public static void main(String[] args) 
	{
        attendanceCalculator();
    }
}

	
		
		