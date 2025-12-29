import java.util.*;
public class DiscountDashboard 
{

    public static void billCalculator()
	{
        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of items:");
        int quantity = input.nextInt();

        String itemList[] = new String[quantity];
        int priceList[] = new int[quantity];
        int total = 0;

        for (int i = 0; i < quantity; i++)
		{
            System.out.println("Enter item name:");
            itemList[i] = input.next();
            System.out.println("Enter price:");
            priceList[i] = input.nextInt();
            total += priceList[i];
        }

        double totalBill;
        if (total > 200) 
		{
            totalBill = total * 0.5;  
        } 
		else 
		{
            totalBill = total;
        }

      
        System.out.println("\nNo  Item  Price");
        for (int i = 0; i < quantity; i++) {
            System.out.println((i + 1) + "  " + itemList[i] + "  " + priceList[i]);
        }

        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        billCalculator();
    }
}
		
	
		
		