import java.util.*;
public class FizzBuzzArr
{
	public static void main(String[] args)
	{	
		//Creating a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		int number = input.nextInt();
		String fizzBuzzArray[] = new String[number];
		
		//Check whether it it positive
		if(number >	0)
		{
			for(int i = 1; i <= number ; i++)
			{
				if(i % 3 == 0 && i % 5 == 0)
				{
					fizzBuzzArray[i - 1] = "FizzBuzz";
				}
				else if(i % 3 == 0)
				{
					fizzBuzzArray[i - 1] = "Fizz";
				}
				else if(i % 5 == 0)
				{
					fizzBuzzArray[i - 1] = "Buzz";
				}
				else
				{
					fizzBuzzArray[i - 1] = ""+i;
				}
             }
			 for(int i = 1 ; i <= number ; i++)
			 {
				System.out.println("Position : " + i + " = " + fizzBuzzArray[i - 1]);
			 }
		}
		else
		{
			System.out.println("Enter a positive integer : ");
		}
		input.close();
	}
}	
				
					 
		