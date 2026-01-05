package com.day3.swiftcraft;

class NonPerishableProduct extends Product
{
    NonPerishableProduct(String name, double price) 
    {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double getFinalPrice()
    {
        return price * 0.90; 
    }
}


