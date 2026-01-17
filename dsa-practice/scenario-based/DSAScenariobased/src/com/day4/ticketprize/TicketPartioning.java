package com.day4.ticketprize;
import java.util.Arrays;
public class TicketPartioning 
{
	public static void priceOptimizer(int[] arr,int low,int high)
	{
		if(low < high)
		{	
		int pivotIndex = ticketPartition(arr,low,high);
		priceOptimizer(arr,low,pivotIndex-1);
		priceOptimizer(arr,pivotIndex+1,high);
		}
	}	
	
	public static int ticketPartition(int[] arr,int low,int high)
	{
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);;
		return i+1;
	}
	public static void swap(int[] arr,int i,int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {100, 2000, 300000,400, 500,5000};
		System.out.println("Ticket price before sorting"+Arrays.toString(arr));
		priceOptimizer(arr, 0, arr.length - 1);
		System.out.println("Ticket price after sorting"+Arrays.toString(arr));
	}
}
	

