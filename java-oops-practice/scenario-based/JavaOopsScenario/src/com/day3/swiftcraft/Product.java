package com.day3.swiftcraft;

public class Product 
{
	String name;
	protected double price;
	String category;
	
	Product(String name, double price,String category)
	{
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public double getFinalPrice()
	{
		return price;
	}

}
