package com.encapsulation.ecommerceplatform;
public abstract class Product 
{
	private int productId;
	private String name;
	protected Double price;
	Product(int productId,String name,Double price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	abstract double calculateDiscount();
	
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 public void displayProduct() {
	        System.out.println("ID    : " + productId);
	        System.out.println("Name  : " + name);
	        System.out.println("Price : " + price);
	    }
	
}
	


