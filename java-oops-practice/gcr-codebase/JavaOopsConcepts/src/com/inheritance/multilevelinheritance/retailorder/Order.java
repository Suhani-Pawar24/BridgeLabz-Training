package com.inheritance.multilevelinheritance.retailorder;

public class Order
{
		protected int orderId;
		protected String orderDate;
		
		public Order(int orderId, String orderDate)
		{
			this.orderId = orderId;
			this.orderDate = orderDate;
		}
		public void getOrderStatus()
		{
			System.out.println("Order Id : "+orderId);
			System.out.println("Order Date : "+orderDate);
		}

}
