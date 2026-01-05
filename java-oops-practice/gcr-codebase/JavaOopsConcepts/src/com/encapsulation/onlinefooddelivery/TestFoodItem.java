package com.encapsulation.onlinefooddelivery;

public class TestFoodItem 
{
	public static void processOrder(FoodItem item)
	{
			item.display();
			
			double total = item.calculateTotalPrice();
			
			if(item instanceof Discountable) 
			{
			double discount = 	((Discountable) item).applyDiscount();
			System.out.println(((Discountable) item).getDiscountDetails());
			System.out.println("Discount Amount : ₹" + discount);
	        total = total - discount;
			}
			
			  System.out.println("Final Payable Amount : ₹" + total);
		        System.out.println("-----------------------------------");
	}

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			FoodItem item1 = new VegItem("Paneer Butter Masala", 250, 2);
	        FoodItem item2 = new NonVegItem("Chicken Biryani", 300, 1);
	        
	        processOrder(item1);
	        processOrder(item2);
		}

}


