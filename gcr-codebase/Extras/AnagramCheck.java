import java.util.Scanner;
public class AnagramCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String str1 = sc.nextLine();
        System.out.print("String 2: ");
        String str2 = sc.nextLine();

        boolean result = areAnagrams(str1, str2);

        if (result)
            System.out.println("The strings are anagrams.");
        else
            System.out.println("The strings are not anagrams.");
    }

    public static boolean areAnagrams(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++)
        {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++)
        {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
}
