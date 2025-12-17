import java.util.*;
public class HeightConversion{
	public static void main(String[] args){
	//Taking User Input
	 Scanner sc = new Scanner(System.in);
	 double height = sc.nextDouble();
	 
	 //HeightConversion
	 double inches = height / 2.54;
	 double feet = inches / 12;
	 
	 //Display HeightConversion
	 System.out.println(" Your height in cm is " + height + " while in feet is " +  feet + " and inches is " + inches);
	 sc.close();
  }
}	 
