import java.util.Scanner;
public class SubstringOccurrence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sub = sc.nextLine();

        int count = countSubstring(text, sub);
        System.out.println("Substring occurs: " + count + " times");
    }

    public static int countSubstring(String text, String sub)
    {
        int textLen = text.length();
        int subLen = sub.length();
        int count = 0;

        for (int i = 0; i <= textLen - subLen; i++)
        {
            boolean match = true;
            for (int j = 0; j < subLen; j++)
            {
                if (text.charAt(i + j) != sub.charAt(j))
                {
                    match = false;
                    break;
                }
            }
            if (match)
            {
                count++;
            }
        }

        return count;
    }
}
