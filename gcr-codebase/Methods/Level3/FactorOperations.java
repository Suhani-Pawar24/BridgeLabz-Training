import java.util.Scanner;
import java.util.Arrays;
public class FactorOperations
{

    // Method to find factors of a number
    public static int[] findFactors(int num) 
	{
        // First, count the number of factors
        int count = 0;
        for (int i = 1; i <= num; i++) 
		{
            if (num % i == 0) count++;
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) 
		{
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors)
	{
        int max = Integer.MIN_VALUE;
        for (int f : factors) max = Math.max(max, f);
        return max;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors)
	{
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors)
	{
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to find the product of the cube of factors
    public static long productOfCubeFactors(int[] factors)
	{
        long product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubeFactors(factors));

        scanner.close();
    }
}
