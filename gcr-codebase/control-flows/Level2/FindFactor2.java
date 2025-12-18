import java.util.*;
public class FindFactor2
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
		//Initialize a counter
		int i = 1;
		//Run while loop until i is less than or equal to number
		while( i <= number ) 
		{
			//Checking if i is a factor
			if(number % i == 0)
			{
				System.out.println(i);
			}
			//Increment counter
			i++;
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