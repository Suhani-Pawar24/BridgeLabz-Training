import java.util.Scanner;
public class PrimeNumberChecker
{
    public static void main(String[] args)
    {
        int num = takeInput("Enter a number: ");
        if (isPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static int takeInput(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++)
        {
            if (n % i == 0) return false;
        }
        return true;
    }
}
