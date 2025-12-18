import java.util.*;
public class PowerOfNumber
{
    public static void main(String[] args)
	{
		//Creating a Scanner Object
        Scanner input = new Scanner(System.in);
		
		//Taking base number and power as user Input
        System.out.println("Enter the base number (positive integer): ");
        int number = input.nextInt();
        System.out.println("Enter the power (positive integer): ");
        int power = input.nextInt();
		
		//Checking whether number and power is positive integer or not
        if(number > 0 && power >= 0)
		{
			//Initialize result by 1
            int result = 1;  

            for(int i = 1; i <= power; i++)
			{
                result *= number;  
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        } 
		else
		{
            System.out.println("Please enter positive integers for both number and power.");
        }
		
		//Closing the Scanner Object
        input.close();
    }
}
