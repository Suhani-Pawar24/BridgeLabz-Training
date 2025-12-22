import java.util.Random;
public class FootballTeam 
{

    // Method to calculate sum of heights
    public static int sumOfHeights(int[] heights)
	{
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    // Method to calculate mean height
    public static double meanHeight(int[] heights)
	{
        return (double) sumOfHeights(heights) / heights.length;
    }

    // Method to find shortest height
    public static int shortestHeight(int[] heights)
	{
        int min = Integer.MAX_VALUE;
        for (int h : heights) min = Math.min(min, h);
        return min;
    }

    // Method to find tallest height
    public static int tallestHeight(int[] heights) 
	{
        int max = Integer.MIN_VALUE;
        for (int h : heights) max = Math.max(max, h);
        return max;
    }

    public static void main(String[] args)
	{
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        System.out.print("Player Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest Height: " + shortestHeight(heights));
        System.out.println("Tallest Height: " + tallestHeight(heights));
        System.out.printf("Mean Height: %.2f\n", meanHeight(heights));
    }
}
