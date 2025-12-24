import java.util.Scanner;
public class PalindromeChecker
{
    public static void main(String[] args)
    {
        String text = takeInput("Enter a string: ");
        if (isPalindrome(text))
            System.out.println(text + " is a palindrome.");
        else
            System.out.println(text + " is not a palindrome.");
    }

    public static String takeInput(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static boolean isPalindrome(String s)
    {
        int start = 0;
        int end = s.length() - 1;
        while (start < end)
        {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
