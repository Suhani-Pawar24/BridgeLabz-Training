import java.util.*;
public class GreatestFactorUsingForLoop
{
	public static void main(String[] args)
  {
	//Create a Scanner Object
	Scanner input = new Scanner(System.in);
	
	//Take UserInput
	System.out.println("Enter an integer: ");
	int number = input.nextInt();
	
	if(number > 0)
	{
	  int greatestFactor = 1;	
	//Creating a For Loop
		for( int i = number - 1 ; i >= 1 ; i--)
		{
			if(number % i == 0)
			{
				greatestFactor=i;
				break;
			}
		}
		System.out.println(greatestFactor);
	}
	else
	{
		System.out.println("Please enter a positive integer");
	}
	//Closing the Scanner Object
	input.close();
  }	
}	