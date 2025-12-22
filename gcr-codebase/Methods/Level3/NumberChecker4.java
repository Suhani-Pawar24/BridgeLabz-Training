import java.util.Scanner;
public class NumberChecker4
{

    // Check if a number is prime
    public static boolean isPrime(int num) 
	{
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++)
		{
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check if a number is neon
    public static boolean isNeon(int num)
	{
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Check if a number is a spy number
    public static boolean isSpy(int num)
	{
        int sum = 0;
        int product = 1;
        int temp = num;
        while (temp > 0) 
		{
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Check if a number is automorphic
    public static boolean isAutomorphic(int num) 
	{
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Check if a number is buzz
    public static boolean isBuzz(int num)
	{
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
        System.out.println("Is Spy: " + isSpy(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz: " + isBuzz(number));

        scanner.close();
    }
}
