import java.util.Scanner;
public class StringLength
{
	// User-defined method to find string length 
    public static int findLength(String str)
	{
        int count = 0;
		
        while(true)
		{
            try 
			{
                str.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e)
			{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        int userDefinedLength = findLength(str);

        int builtInLength = str.length();

        // Displaying results
        System.out.println("Length without using length(): " + userDefinedLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        input.close();
    }
}

			
		