import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Input distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // 3 feet = 1 yard
        double yards = distanceInFeet / 3;
        
        // 1760 yards = 1 mile
        double miles = yards / 1760;
		
		//Display result
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}