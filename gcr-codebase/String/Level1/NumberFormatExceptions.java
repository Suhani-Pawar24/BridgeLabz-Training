import java.util.*;
public class NumberFormatExceptions
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
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

	public static void handleException(String str)
	{
		try
		{
			int num = Integer.parseInt(str);
			System.out.println(num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException handled.");
		}
		catch(RuntimeException e)
		{
			System.out.println("RuntimeException handled.");
		}	
	}
}	
	
		