import java.util.*;
public class FindFactorial
{
	public static void main(String[] args)
  {
	//Creating a Scanner Object
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	
	//Computing the factorial
	int factorial=1;
	if(number>0)
	{
		while(number>0)
		{
			 factorial*=number;
			 number--;
		}
	}
		// Display result
	System.out.println("Factorial : "+factorial);
	
	//Close the Scanner object
	input.close();
  }
}