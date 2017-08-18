package com.dip.dynamic;

/*
 * C(n, k) = C(n-1, k-1) + C(n-1, k)
 * C(n, 0) = C(n, n) = 1
 */

public class _002BinomialNumbers {
	public static void main(String args[]) {
		Binomial b = new Binomial();
		System.out.println("Binomial Number n=4 , k = 2 -> " + b.getNumber(4, 2));
		System.out.println("Binomial Number n=5 , k = 2 -> " + b.getNumber(5, 2));
	}
}
class Binomial {
	int getNumber(int row, int col) {
		
		if(col == 0 || col == row) {
			return 1;
		}
		 
		return getNumber((row - 1) , (col -1)) + getNumber((row -1) , col);
	}
}