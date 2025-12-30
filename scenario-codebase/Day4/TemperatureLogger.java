import java.util.*;
public class TemperatureLogger
{
	public static void main(String[] args)
	{	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter temperature of 7 days: ");
			double[] arr = new double[7];
			double total = 0.0;
			double average = 0.0;
			for(int i = 0; i < arr.length; i++)
			{
				arr[i] = input.nextDouble();
				total += arr[i];
			}
			average = (total / 7.0);
			double max = arr[0];
			for(int i = 0; i < arr.length; i++)
			{
				if(max < arr[i])
				{
					arr[i] = max;
				}
			}
		average = (total / 7.0);
		System.out.println("Average temperature : "+average);
		System.out.println("Max Temperature : "+max);
		
	}
}	
			