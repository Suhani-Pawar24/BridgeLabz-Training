import java.util.Scanner;
public class SplitText
{

    // Method to find length without using length()
    public static int findLength(String str)
	{
        int count = 0;
        while (true)
			{
            try
			{
                str.charAt(count);
                count++;
            } 
			catch (IndexOutOfBoundsException e)
			{
                break;
            }
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] customSplit(String str)
	{
        int length = findLength(str);

        // Step 1: Count words
        int wordCount = 1;
        for (int i = 0; i < length; i++)
			{
            if (str.charAt(i) == ' ') 
			{
                wordCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1;

        for (int i = 0; i < length; i++)
			{
            if (str.charAt(i) == ' ')
			{
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length;

        // Step 3: Extract words
        String[] UserWords = new String[wordCount];
        for (int i = 0; i < wordCount; i++) 
		{
            UserWords[i] = str.substring(spaceIndexes[i] + 1, spaceIndexes[i + 1]);
        }

        return UserWords;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2)
	{
        if (arr1.length != arr2.length) 
		{
            return false;
        }

        for (int i = 0; i < arr1.length; i++) 
		{
            if (!arr1[i].equals(arr2[i]))
			{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
	{

        Scanner input = new Scanner(System.in);

 
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();

       
        String[] UserWords = customSplit(str);

        
        String[] BuiltInWords = str.split(" ");


        boolean result = compareArrays(UserWords, BuiltInWords);

      
        System.out.println("\nWords using custom split:");
        for (String word : UserWords)
		{
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split:");
        for (String word : BuiltInWords) 
		{
            System.out.println(word);
        }

        System.out.println("\nAre both results same? " + result);

        input.close();
    }
}



		