import java.util.Scanner;

public class CharacterFrequency2D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] uniqueChars = uniqueCharacters(text);
        String[][] freqData = charFrequency(text, uniqueChars);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < freqData.length; i++)
        {
            System.out.println(freqData[i][0] + "\t\t" + freqData[i][1]);
        }
    }

    public static char[] uniqueCharacters(String text)
    {
        int len = text.length();
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++)
        {
            char c = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < count; j++)
            {
                if (temp[j] == c)
                {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique)
            {
                temp[count] = c;
                count++;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++)
        {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] charFrequency(String text, char[] uniqueChars)
    {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            freq[c]++;
        }

        String[][] data = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++)
        {
            data[i][0] = String.valueOf(uniqueChars[i]);
            data[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return data;
    }
}
