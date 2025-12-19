import java.util.*;
public class CheckPositiveNegativeOrZero
{
	public static void main(String[] args)
	{
	//Taking User Input
	int[] numbers = new int[5];
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Five numbers: ");
	for(int i = 0; i < numbers.length; i++)
	{
		System.out.println("Number " + (i+1) + ": ");
		numbers[i] = input.nextInt();
	}
	for(int i = 0; i < numbers.length; i++)
	{
		if(numbers[i] > 0)
		{
			System.out.println("Number is positive");
			if( numbers[i] % 2 == 0)
			{
				System.out.println("Even Number");
			}
			else
			{
				System.out.println("Odd Number");
			}
		}
		else if(numbers[i] < 0)
		{
			System.out.println("Number  is negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}
	if(numbers[0] < numbers[4])
	{
		System.out.println("Last element is greater than First element");
	}
	else if(numbers[0] > numbers[4])
	{
		System.out.println("Last element is smaller than First element");
	}
	else
	{
		System.out.println("Both the element is equal");
	}
  }
}  