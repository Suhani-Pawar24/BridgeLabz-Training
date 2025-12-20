import java.util.*;
public class TwoDArrayConversion
{	
	public static void main(String[] args)
	{	
		//Creating Scanner Object
		Scanner input = new Scanner(System.in);
		//Taking Rows and Coloumns as user input
		int rows = input.nextInt();
		int coloumns = input.nextInt();
		
		//Create a 2D Matrix
		int[][] matrix = new int[rows][coloumns];
		for(int i  = 0; i < rows; i++)
		{
			for(int j = 0; j < coloumns; j++)
			{	
				//Taking user input
				matrix[i][j]=input.nextInt();
			}
		}
		//Create a single D matrix
		int[] arr = new int [rows * coloumns];
		//Create a int variable index and initialize it with zero
		int index = 0;
		//Copy element of 2D matrix into 1D matrix
		for(int i  = 0; i < rows; i++)
		{
			for(int j = 0; j < coloumns; j++)
			{
				arr[index] = matrix[i][j];
				//Increment the index
				index++;
			}
		}
		//Output result
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}	
			