package com.day3.campusconnect;

public class Person {
	protected String name;
	protected String email;
	protected String id;
	
	Person(String name, String email,String id)
	{
		this.name = name;
		this.email = email;
		this.id =id;
	}
	
	void printDetails()
	{
		System.out.println("Name : " + name + "," + "ID : "+id);
	}

}
