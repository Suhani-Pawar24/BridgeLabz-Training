import java.util.Scanner;

public class FactorialRecursion
{
    public static void main(String[] args)
    {
        int n = takeInput("Enter a number: ");
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static int takeInput(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static long factorial(int n)
    {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
