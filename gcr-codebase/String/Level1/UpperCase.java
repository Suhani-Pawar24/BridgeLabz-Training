import java.util.*;
public class UpperCase
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = input.nextLine();
		
		String builtInMethod = str1.toUpperCase();
		String UserDefined = userDefinedUpperCase(str1);
		
		boolean areSame = compareStrings(builtInMethod, UserDefined);
		
		if(areSame)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are different");
		}	
		
	}

	public static String userDefinedUpperCase(String str1)
	{
		String str2 = "";
		for(int i = 0; i < str1.length(); i++)
		{
			char ch = str1.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				ch = (char) (ch - 32);
			}
			str2 += ch;
		}
		return str2;
	}

	public static boolean compareStrings(String str1 , String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		for( int i = 0; i < str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				return false;
				
			}
		}
		return true;
	}
}	