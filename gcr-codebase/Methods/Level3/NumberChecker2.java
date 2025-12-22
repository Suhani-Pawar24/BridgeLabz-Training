import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker2
{

    // Method to count digits in a number
    public static int countDigits(int num) 
	{
        return String.valueOf(Math.abs(num)).length();
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int num) 
	{
        num = Math.abs(num);
        int n = countDigits(num);
        int[] digits = new int[n];
        for (int i = n - 1; i >= 0; i--) 
		{
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) 
	{
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) 
	{
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int num, int[] digits)
	{
        int sum = sumOfDigits(digits);
        return sum != 0 && num % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int[] digits)
	{
        int[][] freq = new int[10][2]; 
        for (int i = 0; i < 10; i++) freq[i][0] = i;

        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++)
		{
            if (freq[i][1] > 0) 
			{
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
            }
        }

        scanner.close();
    }
}
