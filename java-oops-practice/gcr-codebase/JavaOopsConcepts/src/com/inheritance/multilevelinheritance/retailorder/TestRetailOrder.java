package com.inheritance.multilevelinheritance.retailorder;

public class TestRetailOrder 
{
    public static void main(String[] args) 
    {
        Order o1 = new Order(101, "01-01-2026");
        Order o2 = new ShippedOrder(102, "02-01-2026", 1245);
        Order o3 = new DelieveredOrder(103, "03-01-2026", 76778, "05-01-2026");

        System.out.println("--- Order 1 Details ---");
        o1.getOrderStatus(); 
        
        System.out.println("\n--- Order 2 Details ---");
        o2.getOrderStatus(); 
        
        System.out.println("\n--- Order 3 Details ---");
        o3.getOrderStatus(); 
    }
}