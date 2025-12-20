import java.util.*;
public class CheckNumber
{
	//Check whether the number is positive negative or zero
	public int  checkNumberPositiveNegativeOrZero(int number)
	{
		if(number > 0)
		{
			return 1;
		}
		else if(number < 0)
		{
			return -1;
		}
		else
		{			
			return 0;
		}
	}		
	public static void main(String[] args)
	{
		//Creating a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter a number : ");
		int number = input.nextInt();
		CheckNumber obj = new CheckNumber();
		System.out.println(obj.checkNumberPositiveNegativeOrZero(number));
		input.close();
	}	
	
}		