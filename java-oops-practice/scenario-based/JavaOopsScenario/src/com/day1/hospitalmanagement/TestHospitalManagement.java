package com.day1.hospitalmanagement;

public class TestHospitalManagement 
{
	    public static void main(String[] args)
	    {
	        // 1. Create Doctor
	        Doctor doc = new Doctor("Sinha", "DOC88", "Neurology");

	        // 2. Create Patients using Overloaded Constructors
	        InPatient p1 = new InPatient("Aman", "P101", 4); // Normal
	        OutPatient p2 = new OutPatient("Riya", "P102"); // Normal
	        Patient p3 = new Patient("Vikram", "P103", "Heart Attack - Critical"); // Emergency

	        p1.setAssignedDoctor(doc.name);

	        // 3. Display Info (Polymorphism)
	        System.out.println("HOSPITAL REGISTRATION RECORDS\n");
	        doc.displayInfo();
	        p1.displayInfo();
	        p2.displayInfo();
	        
	        // Encapsulation Check
	        System.out.println("\nSensitive Medical Data Access:");
	        System.out.println(p3.getSummary());

	        // 4. Billing (Interface & Abstraction)
	        System.out.println("\nBILLING PROCESSING");
	        Bill bill1 = new Bill(p1);
	        bill1.calculatePayment();

	        System.out.println();
	        
	        Bill bill2 = new Bill(p2);
	        bill2.calculatePayment();
	    }
}


