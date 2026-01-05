package com.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable
{
	
	private String insurancePolicyNumber;
	
	Car(String vehicleNumber,double rentalRate,String policyNo)
	{
		super(vehicleNumber,rentalRate);
		this.insurancePolicyNumber = policyNo;
	}
	double calculateRentalCost(int days) 
	{
		return rentalRate*days;
	}
	public double calculateInsurance(int days) 
	{
		return 200*days;
	}
	public String getInsuranceDetails() 
	{
		return "car insurance";
	}
	
}


