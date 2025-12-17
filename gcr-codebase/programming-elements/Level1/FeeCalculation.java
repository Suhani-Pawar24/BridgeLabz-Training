import java.util.*;
public class FeeCalculation{
	public static void main(String[] args){
	// Creating variable and assigning values to it
	int fee = 125000;
	int discountPercent = 10;
	
	// Created a discount variable to calculate discount
	double discountAmount = (fee * discountPercent) / 100;
	//Calculate the final discounted fee
	double finalFee = fee - discountAmount;
	
	//Display the result
	System.out.println(" The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
	}
}	