import java.util.Scanner;
public class SimpleInterest 
{
    public static void main(String[] args) 
	{	
		//Create a Scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking principal as user input
		System.out.println("Enter principal : ");
		double principal = input.nextDouble();
		
		//Taking rate as user input
		System.out.println("Enter rate : ");
		double rate = input.nextDouble();
		
		//Taking time as user input
		System.out.println("Enter time : ");
		double time = input.nextDouble();
		
		SimpleInterest obj = new SimpleInterest();
		double si = obj.calculateSimpleInterest(principal,rate,time);
		System.out.println(si);
	}	
		
		//Creating method for calculating simple interest
		public double calculateSimpleInterest(double principal, double rate, double time)
		{
			return ( principal * rate * time) / 100;
		}
}
		