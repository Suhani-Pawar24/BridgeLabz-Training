import java.util.*;
public class DistributingPens{
	public static void main(String[] args){
	//Create multiline variable for pens and numberOfStudents
	int pens = 14, numberOfStudents = 3;
	
	//Calculating distributed pens
	int penPerStudent = pens / numberOfStudents;
	//Calculating not distributed pens
	int penLeft = pens % numberOfStudents;
	
	//Display result
	System.out.println(" The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + penLeft);
	}
}