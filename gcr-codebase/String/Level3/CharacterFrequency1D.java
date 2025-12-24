import java.util.Scanner;

public class CharacterFrequency1D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] freqData = findFrequency(text);

        System.out.println("Character : Frequency");

        for (int i = 0; i < freqData.length; i++)
        {
            System.out.println(freqData[i]);
        }
    }

    public static String[] findFrequency(String text)
    {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++)
        {
            if (chars[i] == '0')
                continue;

            freq[i] = 1;

            for (int j = i + 1; j < len; j++)
            {
                if (chars[i] == chars[j])
                {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++)
        {
            if (chars[i] != '0')
                count++;
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < len; i++)
        {
            if (chars[i] != '0')
            {
                result[index] = chars[i] + " : " + freq[i];
                index++;
            }
        }

        return result;
    }
}
