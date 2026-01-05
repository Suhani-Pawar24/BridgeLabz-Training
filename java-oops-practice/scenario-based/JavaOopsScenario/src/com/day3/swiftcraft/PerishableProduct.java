package com.day3.swiftcraft;

public class PerishableProduct extends Product
{
	PerishableProduct(String name, double price)
	{
		super(name, price, "Perishable");
	}
	
	@Override
	public double getFinalPrice()
	{
		return price * 0.95;
	}

}
