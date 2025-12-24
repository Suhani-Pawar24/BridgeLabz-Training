import java.util.Scanner;
public class BasicCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();

        double result = 0;
        boolean valid = true;

        switch (choice)
        {
            case 1: result = add(a, b); break;
            case 2: result = subtract(a, b); break;
            case 3: result = multiply(a, b); break;
            case 4: 
                if (b != 0) result = divide(a, b); 
                else {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                }
                break;
            default: 
                System.out.println("Invalid operation.");
                valid = false;
        }

        if (valid)
        {
            System.out.println("Result: " + result);
        }
    }

    public static double add(double x, double y)
    {
        return x + y;
    }

    public static double subtract(double x, double y)
    {
        return x - y;
    }

    public static double multiply(double x, double y)
    {
        return x * y;
    }

    public static double divide(double x, double y)
    {
        return x / y;
    }
}
