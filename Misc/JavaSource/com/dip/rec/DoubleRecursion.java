package com.dip.rec;

/**
 * @author DROY
 * Problem : Show the called methods and the values during double recursive calls
 */
public class DoubleRecursion {
	public static void main(String args[]) {

		DoubleRecursionDemo demo = new DoubleRecursionDemo();
		demo.doubleRecursion(5, 0);
	}
}

class DoubleRecursionDemo {
	void doubleRecursion(int y, int call) {

		System.out.println(" " + y + " (" + call + ") ");

		if (y <= 0) {
			return;
		}

		doubleRecursion(y - 2, 1);
		doubleRecursion(y - 1, 2);

	}
}
