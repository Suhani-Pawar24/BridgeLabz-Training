import java.util.*;

public class IsFirstSmallest
{
	
	public static void main(String[] args)
	{
	//Create a Scanner Object 
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three numbers : ");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	
	//Checking whether number1 is smallest
	if((number1 < number2) && (number1 < number3))
	{
		System.out.println("Is the first number the smallest? "+ "Yes");
	}
	else
	{
		System.out.println("Is the first number the smallest? "+ "No");	
	}
	
	}
}	
	