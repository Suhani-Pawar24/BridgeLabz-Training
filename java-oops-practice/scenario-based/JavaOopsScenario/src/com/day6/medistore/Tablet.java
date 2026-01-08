package com.day6.medistore;

class Tablet extends Medicine
{
	Tablet(String name,double price,String expiryDate,int quantity)
	{
		super(name,price,expiryDate,quantity);
	}
	
	Tablet(String name,double price,String expiryDate)
	{
		super(name,price,expiryDate);
	}
	
	public void checkExpiry()
	{
		System.out.println("Tablet expiry checked using preserved medicine rules");
	}
}


	


