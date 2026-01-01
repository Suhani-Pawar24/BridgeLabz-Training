/*15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.*/

import java.util.*;
public class ReminderApp
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		final int FINE_PER_DAY = 5;
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Enter return date : ");	
			int returnDate = input.nextInt();
			System.out.println("Enter due date : ");
			int dueDate = input.nextInt();
			
			if(returnDate > dueDate)
			{
				int lateDays = returnDate - dueDate;
				int fine = lateDays * FINE_PER_DAY;
				System.out.println("Late by " + lateDays + " days");
				System.out.println("Fine Amount "+fine);
			}
			else
			{
				System.out.println("Returned on time.No fine ");
			}
		}
	}	
}	
			
			