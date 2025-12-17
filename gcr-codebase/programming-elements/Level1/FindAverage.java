import java.util.*;
public class FindAverage{
	public static void main(String[] args){
	//Initializing marks of all three subjects	
	int maths = 94;
	int physics = 95;
	int chemistry = 96;
	
	//Computing average
	int total = maths + physics + chemistry;
	double average = (total / 300.0) * 100;
	
	//Display average
	System.out.println(" Sam's average mark in PCM is " + average);
	}
}