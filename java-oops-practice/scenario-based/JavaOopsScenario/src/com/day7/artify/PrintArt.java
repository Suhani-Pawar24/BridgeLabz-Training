package com.day7.artify;

public class PrintArt extends Artwork 
	{
	    public PrintArt(String title, String artist, double price) 
	    {
	        super(title, artist, price);
	    }

	    @Override
	    public void purchase(User buyer) 
	    {
	        System.out.println("Ordering Physical Print of: " + title);
	        double shipping = 15.0; 
	        buyer.deductBalance(this.price + shipping);
	        System.out.println("Balance after physical order (incl. shipping): $" + buyer.getWalletBalance());
	    }

	    @Override
	    public void license(User buyer)
	    {
	      
	        System.out.println("Licensed " + title + " for Commercial Print Publication.");
	        buyer.deductBalance(this.price * 2.0); 
	    }

}
