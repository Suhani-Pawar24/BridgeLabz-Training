import java.util.Scanner;
public class ArraySumProgram
{
    public static void main(String[] args)
	{
        // Initialize variables per instructions
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter up to 10 positive numbers (Enter 0 or a negative to stop):");

        // Infinite while loop
        while (true)
		{
            // Break if the index reaches 10
            if (index == 10)
			{
                System.out.println("Array is full.");
                break;
            }

            System.out.print("Enter value " + (index + 1) + ": ");
            double userInput = scanner.nextDouble();

            // Break if user enters 0 or a negative number
            if (userInput <= 0)
			{
                break;
            }

            // Assign to array and increment index
            numbers[index] = userInput;
            index++;
        }

        // Display the numbers and calculate the total using a for loop
        System.out.print("Numbers entered: ");
        
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i]; // Add element to total
        }

        // Finally display the total value
        System.out.println("\nTotal Sum: " + total);
        
        scanner.close();
	}
}
	

				
			