import java.util.Scanner;
public class OddEvenNumbers
{
	public static void main(String[] args)
   {
	//Creating a Scanner object
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number ");
	//Taking the User Input
	int number = input.nextInt();
	
	//Checking whether the given input is a Natural Number or not
	if(number > 0)
	{
		System.out.println(" It is a natural number ");
		
	//Iterating the For Loop from 1 to the given number 
		for(int i = 1; i <= number ; i++)
		{	
		//Checking Even or Odd
			if(i % 2 == 0)
			{
				System.out.println(i + " is Even ");
			}
			else
			{
				System.out.println(i + " is Odd ");
			}
		}
	 }
	 else
	 {
		 System.out.println(" Not a natural number ");
	 }	   
	//Closing the Scanner object
	input.close();	
   }
}   