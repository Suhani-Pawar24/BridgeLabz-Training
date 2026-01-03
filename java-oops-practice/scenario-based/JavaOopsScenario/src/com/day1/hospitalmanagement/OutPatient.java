package com.day1.hospitalmanagement;

public class OutPatient extends Patient
{
	    private double consultationFee = 500.0;

	    public OutPatient(String name, String id) 
	    {
	        super(name, id);
	    }

	    public double getConsultationFee()
	    {
	    	return consultationFee;
	    	}

	    @Override
	    public void displayInfo() 
	    {
	        System.out.println("Out-Patient: " + name + " (ID: " + id + ") - Regular Consultation.");
	    }
}
