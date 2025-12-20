import java.util.Scanner;
public class DigitFrequency
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = Math.abs(number); // Handle negative numbers

        // Find number of digits
        int count = 0;
        int tempCount = temp;
        while (tempCount != 0) 
		{
            tempCount /= 10;
            count++;
        }

        // Store digits in an array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) 
		{
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Array to store frequency of digits 0-9
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) 
		{
            frequency[digits[i]]++;
        }

        // Display frequency of each digit
        System.out.println("\nDigit\tFrequency");
        for (int i = 0; i < 10; i++)
		{
            if (frequency[i] > 0) 
			{
                System.out.println(i + "\t" + frequency[i]);
            }
        }

        input.close();
    }
}
