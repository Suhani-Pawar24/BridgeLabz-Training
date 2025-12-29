import java.util.*;
public class RechargeSimulator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double balance = 0;
		char choice;
		
		do
		{
			System.out.println("Enter your mobile operator(Airtel/Vodafone/Jio): ");
			String operator = input.next();
			
			System.out.println("Enter recharge amount: ");
			double amount = input.nextDouble();
			
			switch(operator.toLowerCase())
			{
				case "airtel":
					System.out.println("Airtel offer : 20% extra data");
					break;
				case "vodafone":
					System.out.println("Vodafone offer : Free 20 minute talktime ");
					break;
				case "jio":
					System.out.println("Jio offer: Free 100 SMS");
					break;
				default:
					System.out.println("No offer available");
			}
			balance += amount;
			System.out.println("Your updated balance is : "+balance);
			
			System.out.println("Do you want to recharge again? (Y/N)");
			choice = input.next().charAt(0);
		}while(choice == 'Y' || choice == 'y');

		System.out.println("Thank You");
		input.close();
	}
}	
			