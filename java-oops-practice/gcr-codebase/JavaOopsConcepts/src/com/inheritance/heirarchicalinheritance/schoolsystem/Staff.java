package com.inheritance.heirarchicalinheritance.schoolsystem;

public class Staff extends Person
{

	    private String department;

	    public Staff(String name, int age, String department) 
	    {
	        super(name, age);
	        this.department = department;
	    }

	    public void displayRole()
	    {
	        System.out.println("Role: Staff Member");
	        displayBasicInfo();
	        System.out.println("Department: " + department);
	    }
}


