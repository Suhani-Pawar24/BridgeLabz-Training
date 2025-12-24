import java.util.Scanner;
public class ToggleCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String toggled = toggleCase(text);
        System.out.println("Toggled case: " + toggled);
    }

    public static String toggleCase(String text)
    {
        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++)
        {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z')
            {
                chars[i] = (char)(c + 32);
            }
            else if (c >= 'a' && c <= 'z')
            {
                chars[i] = (char)(c - 32);
            }
            else
            {
                chars[i] = c;
            }
        }

        return new String(chars);
    }
}
