package com.day2.compartmentnavigation;

public class Compartment 
{

	    String name;
	    Compartment prev;
	    Compartment next;

	    Compartment(String name) {
	        this.name = name;
	    }
}