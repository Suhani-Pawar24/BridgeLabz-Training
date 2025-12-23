import java.util.*;
public class IllegalArgumentExceptions
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.next();
		
		//generateException();
		
		handleException(str);
	}
	public static void generateException(String str)
	{
		int start = 10;
		int end = 2;
		System.out.println(str.substring(start, end));
	}

	public static void handleException(String str)
	{	
		try
		{
			int start = 10;
			int end = 2;
			System.out.println(str.substring(start, end));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException handled. ");
		}
		catch(RuntimeException e)
		{
			System.out.println("RuntimeException handled. ");
		}	
	}
}	