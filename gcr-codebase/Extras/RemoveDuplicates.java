import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String result = removeDuplicates(text);
        System.out.println("After removing duplicates: " + result);
    }

    public static String removeDuplicates(String text)
    {
        char[] chars = text.toCharArray();
        int len = chars.length;
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++)
        {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++)
            {
                if (temp[j] == chars[i])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate)
            {
                temp[index++] = chars[i];
            }
        }

        return new String(temp, 0, index);
    }
}
