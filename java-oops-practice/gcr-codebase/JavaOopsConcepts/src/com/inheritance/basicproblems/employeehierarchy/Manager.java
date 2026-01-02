package com.inheritance.basicproblems.employeehierarchy;

public class Manager extends Employee {
	
	protected int teamSize ;
	
	public Manager(String name, int id, double salary,int teamSize)
	{
		super(name,id,salary);
		this.teamSize = teamSize;
	}
	
	public void displayDetails()
	{
		
		System.out.println("\n --- Manager Details ---");
		System.out.println("Manager Name :" + name);
		System.out.println("Manager Id :" + id);
		System.out.println("Manager Salary :"+ salary);
		System.out.println("Team Size :" + teamSize);
	}

}
