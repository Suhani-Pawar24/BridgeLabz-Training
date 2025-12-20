import java.util.Scanner;
public class TriangularPark 
{
    public static void main(String[] args) 
	{	
		//Create a Scanner object
        Scanner input = new Scanner(System.in);
		
		//Taking user input for 3 sides of a triangle
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		
		int distance = 5;
		int perimeterOfTriangle = (side1 + side2 + side3);
		
		TriangularPark obj = new TriangularPark();
		int rounds = obj.computeNumberOfRounds(perimeterOfTriangle,distance);
		System.out.println(rounds);
	}
	public int computeNumberOfRounds(int perimeterOfTriangle, int distance)
	{
		distance = distance * 1000;	
		return (distance / perimeterOfTriangle);
	}
}	