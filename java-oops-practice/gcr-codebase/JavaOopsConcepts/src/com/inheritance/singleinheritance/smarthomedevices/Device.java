package com.inheritance.singleinheritance.smarthomedevices;

public class Device 
{
	protected int deviceId;
	protected String status;
	
	public Device(int deviceId, String status )
	{
		this.deviceId = deviceId;
		this.status = status;
		
	}
	
	public void displayStatus()
	{
		System.out.println("Device is Active");
		System.out.println("Device ID : "+deviceId);
		System.out.println("Status : "+status);
	}

}
