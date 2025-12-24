import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        playGame(sc);
    }

    public static void playGame(Scanner sc)
    {
        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        do
        {
            guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it high (h), low (l), or correct (c)? ");
            feedback = sc.nextLine();

            if (feedback.equalsIgnoreCase("h"))
            {
                high = guess - 1;
            }
            else if (feedback.equalsIgnoreCase("l"))
            {
                low = guess + 1;
            }

        } while (!feedback.equalsIgnoreCase("c"));

        System.out.println("Computer guessed your number: " + guess);
    }

    public static int generateGuess(int low, int high)
    {
        Random r = new Random();
        return low + r.nextInt(high - low + 1);
    }
}
