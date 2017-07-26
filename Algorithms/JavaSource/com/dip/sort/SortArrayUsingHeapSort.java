package com.dip.sort;

public class SortArrayUsingHeapSort {

	private static final String INPUT_ARRAY = "Input Array :";
	private static final String SORTED_ARRAY = "Sorted Array :";

	public static void main(String args[]) {
		int arr[] = { 15, 19, 10, 7, 17, 16 };

		HeapSort hs = new HeapSort();
		hs.print(INPUT_ARRAY, arr);

		hs.sort(arr);

		hs.print(SORTED_ARRAY, arr);
	}
}

class HeapSort {

	private static final String INTERMEDIATE_ARRAY_1 = "Intermediate Array 1 -> ";
	private static final String INTERMEDIATE_ARRAY_2 = "Intermediate Array 2 -> ";

	public void sort(int arr[]) {

		int n = arr.length;

		// arrange array
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		print(INTERMEDIATE_ARRAY_1, arr);

		// Swap the first and last element and rearrange
		for (int i = n - 1; i >= 0; i--) {

			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;

			print(INTERMEDIATE_ARRAY_2, arr);

			heapify(arr, i, 0);
		}
	}

	public void heapify(int arr[], int n, int i) {

		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}

		if (r < n && arr[r] > arr[largest]) {
			largest = r;
		}

		if (largest != i) {

			// Swap
			int tmp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = tmp;

			heapify(arr, n, largest);
		}
	}

	public void print(String desc, int arr[]) {

		System.out.print("\n" + desc);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
