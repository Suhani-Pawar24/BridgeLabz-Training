import java.util.*;
public class FitnessTracker
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int[] pushUps = new int[7];
		int count = 0;
		
		System.out.println("Enter total push-ups");
		for(int i = 0; i < 7; i++)
		{
			if(days[i].equals("Sunday"))
			{
				System.out.println("Rest Day");
				continue;
			}
			else
			{
				pushUps[i] = input.nextInt();
				count += pushUps[i];
			}
		}
		double average = (double)count /7;
				
		// Printing the results
		System.out.println("\n------- Sandeep’s Fitness Challenge Tracker 🏋 -------");
        System.out.printf("%-5s %-15s %-10s%n", "No", "Days", "push-ups");
        System.out.println("---------------------------------------------");

        for(int i = 0; i < 7; i++) 
		{
            System.out.printf("%-5d %-15s %-10s%n",(i+1), days[i], pushUps[i]);
        }
		System.out.println("---------------------------------------------");
		System.out.println("---------------- Total push-ups: "+count);
		System.out.println("---------------- Average : "+average);
	}
}