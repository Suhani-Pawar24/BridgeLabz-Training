import java.util.Scanner;
public class LeadingAndTrailingSpace
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] points = findTrimPoints(text);
        String trimmedByUser = createSubstring(text, points[0], points[1]);
        String trimmedByBuiltIn = text.trim();

        boolean isSame = compareStrings(trimmedByUser, trimmedByBuiltIn);

        System.out.println("Trimmed String: " + trimmedByUser);
        System.out.println("Are both strings equal: " + isSame);
    }

    public static int[] findTrimPoints(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ')
        {
            start++;
        }

        while (end >= 0 && text.charAt(end) == ' ')
        {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end)
    {
        String result = "";

        for (int i = start; i <= end; i++)
        {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String s1, String s2)
    {
        if (s1.length() != s2.length())
        {
            return false;
        }

        for (int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
            {
                return false;
            }
        }

        return true;
    }
}
