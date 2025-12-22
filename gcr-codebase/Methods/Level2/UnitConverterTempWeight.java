import java.util.*;
public class UnitConverterTempWeight
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println(fahrenheit + " °F = " + convertFahrenheitToCelsius(fahrenheit) + " °C");

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        System.out.println(celsius + " °C = " + convertCelsiusToFahrenheit(celsius) + " °F");

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println(pounds + " lb = " + convertPoundsToKilograms(pounds) + " kg");

        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();
        System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " lb");

        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        System.out.println(gallons + " gal = " + convertGallonsToLiters(gallons) + " liters");

        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gal");

        input.close();
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) 
	{
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) 
	{
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds)
	{
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms)
	{
        return kilograms * 2.20462;
    }
    public static double convertGallonsToLiters(double gallons) 
	{
        return gallons * 3.78541;
    }
	public static double convertLitersToGallons(double liters) 
	{
        return liters * 0.264172;
    }
}
