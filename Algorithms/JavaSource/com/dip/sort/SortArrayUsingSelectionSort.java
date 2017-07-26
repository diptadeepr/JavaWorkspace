package com.dip.sort;

public class SortArrayUsingSelectionSort {

	private static final String INPUT_ARRAY = "Input Array :";
	private static final String SORTED_ARRAY = "Sorted Array :";

	public static void main(String args[]) {
		int arr[] = { 15, 19, 10, 7, 17, 16 };

		SelectionSort ss = new SelectionSort();
		ss.print(INPUT_ARRAY, arr);

		ss.sort(arr);

		ss.print(SORTED_ARRAY, arr);
	}
}

class SelectionSort {
	
	private static final String INTERMEDIATE_ARRAY = "Intermediate Array  -> ";
	
	public  void sort(int arr[]) {
		
		int n = arr.length;
		
		for(int i =  0; i < n; i ++) {
			int min_idx = i;
			for(int j = i + 1; j < n; j ++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			//swap
			int tmp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = tmp;
			
			print(INTERMEDIATE_ARRAY, arr);
		}
	}

	public void print(String desc, int arr[]) {

		System.out.print("\n" + desc);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
