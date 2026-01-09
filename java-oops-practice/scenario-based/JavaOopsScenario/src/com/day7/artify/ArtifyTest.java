package com.day7.artify;

public class ArtifyTest 
{
	    public static void main(String[] args)
	    {
	      
	        User buyer = new User("Suhani", 200.0);

	        DigitalArt cyberPunk = new DigitalArt("Neon City", "ArtistX", 50.0, true);
	        PrintArt oilCanvas = new PrintArt("Summer Forest", "Vinci", 120.0);

	      
	        cyberPunk.displayArt();
	        cyberPunk.license(buyer);

	        System.out.println("----------------------------------");

	       
	        oilCanvas.displayArt();
	        oilCanvas.purchase(buyer);
	    }
}


