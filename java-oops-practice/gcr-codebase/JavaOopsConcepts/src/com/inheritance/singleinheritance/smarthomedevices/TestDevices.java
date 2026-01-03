package com.inheritance.singleinheritance.smarthomedevices;

public class TestDevices {
	
	public static void main(String[] args)
	{
		Thermostat obj = new Thermostat(101, "ON", 24);
		obj.displayStatus();
	}

}
