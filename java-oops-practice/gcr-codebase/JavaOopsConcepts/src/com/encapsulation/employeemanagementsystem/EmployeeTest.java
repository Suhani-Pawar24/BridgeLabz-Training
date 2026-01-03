package com.encapsulation.employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class EmployeeTest 
{
	    public static void main(String[] args) 
	    {
	        List<Employee> employeeList = new ArrayList<>();

	        FullTimeEmployee ft = new FullTimeEmployee(101, "Amit Sharma", 50000, 5000);
	        ft.assignDepartment("IT - Development");

	        PartTimeEmployee pt = new PartTimeEmployee(102, "Suresh Raina", 80, 500);
	        pt.assignDepartment("Content Writing");

	        employeeList.add(ft);
	        employeeList.add(pt);

	        System.out.println("=== Employee Management System ===\n");

	        for (Employee emp : employeeList)
	        {
	            emp.displayDetails();
	        }
	    }
}
