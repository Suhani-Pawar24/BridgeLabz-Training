package com.day3.swiftcraft;

public class TestSwiftCraft 
{
	    public static void main(String[] args) {
	       
	        Product milk = new PerishableProduct("Milk", 100); 
	        Product soap = new NonPerishableProduct("Soap", 50);

	      
	        Cart myCart = new Cart();

	  
	        myCart.addProduct(milk);
	        myCart.addProduct(soap);

	      
	        myCart.applyDiscount(10); 
	        myCart.generateBill();
	    }
}


