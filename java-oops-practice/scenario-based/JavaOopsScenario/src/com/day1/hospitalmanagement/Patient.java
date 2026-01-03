package com.day1.hospitalmanagement;

public class Patient extends Person 
{
    private String medicalHistory; // Encapsulation: Private data
    protected String assignedDoctor;

    // Constructor 1: Normal Admission
    public Patient(String name, String id) 
    {
        super(name, id);
        this.medicalHistory = "No major issues reported.";
    }

    // Constructor 2: Emergency (Overloaded)
    public Patient(String name, String id, String medicalHistory) 
    {
        super(name, id);
        this.medicalHistory = medicalHistory;
    }

    public void setAssignedDoctor(String doctorName)
    {
        this.assignedDoctor = doctorName;
    }

    // Public method to expose private data safely
    public String getSummary() 
    {
        return "Patient: " + name + " | History: " + medicalHistory;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println("Patient [ID: " + id + ", Name: " + name + "]");
    }
}


