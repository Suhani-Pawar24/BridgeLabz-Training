import java.util.*;
public class ReverseString
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println(reverseString(str));
		
	}

	public static String reverseString(String str)
	{
		String temp = str;
		String reverse = "";
		for(int i = temp.length() - 1; i >= 0; i--)
		{
			reverse += temp.charAt(i);
		}
		return reverse; 
	}
}	