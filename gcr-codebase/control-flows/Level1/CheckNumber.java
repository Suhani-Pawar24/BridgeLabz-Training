import java.util.Scanner;
public class CheckNumber
{
	public static void main(String[]args)
	{
		// Creating a Scanner object
		Scanner sc = new Scanner(System.in);
	
		// Taking User Input 
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		//Checking whether the number is positive,negative or zero
		if(number > 0)
		{
			System.out.println("Positive");
		}
		else if(number < 0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}	
	}	
}	