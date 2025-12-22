import java.util.*;
public class SumOfNNaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		if(number <= 0)
		{
			System.out.println("Enter a natural number: ");
			return;
		}
		
		int sumRecursion = sumUsingRecursion(number);
		int sumFormula = sumUsingFormula(number);
		
		System.out.println("Sum of first " + number + " natural numbers using recursion: " + sumRecursion);
		System.out.println("Sum of first " + number + " natural numbers using formula: " + sumFormula);
		
		if(sumRecursion == sumFormula)
		{
			System.out.println("Both gives same output");
		}
		else
		{
			System.out.println("Output doesn't match");
		}
		
		input.close();	
	}
	public static int sumUsingRecursion(int number)
	{
		if(number == 1)
		{
			return 1;
		}
		else
		{
			return number + sumUsingRecursion(number-1);
		}
	}
	public static int sumUsingFormula(int number)
	{
		return number * (number + 1) / 2;
	}
}	
		