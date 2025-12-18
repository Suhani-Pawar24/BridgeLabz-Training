import java.util.Scanner;
public class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input unit price (decimal) and quantity (integer)
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Total price = price per item * number of items
        double totalPrice = unitPrice * quantity;

		//Display result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " 
            + quantity + " and unit price is INR " + unitPrice);
    }
}