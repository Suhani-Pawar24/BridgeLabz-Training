package com.encapsulation.ecommerceplatform;

public class Clothing extends Product implements Taxable{
		public Clothing(int id , String name,double i) {
			super(id,name,i);
		}
		public double calculateTax() {
			return getPrice()*0.20;
		}
		public String getTaxDetails() {
			return "GST @5%";
		}
		 double calculateDiscount() {
			return getPrice() *0.05;
		}
}

