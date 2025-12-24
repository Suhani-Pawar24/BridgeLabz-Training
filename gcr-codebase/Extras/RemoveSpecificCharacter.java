import java.util.Scanner;
public class RemoveSpecificCharacter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        String result = removeCharacter(text, ch);
        System.out.println("Result: " + result);
    }

    public static String removeCharacter(String text, char ch)
    {
        char[] chars = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) != ch)
            {
                chars[index++] = text.charAt(i);
            }
        }

        return new String(chars, 0, index);
    }
}
