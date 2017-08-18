package com.dip.string;

import java.util.*;

public class FirstNonRepeatingChar {

	public static void main(String args[]) {
		String str = "GeeksforGeeks";
		NonRepChar nonRep = new NonRepChar();
		System.out.println("First non repeating character in " + str + " is ->" + nonRep.getFirstNonRepeatingChar(str));
	}
}

class NonRepChar{
	char getFirstNonRepeatingChar(String s) {
		
		Map<Character , Integer> countMap = new HashMap<Character, Integer>(); 
		
		char[] c = s.toCharArray();
		int l = c.length;
		char nrepChar = ' ';
		
		int count;
		
		for(int i=0; i<l; i++) {
			try {
				 count = countMap.get(c[i]);
			}catch(Exception e) {
				count = 0;
			}
			count++;
			countMap.put(c[i], count);
		}
		
		System.out.println(countMap);
		
		for(int i=0; i<l; i++) {
			if(countMap.get(c[i]) == 1) {
				nrepChar = c[i];
				break;
			}
		}
		 
		return nrepChar;
	}
}