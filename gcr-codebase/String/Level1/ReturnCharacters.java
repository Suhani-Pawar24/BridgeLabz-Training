import java.util.*;
public class ReturnCharacters
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s1 = input.next();
		char arr[]=returnCharacter(s1);
		
		char[] arr1 = returnCharacter(s1);
		char[] arr2 = builtIn(s1);
		
		if(isCompare(arr1,arr2))
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are different");
		}	
	}
	
	public static char[] returnCharacter(String s1)
	{
		char[] arr1 = new char[s1.length()];
		for(int i = 0; i < s1.length(); i++)
		{
			arr1[i]=s1.charAt(i);
		}
		return arr1;
	}		
			
	public static char[] builtIn(String s1)
	{
		char[] arr2 = new char[s1.length()];
		for(int i = 0; i < s1.length(); i++)
		{
			arr2[i] = s1.charAt(i);
		}
		return arr2;
	}
	
	public static boolean isCompare(char[] arr1, char[] arr2)
	{
		if(arr1.length != arr2.length)
		{
			return false;
		}
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i]!=arr2[i])
			{
				return false;
			}
		}
		return true;
	}
}	
		
		