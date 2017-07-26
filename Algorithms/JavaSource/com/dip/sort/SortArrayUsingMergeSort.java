package com.dip.sort;

public class SortArrayUsingMergeSort {

	private static final String INPUT_ARRAY = "Input Array : ";
	private static final String SORTED_ARRAY = "Sorted Array : ";

	public static void main(String args[]) {

		int ar[] = { 38, 27, 43, 3, 9, 82, 10 };

		MergeSort ms = new MergeSort();
		ms.print(INPUT_ARRAY, ar);

		ms.sort(ar, 0, ar.length - 1); // l - begin of the array , r end of the array

		ms.print(SORTED_ARRAY, ar);

	}
}

class MergeSort {

	private static final String LEFT_SUBARRAY = "Left sub Array : ";
	private static final String RIGHT_SUBARRAY = "Right sub Array : ";
	private static final String MERGED_SUB_ARRAY = "Merged Array :";

	public void sort(int arr[], int l, int r) {

		if (l < r) {
			int m = (l + r) / 2; // Middle of the array

			// System.out.println("In sort ->" + " l : " + l + " m : " + m + " r :" + r);

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	private void merge(int arr[], int l, int m, int r) {

		System.out.println("In Merge -> " + " l :" + l + " m :" + m + " r : " + r);

		int n1 = m - l + 1; // Length of the left array
		int n2 = r - m; // length of the right array

		// create new temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; j++)
			R[j] = arr[m + j + 1];

		print(LEFT_SUBARRAY, L);
		print(RIGHT_SUBARRAY, R);

		// compare the two sub arrays
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// copy the remaining elements from left sub array
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// copy the remaining elements from right sub array
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

		print(MERGED_SUB_ARRAY, arr);
	}

	public void print(String desc, int arr[]) {

		int n = arr.length;
		System.out.println(desc);

		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println("\n -------------------------------------------------");
	}
}
