import java.util.Scanner;
public class FindBMI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++)
        {
            hw[i][0] = sc.nextDouble();
            hw[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(hw);
        display(result);
    }

    public static String[][] calculateBMIAndStatus(double weight, double heightCm)
    {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi < 18.5)
        {
            status = "Underweight";
        }
        else if (bmi < 25)
        {
            status = "Normal";
        }
        else if (bmi < 30)
        {
            status = "Overweight";
        }
        else
        {
            status = "Obese";
        }

        String[][] data = new String[1][2];
        data[0][0] = String.valueOf(bmi);
        data[0][1] = status;

        return data;
    }

    public static String[][] processBMI(double[][] hw)
    {
        String[][] data = new String[hw.length][4];

        for (int i = 0; i < hw.length; i++)
        {
            String[][] bmiData = calculateBMIAndStatus(hw[i][0], hw[i][1]);

            data[i][0] = String.valueOf(hw[i][1]);
            data[i][1] = String.valueOf(hw[i][0]);
            data[i][2] = bmiData[0][0];
            data[i][3] = bmiData[0][1];
        }

        return data;
    }

    public static void display(String[][] data)
    {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < data.length; i++)
        {
            System.out.println(
                    data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    data[i][2] + "\t" +
                    data[i][3]
            );
        }
    }
}
