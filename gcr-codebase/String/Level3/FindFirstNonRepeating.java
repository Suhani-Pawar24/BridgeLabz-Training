import java.util.Scanner;
public class FindFirstNonRepeating
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char firstNonRepeat = findFirstNonRepeatingChar(text);

        if (firstNonRepeat == 0)
        {
            System.out.println("No non-repeating character found");
        }
        else
        {
            System.out.println("First non-repeating character: " + firstNonRepeat);
        }
    }

    public static char findFirstNonRepeatingChar(String text)
    {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            freq[c]++;
        }

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (freq[c] == 1)
            {
                return c;
            }
        }

        return 0;
    }
}
