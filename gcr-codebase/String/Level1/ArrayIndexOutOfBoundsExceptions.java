import java.util.*;
public class ArrayIndexOutOfBoundsExceptions
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] str = new String[5];
		
		for(int i = 0; i < str.length; i++)
		{
			System.out.println("Enter string " +(i+1)+ ": ");
			str[i] = input.next();
		}	
		
		//generateException();
		
		handledException(str);
	}
	
	public static void generateException(String[] str)
	{
		System.out.println(str[7]);
	}

	public static void handledException(String[] str)
	{
		try
		{
			System.out.println(str[7]);
		}
		 catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException handled.");
        }
        catch(RuntimeException e)
        {
            System.out.println("RuntimeException handled.");
        }
    }
}	