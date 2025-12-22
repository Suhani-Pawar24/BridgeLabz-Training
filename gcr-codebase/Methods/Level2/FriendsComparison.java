import java.util.Scanner;
public class FriendsComparison
{

    // method to find youngest friend
    public static int findYoungest(int[] ages)
	{
        int youngestIndex = 0;

        for (int i = 1; i < ages.length; i++) 
		{
            if (ages[i] < ages[youngestIndex]) 
			{
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // method to find tallest friend
    public static int findTallest(int[] heights)
	{
        int tallestIndex = 0;

        for (int i = 1; i < heights.length; i++)
		{
            if (heights[i] > heights[tallestIndex]) 
			{
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++)
		{
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = input.nextInt();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("\nYoungest friend is: " + names[youngest]);
        System.out.println("Tallest friend is: " + names[tallest]);

        input.close();
    }
}
