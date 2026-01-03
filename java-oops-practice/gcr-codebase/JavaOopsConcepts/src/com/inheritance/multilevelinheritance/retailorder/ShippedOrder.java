package com.inheritance.multilevelinheritance.retailorder;

public class ShippedOrder extends Order
{
	protected int trackingNumber;
	
	public ShippedOrder(int orderId, String orderDate, int trackingNumber)
	{
		super(orderId,orderDate);
		this.trackingNumber = trackingNumber;
	}
	
	public void getOrderStatus()
	{
		super.getOrderStatus();
		System.out.println("Tracking Number : "+trackingNumber);
	}
	
	
}
