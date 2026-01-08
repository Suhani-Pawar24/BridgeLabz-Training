package com.day6.medistore;

public class MedicineTest
{
	    public static void main(String[] args)
	    {
	        // Upcasting 
	        Medicine m1 = new Tablet("Paracetamol", 20.0, "2026-12", 50);
	        Medicine m2 = new Syrup("Cough Syrup", 85.0, "2025-10");
	        Medicine m3 = new Injection("Insulin", 150.0, "2025-06", 30);

	        // Selling medicines
	        m1.sell(5);
	        m2.sell(2);
	        m3.sell(10);

	        m1.checkExpiry();   // Tablet logic
	        m2.checkExpiry();   // Syrup logic
	        m3.checkExpiry();   // Injection logic
	    }
}



