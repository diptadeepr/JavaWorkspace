package com.dip.rec;

/**
 * 
 * @author DROY Problem : Find the sum up to a specific number
 */
public class SumOfNumbers {

	public static void main(String args[]) {

		// Find sum of numbers up to 100
		long s = sum(5);

		System.out.print(" sum is : " + s);
	}

	private static long sum(int num) {

		System.out.println(" number is : " + num);

		if (num == 1) {
			return 1;
		}

		long s = num + sum(num - 1);

		return s;
	}
}
