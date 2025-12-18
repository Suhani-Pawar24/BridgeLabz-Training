import java.util.Scanner;

public class FizzBuzz 
{
    public static void main(String[] args) 
	{
		//Creating Scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking User Input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
		
		//Checking whether the given input is positive or not
        if (number > 0)
		{
			//Iterating from 1 till the number using For Loop
            for (int i = 1; i <= number; i++)
			{
                if (i % 3 == 0 && i % 5 == 0) 
				{
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) 
				{
                    System.out.println("Fizz");
                } else if (i % 5 == 0)
				{
                    System.out.println("Buzz");
                } else
				{
                    System.out.println(i);
                }
            }
        } else 
		{
            System.out.println("Non-Positive Integer");
        }
		//Closing the Scanner Object
        input.close();
    }
}
