import java.util.Scanner;
public class LargestDigits
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //Initializing array and variables
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        //Extract digits and store in array
        int temp = number;
        while (temp != 0) 
		{
            int lastDigit = temp % 10;  
            digits[index] = lastDigit; 
            index++;

            if (index == maxDigit)
			{    
                break;
            }

            temp /= 10;                
        }

        // Initialize largest and second largest variable to 0
        int largest = 0;
        int secondLargest = 0;

        //Find largest and second largest
        for (int i = 0; i < index; i++)
		{
            if (digits[i] > largest)
			{
                secondLargest = largest; 
                largest = digits[i];
            }
			else if (digits[i] > secondLargest && digits[i] != largest)
			{
                secondLargest = digits[i];
            }
        }

        //Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
