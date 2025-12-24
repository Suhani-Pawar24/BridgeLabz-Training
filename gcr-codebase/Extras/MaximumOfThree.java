import java.util.Scanner;

public class MaximumOfThree
{
    public static void main(String[] args)
    {
        int a = takeInput("Enter first number: ");
        int b = takeInput("Enter second number: ");
        int c = takeInput("Enter third number: ");

        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    public static int takeInput(String prompt)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int findMax(int a, int b, int c)
    {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
