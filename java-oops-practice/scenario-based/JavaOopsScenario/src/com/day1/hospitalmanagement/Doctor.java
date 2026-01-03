package com.day1.hospitalmanagement;

public class Doctor extends Person
{
	    private String specialization;

	    public Doctor(String name, String id, String specialization)
	    {
	        super(name, id);
	        this.specialization = specialization;
	    }

	    @Override
	    public void displayInfo()
	    {
	        System.out.println("Doctor: Dr. " + name + " (ID: " + id + ") | Specialization: " + specialization);
	    }
}


