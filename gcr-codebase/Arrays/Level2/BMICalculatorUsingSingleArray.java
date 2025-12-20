import java.util.Scanner;
public class BMICalculatorUsingSingleArray
{
    public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Arrays to store weight, height, BMI, and status
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        // Input and calculation
        for (int i = 0; i < number; i++) 
		{
            do 
			{
                System.out.print("Enter weight (kg) for person " + (i+1) + ": ");
                weight[i] = input.nextDouble();
            } while (weight[i] <= 0);

            do 
			{
                System.out.print("Enter height (m) for person " + (i+1) + ": ");
                height[i] = input.nextDouble();
            } while (height[i] <= 0);

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 25) status[i] = "Normal weight";
            else if (bmi[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // Display results
        System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
        for (int i = 0; i < number; i++)
		{
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                              i+1, weight[i], height[i], bmi[i], status[i]);
        }

        input.close();
    }
}
