import java.util.*;
public class NumberGuessingGame 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        int guess = (int)(Math.random() * 100) + 1;
        int attempt = 0;
        boolean isGuessed = false;

        do
		{
            System.out.println("Enter a number between 1 to 100:");
            int number = input.nextInt();

            if(number > guess) 
			{
                System.out.println("Try a smaller number");
                attempt++;
            }
            else if(number < guess)
			{
                System.out.println("Try a larger number");
                attempt++;
            }
            else
			{
                System.out.println("You guessed it correct!");
                attempt++;
                isGuessed = true;
                break;
            }
        } while(attempt < 5);

        if(!isGuessed) 
		{
            System.out.println("You are out of moves! The number was: " + guess);
        }

        input.close();
    }
}
	
	
	
	
		