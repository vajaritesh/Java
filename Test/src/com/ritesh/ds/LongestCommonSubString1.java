package com.ritesh.ds;

public class LongestCommonSubString1 {

	public static void main(String[] args) {
		String str1 = "LCLC";
		String str2 = "CLCL";
		String result = findLongestCommonSubString(str1, str2);
		System.out.println("Longest Common SubString: " + result);
		// for (String str : result) {
		// System.out.println(str);
		// }
	}

	private static String findLongestCommonSubString(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty())
			return "";

		// ignore case
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();

		// java initializes them already with 0
		int[][] num = new int[str1.length()][str2.length()];
		int maxlen = 0;
		int lastSubsBegin = 0;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					if ((i == 0) || (j == 0))
						num[i][j] = 1;
					else
						num[i][j] = 1 + num[i - 1][j - 1];

					if (num[i][j] > maxlen) {
						maxlen = num[i][j];
						// generate substring from str1 => i
						int thisSubsBegin = i - num[i][j] + 1;
						if (lastSubsBegin == thisSubsBegin) {
							// if the current LCS is the same as the last time this block ran
							sb.append(str1.charAt(i));
						}
						else {
							// this block resets the string builder if a different LCS is found
							lastSubsBegin = thisSubsBegin;
							sb = new StringBuilder();
							sb.append(str1.substring(lastSubsBegin, i + 1));
						}
					}
				}
			}
		}

		return sb.toString();
	}
}
