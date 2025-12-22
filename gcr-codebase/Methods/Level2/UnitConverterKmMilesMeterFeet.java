import java.util.*;
public class UnitConverter
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter distance in km: ");
		double km = input.nextDouble();
		
		System.out.println("Enter distance in miles: ");
		double miles = input.nextDouble();
		
		System.out.println("Enter distance in meters: ");
		double meters = input.nextDouble();
		
		System.out.println("Enter distance in feet: ");
		double feet = input.nextDouble();
		
		double km2Miles = UnitConverter.convertKmToMiles(km);
		System.out.println("Distance in miles " + km2Miles);
		
		double miles2Km = UnitConverter.convertMilesToKm(miles);
		System.out.println("Distance in km " + miles2Km);
		
		double meters2Feet = UnitConverter.convertMeters2Feet(meters);
		System.out.println("Distance in feet " + meters2Feet);
		
		double feet2Meters = UnitConverter.convertFeet2Meters(feet);
		System.out.println("Distance in meters " + feet2Meters);
		
		input.close();
	}
	
	public static double convertKmToMiles(double km) 
	{
		double km2miles = 0.621371;
		double miles = km * km2miles;
		return miles;
	}	
	public static double convertMilesToKm(double miles) 
	{
		double miles2km = 1.60934;
		double km = miles * miles2km;
		return km;
	}
	public static double convertMeters2Feet(double meters) 
	{
		double meters2feet = 3.28084;
		double feet = meters * meters2feet;
		return feet;
	}
	public static double convertFeet2Meters(double feet) 
	{
		double feet2meters = 0.3048;
		double meters = feet * feet2meters ;
		return  meters;
	}
}
	
	