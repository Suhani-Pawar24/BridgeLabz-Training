import java.util.Scanner;
public class FindVowelsAndConsonants
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] result = countVowelsAndConsonants(text);

        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }

    public static int checkCharacter(char c)
    {
        if (c >= 65 && c <= 90)
        {
            c = (char)(c + 32);
        }

        if (c >= 97 && c <= 122)
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                return 1;
            }
            else
            {
                return 2;
            }
        }
        return 0;
    }

    public static int[] countVowelsAndConsonants(String text)
    {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++)
        {
            int result = checkCharacter(text.charAt(i));

            if (result == 1)
            {
                vowels++;
            }
            else if (result == 2)
            {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }
}
