package com.day5.robowarehouse;

import java.util.Arrays;

public class ShelfLoading 
{
	public static void insertionSortWeight(int weight[])
	{
		int n = weight.length;
		for(int i = 1; i < n; i++)
		{
			int key = weight[i];
		    int j = i - 1;
		    
		    while(j >= 0 && weight[j] > key)
		    {
		    	weight[j+1] = weight[j];
		    	j = j - 1;
		    }
		    weight[j+1] = key;
			
		}
		System.out.println(Arrays.toString(weight));
	}
	
	
	public static void main(String[] args)
	{
		int[] weight = { 41,25,34,53,93,76,20,54,63};
		System.out.println("Weight before sorting : "+Arrays.toString(weight));
		System.out.println("Weight after sorting through insertion sort ");
		insertionSortWeight(weight);
	}

}
