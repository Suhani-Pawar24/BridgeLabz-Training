import java.util.Scanner;
public class RecursivePalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeUsingArray(text);

        System.out.println("Palindrome check using Iterative method: " + result1);
        System.out.println("Palindrome check using Recursive method: " + result2);
        System.out.println("Palindrome check using Char Array method: " + result3);
    }

    public static boolean isPalindromeIterative(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        while (start < end)
        {
            if (text.charAt(start) != text.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end)
    {
        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingArray(String text)
    {
        int len = text.length();
        char[] original = new char[len];
        char[] reversed = new char[len];

        for (int i = 0; i < len; i++)
        {
            original[i] = text.charAt(i);
            reversed[len - i - 1] = text.charAt(i);
        }

        for (int i = 0; i < len; i++)
        {
            if (original[i] != reversed[i])
                return false;
        }

        return true;
    }
}
