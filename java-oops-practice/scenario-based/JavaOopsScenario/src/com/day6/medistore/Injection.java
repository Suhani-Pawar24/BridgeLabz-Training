package com.day6.medistore;

class Injection extends Medicine 
{
    public Injection(String name, double price, String expiryDate, int quantity)
    {
        super(name, price, expiryDate, quantity);
    }

    public Injection(String name, double price, String expiryDate)
    {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry()
    {
        System.out.println("Injection expiry checked using special storage rules");
    }
}

