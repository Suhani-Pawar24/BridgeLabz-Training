package com.constructor.level1;

public class Person {
		
	private String name;
	private String gender;
	private int age;
	
	Person(String name, String gender, int age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	Person(Person personCopy)
	{
		this.name = personCopy.name;
		this.gender = personCopy.gender;
		this.age = personCopy.age;
	}
	
	void displayDetails()
	{
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args)
	{
		Person obj1 = new Person("Raman" , "Male", 21);
		obj1.displayDetails();
		
		Person obj2 = new Person(obj1);
		obj2.displayDetails();
	}
	
}
