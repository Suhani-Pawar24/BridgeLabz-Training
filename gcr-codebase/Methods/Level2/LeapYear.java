import java.util.*;
public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		
		if(year < 1582)
		{
			System.out.println("Enter a valid year");
			input.close();
			return;
		}
		
		boolean isLeap = LeapYear.FindLeapYear(year);
		
		if(isLeap)
			System.out.println(year + " is a Leap Year.");
		else
			System.out.println(year + " is not a Leap Year.");
		
	}
	
	//Method to check leap year
	public static boolean FindLeapYear(int year)
	{
		if( year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}
}	
		