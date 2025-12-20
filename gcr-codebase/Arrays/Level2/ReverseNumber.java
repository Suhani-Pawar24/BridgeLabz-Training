import java.util.Scanner;
public class ReverseNumber
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = Math.abs(number); 

        //Find the number of digits
        int count = 0;
        int tempCount = temp;
        while (tempCount != 0)
		{
            tempCount /= 10;
            count++;
        }

        //Store digits in an array
        int[] digits = new int[count];
        for (int i = 0; i < count; i++)
		{
            digits[i] = temp % 10; 
            temp /= 10;
        }

        //Display the digits in reverse order (reversing again gives original)
        System.out.print("Reversed number digits: ");
        for (int i = 0; i < count; i++)
		{
            System.out.print(digits[i]);
        }

        input.close();
    }
}
