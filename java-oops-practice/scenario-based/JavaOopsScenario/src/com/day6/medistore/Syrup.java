package com.day6.medistore;

class Syrup extends Medicine
{
    public Syrup(String name, double price, String expiryDate, int quantity)
    {
        super(name, price, expiryDate, quantity);
    }

    public Syrup(String name, double price, String expiryDate)
    {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry()
    {
        System.out.println("Syrup expiry checked using liquid medicine rules");
    }
}



