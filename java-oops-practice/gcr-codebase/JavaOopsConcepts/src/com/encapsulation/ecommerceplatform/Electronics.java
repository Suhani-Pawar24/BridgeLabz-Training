package com.encapsulation.ecommerceplatform;

public class Electronics extends Product implements Taxable
{
		public Electronics (int id , String name,double price) 
		{
			super(id,name,price);
		}
		@Override
		public
		double calculateTax() 
		{
			return getPrice()*0.18;
		}
		@Override
		public
		String getTaxDetails() 
		{
			return "GST 18%";
			
		}
		double calculateDiscount() 
		{
			return getPrice()*0.10;
		}
}

