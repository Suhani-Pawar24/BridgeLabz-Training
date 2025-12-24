import java.util.Scanner;
public class DistributeCards
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        int playersCount = sc.nextInt();
        int cardsPerPlayer = sc.nextInt();

        String[][] players = distributeDeck(deck, playersCount, cardsPerPlayer);
        printPlayersCards(players);
    }

    public static String[] initializeDeck(String[] suits, String[] ranks)
    {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (int i = 0; i < suits.length; i++)
        {
            for (int j = 0; j < ranks.length; j++)
            {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        return deck;
    }

    public static String[] shuffleDeck(String[] deck)
    {
        int n = deck.length;

        for (int i = 0; i < n; i++)
        {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

    public static String[][] distributeDeck(String[] deck, int playersCount, int cardsPerPlayer)
    {
        if (playersCount * cardsPerPlayer > deck.length)
        {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0];
        }

        String[][] players = new String[playersCount][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < playersCount; i++)
        {
            for (int j = 0; j < cardsPerPlayer; j++)
            {
                players[i][j] = deck[index++];
            }
        }

        return players;
    }

    public static void printPlayersCards(String[][] players)
    {
        for (int i = 0; i < players.length; i++)
        {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < players[i].length; j++)
            {
                System.out.print(players[i][j]);
                if (j != players[i].length - 1)
                {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
