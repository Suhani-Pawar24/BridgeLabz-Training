package com.day7.foodloop;

public class TestFoodItem 
{
    public static void main(String[] args)
    {
 
        VegItem paneer = new VegItem("Paneer Tikka", 350.0, 20);
        VegItem naan = new VegItem("Butter Naan", 50.0, 50);
        NonVegItem chicken = new NonVegItem("Butter Chicken", 450.0, 15);

   
        System.out.println("Placing Regular Order...");
        Order smallOrder = new Order(paneer, naan);
        smallOrder.placeOrder();

        System.out.println("\n----------------------------");

       
        System.out.println("Placing Large Combo Order...");
        Order comboMeal = new Order(paneer, chicken, naan, naan, paneer);
        comboMeal.placeOrder();
    }
}


