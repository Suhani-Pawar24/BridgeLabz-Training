package com.day7.foodloop;

public abstract class FoodItem 
{

	    protected String name;
	    protected String category;
	    protected double price;
	    
	    private int stockLevel;

	    public FoodItem(String name, String category, double price, int stock)
	    {
	        this.name = name;
	        this.category = category;
	        this.price = price;
	        this.stockLevel = stock;
	    }

	    public double getPrice() 
	    {
	    	return price;
	    }
	    public String getName() 
	    {
	    	return name;
	    }
}

	

