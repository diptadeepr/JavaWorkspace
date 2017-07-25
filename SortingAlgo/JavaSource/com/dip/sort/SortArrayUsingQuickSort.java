package com.dip.sort;

public class SortArrayUsingQuickSort {
	
	private static final String INPUT_ARRAY = "Input Array : ";
	private static final String SORTED_ARRAY = "Sorted Array : ";
	private static final String PARTITIONED_ARRAY = "Partitioned Array : ";
	
	public static void main(String args[]) {
		
		int arr[] = {10, 80, 5, 90, 15, 50, 70};
		
		printArray(INPUT_ARRAY, arr);
		
		quickSort(arr, 0, arr.length - 1);
		
		printArray(SORTED_ARRAY, arr);
	}
	
	private static void quickSort(int arr[], int l, int r) {
		
		if(l < r ) {
			int pi = partition(arr, l, r);
			
			quickSort(arr, l , pi - 1 ); // Position before pi
			quickSort(arr, pi + 1, r);   // Position after pi
		}
	}
	
	private static int partition(int arr[], int l , int r) {
	    int pivot = arr[r];
	    
	    int i = l - 1 ; // i is set to -1 for the first time
	    
	    for(int j = l; j < r; j++ ) {
	    	if(arr[j] <= pivot) {
	    		i++;
	    		
	    		int tmp = arr[i];
	    		arr[i] = arr[j];
	    		arr[j] = tmp;
	    	}
	    }
	    
	    //swap pivote with i + 1 position and return i
	    
	    int tmp = pivot;
	    arr[r] = arr[i + 1];
	    arr[i + 1] = tmp;
	    
	    printArray(PARTITIONED_ARRAY , arr);
	    
		return i + 1;
	}
	private static void printArray(String desc, int arr[]) {
		
		System.out.print("\n" + desc);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
