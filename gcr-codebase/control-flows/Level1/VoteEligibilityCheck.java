import java.util.*;
public class VoteEligibilityCheck
{
	public static void main(String[]args)
	{
		// Creating a Scanner object
		Scanner sc = new Scanner(System.in);
	
		// Taking User Input 
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		// Checking the condition for vote
		if(age>=18)
		{
			System.out.println( "The person can vote." );
		}
		else
		{
			System.out.println("The person cannot vote.");
		}
		
		//Closing Scanner Class
		sc.close();
	}
}