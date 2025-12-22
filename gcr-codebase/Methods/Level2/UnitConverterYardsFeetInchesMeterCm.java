import java.util.*;
public class UnitConverterYardsFeetInchesMeterCm 
{

    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();

        System.out.print("Enter distance in inches: ");
        double inches = input.nextDouble();

        System.out.println(yards + " yards = " + convertYards2Feet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeet2Yards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMeters2Inches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInches2Meters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInches2Centimeters(inches) + " cm");

        input.close();
    }

    public static double convertYards2Feet(double yards)
	{
        return yards * 3;
    }

    public static double convertFeet2Yards(double feet)
	{
        return feet * 0.333333;
    }

    public static double convertMeters2Inches(double meters)
	{
        return meters * 39.3701;
    }

    public static double convertInches2Meters(double inches)
	{
        return inches * 0.0254;
    }

    public static double convertInches2Centimeters(double inches) 
	{
        return inches * 2.54;
    }
}
	
	
