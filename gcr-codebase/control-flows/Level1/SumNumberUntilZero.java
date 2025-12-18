import java.util.*;
public class SumNumberUntilZero
{
	public static void main(String[]args)
  {
	// Creating a Scanner Object
	Scanner sc = new Scanner(System.in);

	//Taking User Input
	double total = 0.0;
	System.out.println("Enter the number : ");
	double userInput = sc.nextDouble();
	
	//Using while loop for input until user enter zero 
	while(userInput!=0.0)
	{
		total+=userInput;
		System.out.println("Enter the number : ");
		userInput = sc.nextDouble();
	}
	
	// Display Result
	System.out.println("Total Value : "+total);
	
	sc.close();
   }
}