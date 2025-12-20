import java.util.Scanner;
public class LargestDigitsDynamic 
{
    public static void main(String[] args)
	{
		//Creating Scanner Object
        Scanner input = new Scanner(System.in);

        //Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Initialize array and variables
        int maxDigit = 10;           
        int[] digits = new int[maxDigit];
        int index = 0;

        //Extract digits and store in array dynamically
        int temp = number;
        while (temp != 0)
		{
            //If index reaches maxDigit, increase array size manually
            if (index == maxDigit)
			{
                maxDigit += 10;                  
                int[] tempArray = new int[maxDigit]; 
                for (int i = 0; i < index; i++) 
				{
                    tempArray[i] = digits[i];
                }
                digits = tempArray;               
            }

            int lastDigit = temp % 10;
            digits[index] = lastDigit;
            index++;
            temp /= 10;
        }

        //Initialize largest and second largest
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
		//Closing the Scanner Object
        input.close();
    }
}

