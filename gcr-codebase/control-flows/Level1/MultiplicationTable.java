import java.util.Scanner;
public class MultiplicationTable
{
    public static void main(String[] args)
	{
		//Creating Scanner Object
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if number is between 6 and 9
        if (number >= 6 && number <= 9)
		{

            // Printing multiplication table
            for (int i = 1; i <= 10; i++)
			{
                System.out.println(number + " * " + i + " = " + (number * i));
            }

        } else
		{
            System.out.println("Please enter a number between 6 and 9 only.");
        }
		//Closing the Scanner object
        input.close();
    }
}

