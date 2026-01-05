package com.encapsulation.onlinefooddelivery;

public abstract class FoodItem
{
		private String itemName;
		private double price;
		private int quantity;
		
		FoodItem(String itemName,double price,int quantity)
		{
			this.itemName = itemName;
			this.price = price;
			this.quantity = quantity;
			
		}
		
		abstract double calculateTotalPrice();
		
		void display() 
		{
			System.out.println("Item name      :"+itemName);
			System.out.println("price          :"+price);
			System.out.println("quantity       :"+quantity);
		}
		double getPrice() 
		{
			return price;
		}
		int getQuantity() 
		{
			return quantity;
		}
		void setPrice(double price)
		{
			this.price = price;
		}
		void setQuantity(int quantity) 
		{
			this.quantity = quantity;
		}
		
}


