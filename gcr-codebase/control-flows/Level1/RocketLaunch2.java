import java.util.*;
public class RocketLaunch2
{
	public static void main(String[]args)
  {
	// Creating Scanner class object
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	int counter = sc.nextInt();
	
	//Countdown using for-loop
	for(int i = counter ; i >= 1 ; i=i-1)
	{
		System.out.println(i);
	}
  }
}  