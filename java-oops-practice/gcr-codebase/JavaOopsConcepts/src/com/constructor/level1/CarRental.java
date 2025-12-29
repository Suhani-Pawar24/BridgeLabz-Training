package com.constructor.level1;

public class CarRental {
	
	String customerName;
	String carModel;
	int rentalDays ;
	
	double ratePerDay = 1000;
	double totalCost = 0;
	
	CarRental(String customerName, String carModel, int rentalDays)
	{
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
	}
	
	void calculateTotalCost()
	{
		totalCost = rentalDays * ratePerDay;
	}
	
	void displayDetails()
	{
		System.out.println("Total Cost is : " + totalCost);
	}
	
	public static void main(String[] args)
	{
		CarRental obj1 = new CarRental("Aditya", "Volkswagen", 2);
		obj1.calculateTotalCost();
		obj1.displayDetails();
	}

}
