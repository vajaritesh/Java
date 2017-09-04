package com.ritesh.ds;

public class LCAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "tablet";
		String str2 = "reliable";
		String ans = findLCA(str1, str2);
		System.out.println(ans);
	}

	private static String findLCA(String str1, String str2) {
		int l1 = str1.length();
		int l2 = str2.length();

		int[][] arr = new int[l1 + 1][l2 + 1];
		int len = 0, pos = -1;

		for (int x = 1; x < l1 + 1; x++) {
			for (int y = 1; y < l2 + 1; y++) {
				if (str1.charAt(x - 1) == str2.charAt(y - 1)) {
					arr[x][y] = arr[x - 1][y - 1] + 1;
					if (arr[x][y] > len) {
						len = arr[x][y];
						pos = x;
					}
				}
				else
					arr[x][y] = 0;
			}
		}

		return str1.substring(pos - len, pos);
	}

}
