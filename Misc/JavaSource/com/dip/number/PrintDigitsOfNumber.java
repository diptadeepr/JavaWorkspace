package com.dip.number;

public class PrintDigitsOfNumber {
	public static void main(String args[]) {
		int num = 999;
		int digit;
		do {
			
			if(num < 10) {
				System.out.print(num);
			    num = num / 10;
			}
			else {
				digit = num/10;
				System.out.print(digit);
				num = num % 10;
			}
			
		}while(num > 0);
	}
}
