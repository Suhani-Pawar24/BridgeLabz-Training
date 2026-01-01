import java.util.*;
public class TicketBooking 
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Welcome to Cinepolis ---");
        
        while(true) 
		{
            System.out.println("\nEnter Customer Name (or type 'exit' to quit):");
            
            String customerName = input.nextLine(); 
            
            if(customerName.equalsIgnoreCase("exit"))
			{
                break;
            }
            
            System.out.println("Select movie: 1. Action  2. Comedy");
            int movieChoice = input.nextInt();
            
            input.nextLine(); 

            System.out.println("Select seat type: (Silver / Gold)");
            String seatType = input.nextLine();
            
            double price = 0;
            
            switch(movieChoice) 
			{
                case 1:
                    System.out.println("Movie selected: Action Blast");
                    if(seatType.equalsIgnoreCase("Gold")) 
					{
                        price = 300;
                    } 
					else
					{
                        price = 200;
                    }   
                    break;
                
                case 2:
                    System.out.println("Movie selected: Khichdi");
                    if(seatType.equalsIgnoreCase("Gold"))
					{
                        price = 350;
                    }
					else 
					{
                        price = 450;
                    }
                    break;
                
                default:
                    System.out.println("Invalid choice. Please start again.");
                    continue; 
            }
            
            System.out.println("Add snacks for Rs. 300? (yes/no):");
            String snacks = input.nextLine(); 
            
            double finalBill = price;
            if(snacks.equalsIgnoreCase("yes"))
			{
                finalBill += 300;
            }   
        
            System.out.println("\n--- Receipt ---");
            System.out.println("Customer name: " + customerName);
            System.out.println("Seat type    : " + seatType);
            System.out.println("Total Bill   : " + finalBill);
            System.out.println("----------------");
            
        }
        
        System.out.println("Thank you for using Cinepolis!");
        input.close();
    }
}	
			
				
			
		