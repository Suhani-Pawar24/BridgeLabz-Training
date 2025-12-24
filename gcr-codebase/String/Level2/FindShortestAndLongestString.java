import java.util.Scanner;
public class FindShortestAndLongestString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordWithLength = mapWordWithLength(words);
        int[] result = findShortestAndLongest(wordWithLength);

        System.out.println("Shortest word: " + wordWithLength[result[0]][0]);
        System.out.println("Longest word: " + wordWithLength[result[1]][0]);
    }

    public static String[] splitText(String text)
    {
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; ; i++)
        {
            try
            {
                char c = text.charAt(i);
                if (c != ' ' && !inWord)
                {
                    wordCount++;
                    inWord = true;
                }
                if (c == ' ')
                {
                    inWord = false;
                }
            }
            catch (Exception e)
            {
                break;
            }
        }

        String[] words = new String[wordCount];
        String current = "";
        int index = 0;

        for (int i = 0; ; i++)
        {
            try
            {
                char c = text.charAt(i);
                if (c == ' ')
                {
                    if (!current.equals(""))
                    {
                        words[index++] = current;
                        current = "";
                    }
                }
                else
                {
                    current = current + c;
                }
            }
            catch (Exception e)
            {
                if (!current.equals(""))
                {
                    words[index] = current;
                }
                break;
            }
        }
        return words;
    }

    public static int getStringLength(String s)
    {
        int count = 0;
        for (int i = 0; ; i++)
        {
            try
            {
                s.charAt(i);
                count++;
            }
            catch (Exception e)
            {
                break;
            }
        }
        return count;
    }

    public static String[][] mapWordWithLength(String[] words)
    {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++)
        {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return data;
    }

    public static int[] findShortestAndLongest(String[][] data)
    {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++)
        {
            int current = Integer.parseInt(data[i][1]);
            int min = Integer.parseInt(data[minIndex][1]);
            int max = Integer.parseInt(data[maxIndex][1]);

            if (current < min)
            {
                minIndex = i;
            }
            if (current > max)
            {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
}
