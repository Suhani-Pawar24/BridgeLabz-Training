import java.util.Scanner;
public class WordLengthTable 
{

	public static int stringLength(String s)
	{
        int count = 0;
        try
		{
            while (true) 
			{
                s.charAt(count);
                count++;
            }
        }
		catch (Exception e) 
		{
        }
        return count;
    }

    public static int countWords(String text)
	{
        int count = 0;
        boolean inWord = false;
        int i = 0;
        try 
		{
            while (true) 
			{
                char c = text.charAt(i);
                if (c != ' ' && !inWord)
				{
                    count++;
                    inWord = true;
                }
                if (c == ' ') 
				{
                    inWord = false;
                }
                i++;
            }
        } 
		catch (Exception e) 
		{
        }
        return count;
    }

    public static String[] splitWords(String text) 
	{
        int wordCount = countWords(text);
        String[] words = new String[wordCount];
        int index = 0;
        String current = "";
        int i = 0;

        try 
		{
            while (true)
			{
                char c = text.charAt(i);
                if (c != ' ')
				{
                    current = current + c;
                }
				else
				{
                    if (stringLength(current) > 0) 
					{
                        words[index++] = current;
                        current = "";
                    }
                }
                i++;
            }
        }
		catch (Exception e) 
		{
            if (stringLength(current) > 0) 
			{
                words[index] = current;
            }
        }
        return words;
    }

    public static String[][] wordLengthTable(String[] words) 
	{
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++)
		{
            table[i][0] = words[i];
            table[i][1] = String.valueOf(stringLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] table = wordLengthTable(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) 
		{
            int len = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + len);
        }
    }
}
