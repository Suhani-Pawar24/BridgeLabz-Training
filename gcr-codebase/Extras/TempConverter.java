import java.util.Scanner;
public class TempConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1)
        {
            double f = celsiusToFahrenheit(temp);
            System.out.println(temp + " °C = " + f + " °F");
        }
        else if (choice == 2)
        {
            double c = fahrenheitToCelsius(temp);
            System.out.println(temp + " °F = " + c + " °C");
        }
        else
        {
            System.out.println("Invalid choice.");
        }
    }

    public static double celsiusToFahrenheit(double c)
    {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f)
    {
        return (f - 32) * 5/9;
    }
}
