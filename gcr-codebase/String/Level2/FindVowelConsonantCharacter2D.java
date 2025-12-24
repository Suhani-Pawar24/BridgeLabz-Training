import java.util.Scanner;
public class FindVowelConsonantCharacter2D
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] result = analyzeString(text);
        displayTable(result);
    }

    public static String checkCharacter(char c)
    {
        if (c >= 65 && c <= 90)
        {
            c = (char)(c + 32);
        }

        if (c >= 97 && c <= 122)
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                return "Vowel";
            }
            else
            {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static String[][] analyzeString(String text)
    {
        String[][] data = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            data[i][0] = String.valueOf(c);
            data[i][1] = checkCharacter(c);
        }

        return data;
    }

    public static void displayTable(String[][] data)
    {
        System.out.println("Character\tType");

        for (int i = 0; i < data.length; i++)
        {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
}
