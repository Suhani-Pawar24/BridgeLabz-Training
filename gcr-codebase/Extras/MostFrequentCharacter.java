import java.util.Scanner;
public class MostFrequentCharacter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char mostFrequent = findMostFrequentChar(text);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static char findMostFrequentChar(String text)
    {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            freq[c]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < 256; i++)
        {
            if (freq[i] > max)
            {
                max = freq[i];
                result = (char)i;
            }
        }

        return result;
    }
}
