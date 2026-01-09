package com.day7.artify;

public class User 
{
	    private String name;
	    private double walletBalance;

	    public User(String name, double balance) 
	    {
	        this.name = name;
	        this.walletBalance = balance;
	    }

	    public double getWalletBalance() 
	    {
	    	return walletBalance;
	    }

	    public void deductBalance(double amount)
	    {
	        if (amount <= walletBalance)
	        {
	            this.walletBalance -= amount;
	        } 
	        else
	        {
	            System.out.println("Insufficient funds for " + name);
	        }
	    }

	    public String getName() 
	    {
	    	return name; 
	    }
}


