import java.util.Scanner;
public class YoungestFriend 
{
    public static void main(String[] args) 
	{
		//Creating Scanner Object
        Scanner input = new Scanner(System.in);

        // Taking ages input
        System.out.print("Enter age of Amar: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = input.nextInt();

        // Taking heights input
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = input.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = input.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = input.nextDouble();

        //Checking the condition and finding youngestFriend
        String youngestFriend;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony)
		{
            youngestFriend = "Amar";
        }
		else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) 
		{
            youngestFriend = "Akbar";
        }
		else
		{
            youngestFriend = "Anthony";
        }

        // Finding tallest friend using if-else
        String tallestFriend;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony)
		{
            tallestFriend = "Amar";
        }
		else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) 
		{
            tallestFriend = "Akbar";
        } 
		else
		{
            tallestFriend = "Anthony";
        }

        // Displaying results
        System.out.println("The youngest friend is: " + youngestFriend);
        System.out.println("The tallest friend is: " + tallestFriend);
		
		//Closing the Scanner output
        input.close();
    }
}

	