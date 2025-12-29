package com.constructor.level1;

public class Product {
	
	String productName;
	double price;
	static int totalProducts = 0;
	
	Product(String productName, double price)
	{
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	void displayProducts()
	{
		System.out.println(productName + " - " +price);
	}
	
	static void displayTotalProducts()
	{
		System.out.println("Total Products: "+totalProducts);
	}
	
	public static void main(String[] args)
	{
		Product obj1 = new Product("Soap", 70.0);
		obj1.displayProducts();
		Product.displayTotalProducts();
	}

}
