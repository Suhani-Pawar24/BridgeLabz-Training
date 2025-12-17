import java.util.*;
public class VolumeOfEarth{
	public static void main(String[] args){
	// Creating variable and assigning value to it
	double radius = 6378;
	double pi = 3.14;
	
	//Created a variable for each kilometer per miles 
	double kmPerMile = 0.6; 
	
	//Computing volume of earth in kilometer	
	double volumeInKilometers = ( 4 / 3 ) * pi * (radius * 3);
	//Computing volume of earth in miles
	double volumeInMiles = volumeInKilometers / (kmPerMile*3);
	
	//Display result
	System.out.println(" The volume of earth in cubic kilometers is " + volumeInKilometers + " and cubic miles is " + volumeInMiles);
	}
}