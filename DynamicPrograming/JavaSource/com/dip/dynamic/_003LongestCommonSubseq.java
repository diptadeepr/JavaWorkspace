package com.dip.dynamic;

import java.util.*;

public class _003LongestCommonSubseq {
	public static void main(String args[]) {
		Strings s = new Strings();
		
		System.out.println("Matching Sub Seq -> " + s.getAllMatchingSeq("ABCDGH", "AEDFHR"));
		System.out.println("Matching Sub Seq -> " + s.getAllMatchingSeq("AGGTAB", "GXTXAYB"));
	}
}
class Strings {
	List<String> getAllMatchingSeq(String s1, String s2) {
		
		int start = 0;
		String s3 = s2;
		List<String> l = new ArrayList<>();
		
		for(int loop=0; loop<s1.length();loop++) {
			
			String s = "";
			s2 = s3;
			start = 0;
			
			for(int i = 0; i <s1.length(); i++) {
				for(int j = start; j < s2.length();j++) {
					
					if(s1.charAt(i) == s2.charAt(j)) {
						start = j+1;
						s = s + s1.charAt(i);
						break;
					}
				}
			}
			l.add(s); 
			s1 = s1.substring(1, s1.length());
		}
		
		return l;
	}
}
