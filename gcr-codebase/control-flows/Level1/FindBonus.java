import java.util.*;
public class FindBonus
{
	public static void main(String[] args)
	{
		//Creating a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Taking salary and year of service as input
		System.out.println("Enter the amount of salary");
		double salary = input.nextDouble();
		System.out.println("Enter year of service");
		int years = input.nextInt();
		
		//Checking Eligibility for Bonus
		if(years > 5)
		{
			double bonus = salary * 0.05;
			System.out.println("Bonus amount is: " + bonus);
		}
		else
		{
			System.out.println("Employee is not eligible for bonus");
		}
		//Closing the Scanner Object
		input.close();
	}	
}	
			