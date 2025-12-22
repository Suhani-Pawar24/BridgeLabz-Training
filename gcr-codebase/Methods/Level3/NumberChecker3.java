import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker3 {

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

    // Method to reverse a digits array
    public static int[] reverseArray(int[] digits)
	{
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) 
		{
            reversed[i] = digits[n - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) 
	{
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++)
		{
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num)
	{
        int[] digits = storeDigits(num);
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
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
	
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = storeDigits(number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Reversed digits: " + Arrays.toString(reverseArray(digits)));
        System.out.println("Is Palindrome: " + isPalindrome(number));
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        scanner.close();
    }
}
