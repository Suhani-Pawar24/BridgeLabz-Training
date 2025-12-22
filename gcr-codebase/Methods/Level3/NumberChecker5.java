import java.util.Scanner;
public class NumberChecker5 
{

    // Method to calculate sum of proper divisors of a number
    public static int sumOfProperDivisors(int num) 
	{
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int num) 
	{
        if (num <= 0) return false;
        return sumOfProperDivisors(num) == num;
    }

    // Method to check if a number is abundant
    public static boolean isAbundant(int num) 
	{
        if (num <= 0) return false;
        return sumOfProperDivisors(num) > num;
    }

    // Method to check if a number is deficient
    public static boolean isDeficient(int num)
	{
        if (num <= 0) return false;
        return sumOfProperDivisors(num) < num;
    }

    // Method to calculate factorial
    public static int factorial(int n)
	{
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int num)
	{
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number: " + isPerfect(number));
        System.out.println("Is Abundant Number: " + isAbundant(number));
        System.out.println("Is Deficient Number: " + isDeficient(number));
        System.out.println("Is Strong Number: " + isStrong(number));

        scanner.close();
    }
}
