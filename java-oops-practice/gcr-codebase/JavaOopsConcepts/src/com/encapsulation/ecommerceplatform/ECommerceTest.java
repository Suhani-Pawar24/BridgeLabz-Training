package com.encapsulation.ecommerceplatform;

public class ECommerceTest 
{
	public static void main(String [] args) 
	{
		
		Product[] products = new Product[3];
		products[0] = new Electronics(101,"Laptop",60000);
		products[1] = new Clothing(102,"Jacket",3000);
		products[2] = new Groceries(103,"Rice Bag",1200);
		
		calculateFinalPrice(products);
		
	}
	static void calculateFinalPrice(Product[] products)
	{
		for(Product p: products) 
		{
			p.displayProduct();
			
			double tax= 0;
			if(p instanceof Taxable) 
			{
				tax = ((Taxable) p).calculateTax();
				System.out.println("Tax info : "+
				((Taxable) p).getTaxDetails());
			}
			
		double discount = p.calculateDiscount();
		double finalPrice = p.getPrice() + tax -discount;
		
		System.out.println("Discount    :"+ discount);
		System.out.println("Final Price :"+ finalPrice);
		System.out.println("____________________________");
		}
	}
}


