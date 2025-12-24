import java.util.Scanner;
public class GcdLcmCalculator
{
    public static void main(String[] args)
    {
        int a = takeInput("Enter first number: ");
        int b = takeInput("Enter second number: ");

        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int takeInput(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int findGCD(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int gcd)
    {
        return (a * b) / gcd;
    }
}
