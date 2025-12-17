import java.util.*;
public class KilometersToMilesUserInput{
	public static void main(String[] args){
	//Taking User input
	Scanner sc = new Scanner(System.in);
	double kilometers = sc.nextDouble();
	
	//Calculation
	double miles = kilometers / 1.6;
	
	//Display result
	System.out.println(" The total miles is " + miles +" mile for the given " + kilometers + " km");
	}
}