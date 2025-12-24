import java.util.*;
public class PalindromeCheck
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		if(str.equals(isPalindrome(str)))
		{	
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}
	
	public static String isPalindrome(String str)
	{
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--)
		{
			reverse += str.charAt(i);
		}
		return reverse;
	}
}
	