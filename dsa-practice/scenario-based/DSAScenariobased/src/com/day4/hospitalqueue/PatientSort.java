package com.day4.hospitalqueue;
import java.util.Arrays;

public class PatientSort 
{
	public static void criticalPatient(int records[])
	{
		int n = records.length;
		for(int i = 0; i < n - 1; i++)
		{
			for(int j = 0; j < n - 1 -i; j++)
			{
				if(records[j] > records [j+1])
				{
					int temp = records[j];
					records[j] = records[j+1];
					records[j+1] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(records));
	}
	public static void main(String[] args)
	{
		int[] records = {2,3,3,4,5,8,9,6,5,6,2,3,1,4,5,6};
		
		System.out.println("Patients record based on critical level");
		criticalPatient(records);
	}

}
