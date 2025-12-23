import java.util.Scanner;
public class StringIndexOutOfBounds
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        // generateException(str);

        // Call method to handle the RuntimeException
        handleException(str);
    }

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str)
    {
        for (int i = 0; i <= str.length(); i++)
        {
            System.out.println(str.charAt(i)); 
        }
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str)
    {
        try
        {
            for (int i = 0; i <= str.length(); i++)
            {
                System.out.println(str.charAt(i));
            }
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled.");
        }
    }
}

	
	