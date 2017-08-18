package com.dip.dynamic;

public class _003LongestCommonSubSeqDynamicProgram {
	public static void main(String args[]) {
		
		//String X = "ABCDGH";
		//String Y = "AEDFHR";
		
		String X = "AGGTAB";
		String Y = "GXTXAYB";
		
		char[] x = X.toCharArray();
		char[] y = Y.toCharArray();
		
		int m =x.length;
		int n =y.length;
		
		LongestSubSeq s = new LongestSubSeq();
		int length = s.getLongestSubSeq(x, y, m, n);
		
		System.out.println(" Length of the longest sub seq is -> " + length);
	}
}
class LongestSubSeq{
	int getLongestSubSeq(char[] x, char[] y, int m, int n) {
		int[][] l = new int[m+1][n+1]; // m rows and n columns
		
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= n; j++) {
				if( i == 0 || j == 0) {
					l[i][j] = 0;
				}
				if(i > 0 && j > 0) {
					if(x[i-1] == y[j-1]) { // NOTE:  i - 1 and j - 1 is required.
						l[i][j] = l[i-1][j-1] + 1;
					}else {
						l[i][j] = Math.max(l[i][j-1] , l[i-1][j]); 
					}
				}
			}
		}
		
		return l[m][n];
	}
}