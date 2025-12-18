import java.util.Scanner;
public class SumOfNaturalNumber
{
	public static void main(String[] args)
  {
	//Creating a Scanner Object
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number ");
	//Taking the number as input
	int number = input.nextInt();
	
	//Initializing a sum variable and assigning value to it 
	int sum = 0;
	
	//Checking whether a number is natural number or not
	if(number >= 0)
	{
		for(int i=1; i<=number ; i++)
		{ 
		sum+=i;
		}
		System.out.println("The sum of " +number+ " natural numbers is "+sum);
	}
	else
	{
		System.out.println("The number "+number+ " is not a natural number");
	}
   }
}   