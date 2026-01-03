package com.inheritance.singleinheritance.smarthomedevices;

public class Thermostat extends Device 
{
	protected int temperatureSetting;
	
	public Thermostat(int deviceId, String status, int temperatureSetting)
	{
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	public void displayStatus()
	{
		super.displayStatus();
		System.out.println("TemperatureSetting : "+temperatureSetting);
	}

}
