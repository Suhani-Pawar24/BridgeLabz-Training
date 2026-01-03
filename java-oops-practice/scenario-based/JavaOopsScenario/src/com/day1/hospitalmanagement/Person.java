package com.day1.hospitalmanagement;

public abstract class Person 
{
	    protected String name;
	    protected String id;

	    public Person(String name, String id) 
	    {
	        this.name = name;
	        this.id = id;
	    }

	    // Abstract method to be overridden by Doctor and Patient
	    public abstract void displayInfo();
}


