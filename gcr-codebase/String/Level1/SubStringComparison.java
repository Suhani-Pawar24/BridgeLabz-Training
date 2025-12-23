import java.util.*;
public class SubStringComparison
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = input.next();
		
		System.out.println("Enter starting index: ");
		int start = input.nextInt();
		
		System.out.println("Enter ending index: ");
		int end = input.nextInt();
		
		String subStringUsingCharAt = subString(str, start, end);
		String subStringUsingBuiltIn = str.substring(start, end);
		
		boolean isSame = compareTwoStrings(subStringUsingCharAt, subStringUsingBuiltIn);
		
		System.out.println("SubString Using charAt : " + subStringUsingCharAt);
		System.out.println("SubString Using Built In : "+ subStringUsingBuiltIn);
		System.out.println(isSame);
		
		input.close();
		
	}
	public static String subString(String str, int start, int end)
	{	
		String result = "";
		for(int i = start; i < end; i++)
		{
			result = result + str.charAt(i);
		}
		 return result;
	}
	public static boolean compareTwoStrings(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
}	
			