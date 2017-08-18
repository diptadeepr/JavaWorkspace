package com.dip.string;

public class UpperToLowerCase {
	public static void main(String args[]) {
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println("A ->" + (int) 'A' ); // 65
		System.out.println("a ->" + (int) 'a' ); // 97 
		
		StringBuilder s1 = convertToLower(s);
		System.out.println("Lower case String ->" + s1);
	}
	private static StringBuilder convertToLower(String s) {
		
		if(s == null || s.length() == 0)
			return new StringBuilder("");
		
		char[] c = s.toCharArray();
		StringBuilder newS = new StringBuilder("");
		for(int i=0; i<c.length - 1; i++) {
			int n = (int) c[i];
			n = n + 32;
			c[i] = (char) n;
			newS = newS.append(c[i]);
		}
		return newS;
		
	}
}
