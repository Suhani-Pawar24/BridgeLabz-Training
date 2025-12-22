import java.util.Arrays;
public class ZaraBonus
{
	public static int[][] generateEmployeeData(int numEmployees)
	{
        int[][] data = new int[numEmployees][2]; 
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; 
            data[i][1] = (int)(Math.random() * 10) + 1;        
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) 
	{
        int numEmployees = employeeData.length;
        double[][] result = new double[numEmployees][3];

        for (int i = 0; i < numEmployees; i++)
		{
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    // Method to calculate totals and display the table
    public static void displaySalaryTable(double[][] salaryData)
	{
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.printf("%-10s %-12s %-10s %-12s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < salaryData.length; i++) 
		{
            System.out.printf("%-10d %-12.2f %-10.2f %-12.2f\n", 
                    i + 1, salaryData[i][0], salaryData[i][1], salaryData[i][2]);
            totalOldSalary += salaryData[i][0];
            totalBonus += salaryData[i][1];
            totalNewSalary += salaryData[i][2];
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-10.2f %-12.2f\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args)
	{
        int numEmployees = 10;

        int[][] employeeData = generateEmployeeData(numEmployees);
        System.out.println("Employee data (Salary, Years of Service): " + Arrays.deepToString(employeeData));

        double[][] salaryData = calculateBonusAndNewSalary(employeeData);

        displaySalaryTable(salaryData);
    }
}
