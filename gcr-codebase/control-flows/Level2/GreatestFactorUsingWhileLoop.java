import java.util.*;
public class GreatestFactorUsingWhileLoop
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
	//Creating a While Loop
		int counter = number - 1;
		while(counter >= 1)
		{
			if(number % counter == 0)
			{
				greatestFactor=counter;
				break;
			}
		counter--;	
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