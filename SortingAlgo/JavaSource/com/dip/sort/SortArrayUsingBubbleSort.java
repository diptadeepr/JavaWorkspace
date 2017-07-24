package com.dip.sort;

/*We can use long values when the array length is more or the elements are long*/
public class SortArrayUsingBubbleSort {
	
	private static final String SORTED_ARRAY = "Sorted Array :";
	private static final String INPUT_ARRAY = "Input array :";

	public static void main(String args[]) {
		
		int arr[] = {5,8, 7, 4, 9};
		
		printArray(INPUT_ARRAY , arr); // print input array 
		
		bubbleSort(arr); // Sort the array 
		
		printArray(SORTED_ARRAY, arr);// print sorted array
	}

	private static void printArray(String description, int[] ar) {
		System.out.print(description);
		for (int j = 0 ; j < ar.length ; j++) {
			System.out.print(" " + ar[j]);
		}
		System.out.println("\n");
	}
	
    private static void bubbleSort(int arr[]) {
    	int n = arr.length;
    	
    	if (n == 0 ) {
    		return ;
    	}
    	
    	for (int i = 0; i < n - 1  ; i++) {
    		
    		boolean exit = true;
    		
    		for (int j = 0; j < n - i - 1; j++) {
    			
    			if(arr[j] > arr[j+1]) {
    				
    				int tmp = arr[j];
    				arr[j] = arr[j+1] ;
    				arr[j+1] = tmp;
    				
    				exit = false;
    			}
    		}
    		
    		if (exit) {
    			break; // array is already sorted if the inner loop did not swap any values
    		}
    	}
    	
    	 
    }
}
