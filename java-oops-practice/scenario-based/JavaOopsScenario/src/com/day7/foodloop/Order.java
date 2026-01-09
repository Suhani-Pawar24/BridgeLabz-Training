package com.day7.foodloop;
import java.util.ArrayList;
import java.util.List;
public class Order  implements IOrderable 
{
    private List<FoodItem> items = new ArrayList<>();
    private double totalAmount;

    public Order(FoodItem... comboItems)
    {
        for (FoodItem item : comboItems) 
        {
            this.items.add(item);
        }
        calculateTotal();
    }

    private void calculateTotal() 
    {
        double sum = 0;
        for (FoodItem item : items) 
        {
            sum += item.getPrice(); 
        }
        
        double discount = applyDiscount(sum);
        this.totalAmount = sum - discount; 
    }

    private double applyDiscount(double amount) 
    {
        if (amount > 1000) {
            return amount * 0.20; 
        }
        else if (amount > 500)
        {
            return amount * 0.10; 
        }
        return 0;
    }

    @Override
    public void placeOrder() 
    {
        System.out.println("\n--- Order Confirmed ---");
        for (FoodItem item : items) 
        {
            System.out.println("- " + item.getName() + " (" + item.getPrice() + ")");
        }
        System.out.println("Final Total (after discount): ₹" + totalAmount);
    }

    @Override
    public void cancelOrder() 
    {
        System.out.println("Order has been cancelled. Refund initiated.");
    }
}


