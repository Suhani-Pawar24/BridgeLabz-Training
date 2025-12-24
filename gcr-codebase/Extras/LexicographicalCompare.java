import java.util.Scanner;
public class LexicographicalCompare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String str1 = sc.nextLine();
        System.out.print("String 2: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result < 0)
        {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        }
        else if (result > 0)
        {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        }
        else
        {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        }
    }

    public static int compareStrings(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = len1 < len2 ? len1 : len2;

        for (int i = 0; i < minLen; i++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2)
            {
                return c1 - c2;
            }
        }

        return len1 - len2;
    }
}
