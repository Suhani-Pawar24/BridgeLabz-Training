import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Input the total perimeter
        System.out.print("Enter perimeter: ");
        double perimeter = sc.nextDouble();

        // Since Perimeter = 4 * side, then side = Perimeter / 4
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}