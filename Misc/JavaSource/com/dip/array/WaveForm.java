package com.dip.array;

public class WaveForm {
	public static void main(String args[]) {
		int[] arr = {20 , 3, 4, 19, 21, 44};
		SortInWaveForm s = new SortInWaveForm();
		
		for(int i =0; i < arr.length; i++)
			System.out.print("-> " + arr[i]);
		
		s.sort(arr);
		
		System.out.println("");
		for(int i =0; i < arr.length; i++)
			System.out.print("-> " + arr[i]);
	}

}
class SortInWaveForm{
	int[] sort(int[] arr) {
		
		for(int i =0; i < arr.length -1 ; i++) {
			if(arr[i] < arr[i+1] || arr[i+1] > arr[i]) {
				//swap(arr[i], arr[i+1]);
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
				
			} 
		}
		return arr;
	}
}