package com.dip.sort;

public class SortArrayUsingQuickSort {

	private static final String INPUT_ARRAY = "Input Array : ";
	private static final String SORTED_ARRAY = "Sorted Array : ";

	public static void main(String args[]) {

		int arr[] = { 10, 80, 5, 90, 15, 50, 70 };

		QuickSort qs = new QuickSort();
		qs.print(INPUT_ARRAY, arr);

		qs.quickSort(arr, 0, arr.length - 1);

		qs.print(SORTED_ARRAY, arr);
	}
}

class QuickSort {

	private static final String PARTITIONED_ARRAY = "Partitioned Array : ";

	public void quickSort(int arr[], int l, int r) {

		if (l < r) {
			int pi = partition(arr, l, r);

			quickSort(arr, l, pi - 1); // Position before pi
			quickSort(arr, pi + 1, r); // Position after pi
		}
	}

	private int partition(int arr[], int l, int r) {
		int pivot = arr[r];

		int i = l - 1; // i is set to -1 for the first time

		for (int j = l; j < r; j++) {
			if (arr[j] <= pivot) {
				i++;

				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}

		// swap pivote with i + 1 position and return i

		int tmp = pivot;
		arr[r] = arr[i + 1];
		arr[i + 1] = tmp;

		print(PARTITIONED_ARRAY, arr);

		return i + 1;
	}

	public void print(String desc, int arr[]) {

		System.out.print("\n" + desc);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
