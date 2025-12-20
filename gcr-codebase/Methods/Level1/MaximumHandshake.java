import java.util.Scanner;
public class MaximumHandshake 
{
    public static void main(String[] args) 
	{	
		//Create a Scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking integer input
		int numberOfStudents = input.nextInt();
		MaximumHandshake obj = new MaximumHandshake();
		
		int combination = obj.calculateNumberOfHandshake(numberOfStudents);
		System.out.println(combination);
		
	}
	public int calculateNumberOfHandshake( int n )
	{
		return ( n * (n-1)) / 2;
	}
}	