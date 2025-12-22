import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker1 
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

    // Method to check if a number is a Duck number 
    public static boolean isDuckNumber(int num)
	{
        int[] digits = storeDigits(num);
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) 
	{
        int[] digits = storeDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits)
		{
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Method to find largest and second largest digits
    public static int[] largestAndSecondLargest(int[] digits) 
	{
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits)
		{
            if (d > largest)
			{
                secondLargest = largest;
                largest = d;
            }
			else if (d > secondLargest && d != largest)
			{
                secondLargest = d;
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int[] digits) 
	{
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits)
		{
            if (d < smallest)
			{
                secondSmallest = smallest;
                smallest = d;
            } 
			else if (d < secondSmallest && d != smallest)
			{
                secondSmallest = d;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));
        System.out.println("Is Armstrong Number: " + isArmstrong(number));
        System.out.println("Largest & Second Largest: " + Arrays.toString(largestAndSecondLargest(digits)));
        System.out.println("Smallest & Second Smallest: " + Arrays.toString(smallestAndSecondSmallest(digits)));

        scanner.close();
    }
}
