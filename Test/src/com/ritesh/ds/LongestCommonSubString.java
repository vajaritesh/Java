package com.ritesh.ds;

public class LongestCommonSubString {

	public static void main(String[] args) {
		String str1 = "AABDD";
		String str2 = "BCCDD";
		String result = findLongestCommonSubString(str1, str2);
		System.out.println("Longest Common SubString: " + result);
		// for (String str : result) {
		// System.out.println(str);
		// }
	}

	private static String findLongestCommonSubString(String str1, String str2) {

		int len1 = str1.length();

		int len2 = str2.length();

		int[][] arr = new int[len1 + 1][len2 + 1];

		int len = 0, pos = -1;

		for (int i = 1; i < len1 + 1; i++) {

			for (int j = 1; j < len2 + 1; j++) {

				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {

					arr[i][j] = arr[i - 1][j - 1] + 1;

					if (arr[i][j] > len) {

						len = arr[i][j];

						pos = i;

					}

				}
				else

					arr[i][j] = 0;

			}

		}

		return str1.substring(pos - len, pos);

	}
}
