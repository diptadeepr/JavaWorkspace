package com.dip.dynamic;

public class _001FibonacciNumbers {
	public static void main(String args[]) {
		
		Fibonacci f = new Fibonacci();
		 
		System.out.println("The number at pos 5 is -> " + f.getNumber(5));
		System.out.println("The number at pos 7 is -> " + f.getNumber(7));
	}
}
class Fibonacci {
	long getNumber(int pos){
		
		if(pos == 0)
			return 0;
		if(pos == 1)
			return 1;
		
		 //Fibonacci series ->  0 1 1 2 3 5 8 13  
		
		return getNumber(pos - 1) + getNumber(pos - 2); 
	}
}