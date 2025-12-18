import java.util.*;
public class RocketLaunch
{
	public static void main(String[]args)
	{
	// Creating Scanner class object
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	int counter = sc.nextInt();
	
		while(counter>0)
		{
			System.out.println(counter);
			counter--;
		}
		
	sc.close();
	}
}