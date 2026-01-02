package com.inheritance.basicproblems.employeehierarchy;

public class Intern extends Employee{
	
	public Intern(String name, int id , double salary)
	{
		super(name,id,salary);
	}
	
	public void displayDetails()
	{
		System.out.println(" --- Intern Details --- ");
		System.out.println("Intern name :" + name);
		System.out.println("Intern id :" +id);
		System.out.println("Intern salary :" +  salary);
	}

}
