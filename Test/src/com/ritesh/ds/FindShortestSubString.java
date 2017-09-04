package com.ritesh.ds;

public class FindShortestSubString {

	public static void main(String[] args) {
		String str = "aabbccba";
		String sub = "abc";
		findShortestSubString(str, sub);

	}

	private static void findShortestSubString(String str, String sub) {

		StringBuilder sb = new StringBuilder();
		String shortSubString = "";
		int shortSubStringLen = Integer.MAX_VALUE;
		int k = 0;
		for (int j = 0; j < str.length(); j++) {
			for (int i = j; i < str.length(); i++) {

				// if (sub.indexOf(str.charAt(i)) >= 0)
				// if (sub.indexOf(str.charAt(i)) >= 0)
				if (validChar(str.charAt(i), sub, i, k)) {
					sb.append(str.charAt(i));
				}
				else {
					if (sb.toString().contains(sub)) {
						if (shortSubStringLen > sb.toString().length()) {
							shortSubStringLen = sb.toString().length();
							shortSubString = sb.toString();
						}
						sb = new StringBuilder();
					}
				}
			}
		}
		System.out.println(shortSubString);
	}

	private static boolean validChar(Character ch, String str, int i, int k) {

		if (str.charAt(k) == ch) {
			return true;
		}

		return false;
	}
}
