package com.inheritance.basicproblems.employeehierarchy;

public class Developer extends Employee{
	
	protected String programmingLanguage;
	
	public Developer(String name, int id, double salary,String programmingLanguage)
	{
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	public void displayDetails()
	{
		System.out.println(" --- Developer Details --- ");;
		System.out.println("Developer name :" + name);
		System.out.println("Developer id :" + id);
		System.out.println("Developer salary :"+salary);
		System.out.println("Programming Language :"+ programmingLanguage);
	}

}
