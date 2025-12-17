import java.util.Scanner;
public class FeeDiscountcalculator{
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        // Take fee input
        System.out.println("Enter Fee Amount:");
        double fee = sc.nextDouble();

        // Take discount percentage input
        System.out.println("Enter Discount Percentage:");
        double discountPercent = sc.nextDouble();

        // Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;

        // Calculate final discounted fee
        double finalFee = fee - discountAmount;

        // Display result
        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);

        // Close scanner
        sc.close();
    }
}