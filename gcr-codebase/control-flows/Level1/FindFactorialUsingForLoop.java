import java.util.*;
public class FindFactorialUsingForLoop{
	public static void main(String[]args){
	//Creating Scanner class object
	Scanner sc = new Scanner(System.in);

	//Taking User Input
	System.out.println("Enter the number : ");
	int number = sc.nextInt();
	
	// Calculating Factorial Using For Loop
	int factorial=1;
	if(number>0)
	{
		for(int i = 1 ; i<=number ; i++)
		{
			factorial*=i;
		}	
	}
	
	//Display result
	System.out.println("Factorial : "+factorial);
	
	//Closing the Scanner class
	sc.close();
	}
}