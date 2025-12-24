import java.util.Scanner;
public class FindFrequency
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] freqData = findCharFrequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < freqData.length; i++)
        {
            System.out.println(freqData[i][0] + "\t\t" + freqData[i][1]);
        }
    }

    public static String[][] findCharFrequency(String text)
    {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            freq[c]++;
        }

        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++)
            {
                if (text.charAt(j) == c)
                {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted)
            {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            boolean alreadyStored = false;

            for (int j = 0; j < i; j++)
            {
                if (text.charAt(j) == c)
                {
                    alreadyStored = true;
                    break;
                }
            }

            if (!alreadyStored)
            {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                index++;
            }
        }

        return result;
    }
}
