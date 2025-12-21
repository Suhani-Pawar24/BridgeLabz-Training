import java.util.*;
public class TrignometricFunctions
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter angle in degree: ");
		double angle = input.nextDouble();
		
		TrignometricFunctions obj = new TrignometricFunctions();
		double[] result = obj.calculateTrigonometricFunctions(angle);
		
		System.out.println(" Sine value: " + result[0]);
		System.out.println(" Cosine value: " + result[1]);
		System.out.println(" Tangent value: " + result[2]);		
		
		input.close();
	}
	
	//Method to calculate various trignometric functions
	
	public double[] calculateTrigonometricFunctions(double angle)
	{
		double radians = Math.toRadians(angle);
		double sin = Math.sin(radians);
		double cos = Math.cos(radians);
		double tan = Math.tan(radians);
		return new double[] {sin,cos,tan};
	}
}	
		
		
		