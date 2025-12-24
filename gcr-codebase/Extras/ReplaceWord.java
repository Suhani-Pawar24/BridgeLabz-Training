import java.util.Scanner;
public class ReplaceWord
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Word to replace: ");
        String oldWord = sc.nextLine();
        System.out.print("New word: ");
        String newWord = sc.nextLine();

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Result: " + result);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord)
    {
        String result = "";
        int i = 0;

        while (i < sentence.length())
        {
            boolean match = true;
            if (i + oldWord.length() <= sentence.length())
            {
                for (int j = 0; j < oldWord.length(); j++)
                {
                    if (sentence.charAt(i + j) != oldWord.charAt(j))
                    {
                        match = false;
                        break;
                    }
                }
            }
            else
            {
                match = false;
            }

            if (match)
            {
                result += newWord;
                i += oldWord.length();
            }
            else
            {
                result += sentence.charAt(i);
                i++;
            }
        }

        return result;
    }
}
