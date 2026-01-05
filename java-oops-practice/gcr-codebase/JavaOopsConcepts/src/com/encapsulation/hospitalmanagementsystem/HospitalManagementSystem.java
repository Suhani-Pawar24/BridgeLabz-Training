package com.encapsulation.hospitalmanagementsystem;

public class HospitalManagementSystem {

	    public static void showBill(Patient patient) {

	        patient.getPatientDetails();
	        System.out.println("Total Bill : ₹" + patient.calculateBill());
	        System.out.println("--------------------------------");
	    }

	    public static void main(String[] args) {

	        Patient p1 = new InPatient(101, "Rahul Sharma", 45, 5, 2000);
	        Patient p2 = new OutPatient(102, "Anita Verma", 30, 500);

	        p1.setMedicalData("Fracture", "X-Ray, Surgery");
	        p2.setMedicalData("Fever", "Medication");

	        showBill(p1);
	        showBill(p2);
	    }
	

}
