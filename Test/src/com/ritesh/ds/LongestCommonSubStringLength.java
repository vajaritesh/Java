package com.ritesh.ds;

public class LongestCommonSubStringLength {

	public static void main(String[] args) {
		String str1 = "ABAB";
		String str2 = "BABA";
		int result = findLongestCommonSubStringLength(str1, str2);
		System.out.println(result);
	}

	private static int findLongestCommonSubStringLength(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] arr = new int[len1 + 1][len2 + 1];
		int result = 0;
		for (int i = 0; i <= len1; i++) {
			for (int j = 0; j <= len2; j++) {
				if (i == 0 || j == 0) {
					arr[i][j] = 0;
				}
				else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
					result = Math.max(result, arr[i][j]);
				}
				else {
					arr[i][j] = 0;
				}
			}
		}
		return result;
	}
}
