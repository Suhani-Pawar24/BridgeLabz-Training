package com.day7.artify;

public class DigitalArt extends Artwork 
{
	    public DigitalArt(String title, String artist, double price, boolean preview) 
	    {
	        super(title, artist, price, preview);
	    }

	    @Override
	    public void purchase(User buyer) 
	    {
	        System.out.println("Processing Digital Download for: " + title);
	        buyer.deductBalance(this.price);
	        System.out.println("Balance after purchase: $" + buyer.getWalletBalance());
	    }

	    @Override
	    public void license(User buyer) 
	    {
	     
	        double licenseFee = this.price * 0.5; 
	        buyer.deductBalance(licenseFee);
	        System.out.println("Licensed " + title + " for Digital Social Media use.");
	        System.out.println("Terms: " + getLicensingTerms());
	    }
}

	



