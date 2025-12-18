import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Input base and height in centimeters
        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert area to square inches
        // Since 1 inch = 2.54 cm, 1 square inch = 2.54 * 2.54 square cm
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);
    }
}