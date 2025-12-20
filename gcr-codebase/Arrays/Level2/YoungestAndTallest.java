import java.util.Scanner;
public class YoungestAndTallest 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] friends = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input loop
        for (int i = 0; i < 3; i++)
		{
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        // Finding youngest
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) 
		{
            if (ages[i] < ages[youngestIndex]) 
			{
                youngestIndex = i;
            }
        }

        // Finding tallest
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) 
		{
            if (heights[i] > heights[tallestIndex])
			{
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest friend: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

        sc.close();
    }
}
