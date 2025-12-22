import java.util.Scanner;
public class BMICalculator
{

    // method to calculate BMI and store in array
    public static void calculateBMI(double[][] data)
	{
        for (int i = 0; i < data.length; i++) 
		{
            double weight = data[i][0];
            double heightCm = data[i][1];

            double heightM = heightCm / 100; // convert cm to meter
            double bmi = weight / (heightM * heightM);

            data[i][2] = bmi;
        }
    }

    // method to determine BMI status
    public static String[] getBMIStatus(double[][] data)
	{
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) 
		{
            double bmi = data[i][2];

            if (bmi < 18.5)
			{
                status[i] = "Underweight";
            }
			else if (bmi < 25) 
			{
                status[i] = "Normal";
            }
			else if (bmi < 30) 
			{
                status[i] = "Overweight";
            }
			else
			{
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++)
		{
            System.out.println("Enter details of person " + (i + 1));
            System.out.print("Weight (kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        calculateBMI(data);
		
        String[] status = getBMIStatus(data);

        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++)
		{
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n",(i + 1),data[i][0],data[i][1], data[i][2],status[i]);
        }

        input.close();
    }
}
