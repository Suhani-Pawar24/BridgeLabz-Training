import java.util.*;
public class FindFactor
{
	public static void main(String[] args)
   {
	//Creating a Scanner Object
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number : ");
	
	//Taking User Input
	int number = input.nextInt();
	
	//Checking whether given input is a positive integer or not
	if(number > 0)
	{
		System.out.println("Factors of " + number + " are:");
		for( int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				System.out.println(i);
			}
		}
	}
	else
	{
		System.out.println("Enter a positive integer");
	}
	//Closing the Scanner Object
	input.close();
   }
}	
	