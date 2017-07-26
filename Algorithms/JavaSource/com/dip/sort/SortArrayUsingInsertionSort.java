package com.dip.sort;

public class SortArrayUsingInsertionSort {

	private static final String INPUT_ARRAY = "Input Array :";
	private static final String SORTED_ARRAY = "Sorted Array :";

	public static void main(String args[]) {
		int arr[] = { 15, 19, 10, 7, 17, 16 };

		InsertionSort is = new InsertionSort();
		is.print(INPUT_ARRAY, arr);

		is.sort(arr);

		is.print(SORTED_ARRAY, arr);
	}
}

class InsertionSort {

	private static final String INTERMEDIATE_ARRAY = "Intermediate Array 1 -> ";

	public void sort(int arr[]) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				// Shift the previous elements
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;

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
