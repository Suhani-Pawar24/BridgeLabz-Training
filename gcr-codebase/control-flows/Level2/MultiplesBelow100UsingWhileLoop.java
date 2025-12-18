import java.util.*;

public class MultiplesBelow100UsingWhileLoop
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        if(number > 0 && number < 100)
		{ 
            System.out.println("Multiples of " + number + " below 100 are:");
			int counter = number - 1;
			
			while(counter > 1)
            {
                if(number % counter == 0)
				{  
				// Check if i is a multiple of number
                    System.out.println(counter);
                }
			counter--;	
            }
        } 
		else
		{
            System.out.println("Please enter a positive integer less than 100.");
        }

        input.close();
    }
}
