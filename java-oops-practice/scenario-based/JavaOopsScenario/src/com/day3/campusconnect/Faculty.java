package com.day3.campusconnect;

public class Faculty extends Person
{
	 String department;
	 Faculty(String name, String email, String id, String department)
	 {
	        super(name, email, id);
	        this.department = department;
	 }

	  @Override
	   void printDetails() 
	  {
	        System.out.println("[Faculty] " + name + " | Dept: " + department);
	  }
}


