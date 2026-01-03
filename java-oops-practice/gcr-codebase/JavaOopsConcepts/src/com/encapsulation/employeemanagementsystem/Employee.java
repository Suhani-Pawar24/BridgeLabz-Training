package com.encapsulation.employeemanagementsystem;

public abstract class  Employee implements Department 
{
	    private int employeeId;
	    private String name;
	    private double baseSalary;
	    private String departmentName;

	    public Employee(int employeeId, String name, double baseSalary)
	    {
	        this.employeeId = employeeId;
	        this.name = name;
	        this.baseSalary = baseSalary;
	    }

	    // Abstract method to be implemented by subclasses
	    public abstract double calculateSalary();

	    // Concrete method
	    public void displayDetails() 
	    {
	        System.out.println("ID: " + employeeId + " | Name: " + name + " | Dept: " + getDepartmentDetails() + " | Monthly Pay: ₹" + calculateSalary());
	    }

	    // Interface methods implementation
	    @Override
	    public void assignDepartment(String deptName) 
	    {
	        this.departmentName = deptName;
	    }

	    @Override
	    public String getDepartmentDetails() 
	    {
	        return (departmentName != null) ? departmentName : "Not Assigned";
	    }

	    // Getters and Setters for Encapsulation
	    public int getEmployeeId() 
	    { 
	    	return employeeId;
	    }
	    public String getName()
	    {
	    	return name;
	    }
	    public double getBaseSalary()
	    {
	    	return baseSalary;
	    }
	    
	    public void setName(String name) 
	    {
	    	this.name = name;
	    }
	    public void setBaseSalary(double baseSalary)
	    {
	    	this.baseSalary = baseSalary;
	    }

}
