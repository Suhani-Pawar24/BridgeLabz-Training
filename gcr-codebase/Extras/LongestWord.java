import java.util.Scanner;
public class LongestWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String longest = findLongestWord(sentence);
        System.out.println("Longest word: " + longest);
    }

    public static String findLongestWord(String sentence)
    {
        int start = 0 
		maxLen = 0;
        String longest = "";
        sentence = sentence + " ";

        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.charAt(i) == ' ')
            {
                int len = i - start;
                if (len > maxLen)
                {
                    maxLen = len;
                    longest = "";
                    for (int j = start; j < i; j++)
                    {
                        longest += sentence.charAt(j);
                    }
                }
                start = i + 1;
            }
        }

        return longest;
    }
}
