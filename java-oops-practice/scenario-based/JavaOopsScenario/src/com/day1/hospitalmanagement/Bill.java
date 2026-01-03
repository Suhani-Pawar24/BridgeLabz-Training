package com.day1.hospitalmanagement;

public class Bill implements Payable 
{
	    private Patient patient;
	    private double totalAmount;

	    public Bill(Patient patient) 
	    {
	        this.patient = patient;
	    }

	    @Override
	    public void calculatePayment() 
	    {
	        double baseCharge = 0;

	        // Operators & Polymorphism check
	        if (patient instanceof InPatient)
	        {
	            InPatient ip = (InPatient) patient;
	            baseCharge = ip.getDaysAdmitted() * ip.getDailyCharge(); // Multiplication Operator
	        } 
	        else if (patient instanceof OutPatient) 
	        {
	            OutPatient op = (OutPatient) patient;
	            baseCharge = op.getConsultationFee();
	        }

	        double tax = baseCharge * 0.12; // 12% GST
	        this.totalAmount = baseCharge + tax; // Addition Operator

	        System.out.println("--- Invoice ---");
	        System.out.println("Base Amount: ₹" + baseCharge);
	        System.out.println("GST (12%): ₹" + tax);
	        System.out.println("Total Amount: ₹" + totalAmount);
	    }
}
	


