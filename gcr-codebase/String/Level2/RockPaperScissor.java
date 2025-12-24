import java.util.Scanner;
public class RockPaperScissor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();

        String[] userChoices = new String[games];
        String[] computerChoices = new String[games];
        String[] winners = new String[games];

        for (int i = 0; i < games; i++)
        {
            userChoices[i] = sc.next();
            computerChoices[i] = getComputerChoice();
            winners[i] = findWinner(userChoices[i], computerChoices[i]);
        }

        String[][] stats = calculateStats(winners);
        displayResults(userChoices, computerChoices, winners, stats);
    }

    public static String getComputerChoice()
    {
        int value = (int)(Math.random() * 3);

        if (value == 0)
        {
            return "rock";
        }
        else if (value == 1)
        {
            return "paper";
        }
        else
        {
            return "scissors";
        }
    }

    public static String findWinner(String user, String computer)
    {
        if (user.equals(computer))
        {
            return "Draw";
        }

        if (user.equals("rock") && computer.equals("scissors"))
        {
            return "User";
        }
        if (user.equals("paper") && computer.equals("rock"))
        {
            return "User";
        }
        if (user.equals("scissors") && computer.equals("paper"))
        {
            return "User";
        }

        return "Computer";
    }

    public static String[][] calculateStats(String[] winners)
    {
        int userWins = 0;
        int computerWins = 0;

        for (int i = 0; i < winners.length; i++)
        {
            if (winners[i].equals("User"))
            {
                userWins++;
            }
            else if (winners[i].equals("Computer"))
            {
                computerWins++;
            }
        }

        int total = winners.length;

        double userPercent = (userWins * 100.0) / total;
        double computerPercent = (computerWins * 100.0) / total;

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(computerPercent);

        return stats;
    }

    public static void displayResults(String[] user, String[] computer, String[] winners, String[][] stats)
    {
        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < winners.length; i++)
        {
            System.out.println((i + 1) + "\t" + user[i] + "\t" + computer[i] + "\t\t" + winners[i]);
        }

        System.out.println();
        System.out.println("Player\tWins\tWin Percentage");

        for (int i = 0; i < stats.length; i++)
        {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }
}
