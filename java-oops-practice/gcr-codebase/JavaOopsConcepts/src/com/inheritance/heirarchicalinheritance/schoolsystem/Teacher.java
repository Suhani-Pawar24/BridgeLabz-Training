package com.inheritance.heirarchicalinheritance.schoolsystem;

public class Teacher extends Person
{
	    private String subject;

	    public Teacher(String name, int age, String subject) 
	    {
	        super(name, age);
	        this.subject = subject;
	    }

	    public void displayRole() 
	    {
	        System.out.println("Role: Teacher");
	        displayBasicInfo();
	        System.out.println("Subject Specialization: " + subject);
	    }
}


