package com.day1.hospitalmanagement;

public class InPatient extends Patient 
{
	    private int daysAdmitted;
	    private double dailyCharge = 1500.0;

	    public InPatient(String name, String id, int daysAdmitted) 
	    {
	        super(name, id);
	        this.daysAdmitted = daysAdmitted;
	    }

	    public int getDaysAdmitted()
	    { 
	    	return daysAdmitted; 
	    }
	    public double getDailyCharge()
	    { 
	    	return dailyCharge; 
	    }

	    @Override
	    public void displayInfo() 
	    {
	        System.out.println("In-Patient: " + name + " (ID: " + id + ") - Admitted for " + daysAdmitted + " days.");
	    }
}


