package com.day5.cropmonitorapp;
import java.util.Arrays;
public class sensordataordering 
{

	    // Method to initiate Quick Sort
	    public static void sortTimestamps(long[] timestamps, int low, int high) {
	        if (low < high) {
	            // Find the partition index
	            int pivotIndex = partition(timestamps, low, high);

	            // Recursively sort elements before and after partition
	            sortTimestamps(timestamps, low, pivotIndex - 1);
	            sortTimestamps(timestamps, pivotIndex + 1, high);
	        }
	    }

	    // Partitioning logic (Lomuto Scheme)
	    public static int partition(long[] timestamps, int low, int high) {
	        long pivot = timestamps[high]; // Choosing the latest timestamp as pivot
	        int i = (low - 1); // Index of smaller element

	        for (int j = low; j < high; j++) {
	            // If current timestamp is earlier than the pivot
	            if (timestamps[j] < pivot) {
	                i++;
	                swap(timestamps, i, j);
	            }
	        }

	        // Swap the pivot element to its correct sorted position
	        swap(timestamps, i + 1, high);
	        return i + 1;
	    }

	    // Helper method to swap elements in the array
	    public static void swap(long[] timestamps, int i, int j) {
	        long temp = timestamps[i];
	        timestamps[i] = timestamps[j];
	        timestamps[j] = temp;
	    }

	    public static void main(String[] args) {
	        // Sample sensor timestamps (Unix epoch time in milliseconds)
	        long[] sensorData = {
	            1737125335000L, 
	            1737125100000L, 
	            1737125800000L, 
	            1737125200000L, 
	            1737125500000L
	        };

	        System.out.println("Unordered Sensor Data: " + Arrays.toString(sensorData));

	        sortTimestamps(sensorData, 0, sensorData.length - 1);

	        System.out.println("Ordered Timestamps (Earliest First):");
	        for (long time : sensorData) {
	            System.out.println(time);
	        }
	    }
}


