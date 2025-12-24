import java.util.Scanner;
public class FibonacciGenerator
{
    public static void main(String[] args)
    {
        int n = takeInput("Enter number of terms: ");
        System.out.print("Fibonacci Sequence: ");
        printFibonacci(n);
    }

    public static int takeInput(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static void printFibonacci(int n)
    {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
