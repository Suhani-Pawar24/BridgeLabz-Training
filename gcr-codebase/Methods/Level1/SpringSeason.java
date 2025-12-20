import java.util.*;
public class SpringSeason
{
	public boolean season(int month, int day)
	{
		// Condition check
		if(month==3 && (day>=20 && day<=31) || 	month==4 && (day>=1 && day<=30) ||
			month==5 && (day>=1 && day<=31) || month==6 && (day>=1 && day<=20))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}	
	public static void main(String[]args)
	{
		// Creating Scanner Object
		Scanner sc = new Scanner(System.in);
		
		//Taking User Input
		System.out.println("Enter the number of month : ");
		int month = sc.nextInt();
		System.out.println("Enter day : ");
		int day = sc.nextInt();
		
		SpringSeason obj = new SpringSeason();
		boolean result = obj.season(month, day);
		// Condition check
		if(result == true )
		{
			System.out.println("Its a spring season");
		}
		else
		{
			System.out.println("Not a Spring Season");
		}	
	}
}	