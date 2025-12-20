import java.util.*;
public class MeanHeight
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double[] heights = new double[11];
		double sum = 0;
		System.out.println("Enter values : ");
		
		for(int i = 0; i < heights.length ; i++)
		{
			heights[i] = input.nextDouble();
			sum+=heights[i];
		}
		double mean = sum / 11;
		System.out.println(mean);
    }
}	
			