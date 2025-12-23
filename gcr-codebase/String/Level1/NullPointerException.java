import java.util.*;
public class NullPointerException 
{
	public static void main(String[] args)
	{
		//generateException();
		handleException();
	}
	
	//Method to generate NullPointerException
	public static void generateException()
	{
		String str = null;
		System.out.println(str.length());
	}
	
	//Method to handle NullPointerException
	public static void handleException()
	{
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException handled. ");
		}
	}
}	