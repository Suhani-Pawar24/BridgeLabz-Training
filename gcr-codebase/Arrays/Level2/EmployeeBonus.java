import java.util.*;
public class EmployeeBonus
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Arrays to store salary, years, newSalary, bonusAmount
		double[] salary = new double[10];
		double[] years = new double[10];
		double[] newSalary = new double[10];
		double[] bonusAmount = new double[10];
		
		//Variables to store totalBonus, totalOldSalary, totalNewSalary
		double totalBonus = 0;
		double totalOldSalary = 0;
		double totalNewSalary = 0;
		
		for(int i = 0; i < 10; i++)
		{
			while(true)
			{
				System.out.println("Enter salary for employee " + (i+1)+ ": ");
				salary[i] = input.nextDouble();
				if(salary[i] <= 0)
				{
					System.out.println("Invalid Number. Enter Again ");
					continue;
				}
				System.out.println("Enter years of service " + (i+1)+ ": ");
				years[i] = input.nextDouble();
				if(years[i] < 0 )
				{
					System.out.println("Years of service cannot be negative. Enter Again ");
					continue;
				}
				break;
			}
		}
		for( int i = 0; i < 10; i++ )
		{
			if(years[i] > 5)
			{
				bonusAmount[i] = salary[i] * 0.05;
			}
			else
			{
				bonusAmount[i] = salary[i] * 0.02;
			}
			newSalary[i] = salary[i] + bonusAmount[i];

			totalBonus += bonusAmount[i];
			totalOldSalary += salary[i];
			totalNewSalary += newSalary[i];
		}
		// Output results
        System.out.println("\nEmployee details:");
        System.out.println("Employee\tOld Salary\tBonus\t\tNew Salary");
		for (int i = 0; i < 10; i++) 
		{
			System.out.printf("%-8d\t%-10.2f\t%-10.2f\t%-10.2f\n", i + 1, salary[i], bonusAmount[i], newSalary[i]);
		}

        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

		input.close();
	}
}	