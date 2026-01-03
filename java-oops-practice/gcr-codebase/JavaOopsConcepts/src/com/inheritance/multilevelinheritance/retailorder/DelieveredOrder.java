package com.inheritance.multilevelinheritance.retailorder;

public class DelieveredOrder extends ShippedOrder 
{
    protected String delieveredDate; 
    
   
    public DelieveredOrder(int orderId, String orderDate, int trackingNumber, String delieveredDate) 
    {
        super(orderId, orderDate, trackingNumber); 
        this.delieveredDate = delieveredDate;
    }
    
    @Override
    public void getOrderStatus()
    {
        super.getOrderStatus(); 
        System.out.println("Delievered date : " + delieveredDate); 
    }
}