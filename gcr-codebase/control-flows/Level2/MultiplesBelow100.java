import java.util.*;

public class MultiplesBelow100
{
    public static void main(String[] args)
	{
		//Creating a Scanner Object
        Scanner input = new Scanner(System.in);
		
		//Taking User Input
        System.out.println("Enter a positive integer less than 100: ");
        int number = input.nextInt();
		
		//Checking whether the user Input is less than 100 or not
        if(number > 0 && number < 100)
		{
            System.out.println("Multiples of " + number + " below 100 are:");
            
            // Loop backward from 100 to 1
            for(int i = 100; i >= 1; i--) 
			{
                if(i % number == 0) 
				{  // Check if i is a multiple of number
                    System.out.println(i);
                }
            }
        } else
		{
            System.out.println("Please enter a positive integer less than 100.");
        }
		//Closing the Scanner Object
        input.close();
    }
}
