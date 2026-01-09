package com.day7.artify;

public abstract class Artwork implements IPurchasable 
{
	    protected String title;
	    protected String artist;
	    protected double price;
	    protected String licenseType;
	    private boolean hasPreview;

	    private String licensingTerms = "Standard Digital Usage Rights";


	    public Artwork(String title, String artist, double price)
	    {
	        this.title = title;
	        this.artist = artist;
	        this.price = price;
	        this.hasPreview = false;
	    }

	    public Artwork(String title, String artist, double price, boolean preview) 
	    {
	        this(title, artist, price); 
	        this.hasPreview = preview;
	    }

	    protected String getLicensingTerms()
	    {
	    	return licensingTerms; 
	    }
	    
	    public void displayArt() 
	    {
	        System.out.println("\nArtwork: " + title + " | Artist: " + artist);
	        System.out.println("Price: $" + price + " | Preview Available: " + (hasPreview ? "Yes" : "No"));
	    }
}


