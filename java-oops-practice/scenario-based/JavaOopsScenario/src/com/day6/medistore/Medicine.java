package com.day6.medistore;

abstract class Medicine implements ISellable 
{
	protected String name;
	protected String expiryDate;
	protected int quantity;
	
	private double price;
	
	private static final int DEFAULT_QUANTITY = 10;
	
	public Medicine(String name,double price,String expiryDate, int quantity)
	{
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}
	
	public Medicine(String name,double price,String expiryDate)
	{
		this(name,price,expiryDate,DEFAULT_QUANTITY);
	}
	
	public void sell(int qty)
	{
		if(qty <= quantity)
		{
			quantity = quantity - qty;
			System.out.println(qty + "medicine sold");
		}
		else
		{
			System.out.println("Insufficient stock");
		}
	}
	
	protected double getPrice()
	{
		return price;
	}
	
	public abstract void checkExpiry();
}

