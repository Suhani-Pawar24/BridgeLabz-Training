import java.util.Scanner;
public class FindUniqueCharacters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int len = getLength(text);
        char[] unique = findUniqueCharacters(text, len);

        System.out.print("Unique Characters: ");
        for (int i = 0; i < unique.length; i++)
        {
            System.out.print(unique[i] + " ");
        }
    }

    public static int getLength(String s)
    {
        int count = 0;
        while (true)
        {
            try
            {
                s.charAt(count);
                count++;
            }
            catch (Exception e)
            {
                break;
            }
        }
        return count;
    }

    public static char[] findUniqueCharacters(String s, int len)
    {
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++)
            {
                if (temp[j] == c)
                {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique)
            {
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++)
        {
            result[i] = temp[i];
        }

        return result;
    }
}
