package com.encapsulation.hospitalmanagementsystem;

public abstract class Patient
{
		private int patientId;
	    private String name;
	    private int age;

	    // Sensitive data (Encapsulation)
	    private String diagnosis;
	    private String medicalHistory;

	    public Patient(int patientId, String name, int age) 
	    {
	        this.patientId = patientId;
	        this.name = name;
	        this.age = age;
	    }

	    // Abstract method
	    abstract double calculateBill();

	    // Concrete method
	    public void getPatientDetails() 
	    {
	        System.out.println("Patient ID : " + patientId);
	        System.out.println("Name       : " + name);
	        System.out.println("Age        : " + age);
	    }

	    // Encapsulation using setters
	    public void setMedicalData(String diagnosis, String history) 
	    {
	        this.diagnosis = diagnosis;
	        this.medicalHistory = history;
	    }

	    protected String getDiagnosis() 
	    {
	        return diagnosis;
	    }
}


