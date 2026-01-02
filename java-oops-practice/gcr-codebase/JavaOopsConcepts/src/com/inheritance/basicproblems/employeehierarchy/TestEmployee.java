package com.inheritance.basicproblems.employeehierarchy;

public class TestEmployee {
	
	public static void main(String[] args)
	{
		Manager obj1 = new Manager("Aditya", 121, 300000.0, 4);
		obj1.displayDetails();
		
		Developer obj2 = new Developer("Raman" , 111, 400000.0, "Java");
		obj2.displayDetails();
		
		Intern obj3 = new Intern("Suhani" , 101, 200000.0);
		obj3.displayDetails();
	}

}
