package com.ritesh.ds;

public class ReverseString {

	public static void main(String[] args) {
		String str = "the sky is blue";
		System.out.println(str);
		reverseString(str.toCharArray());

	}

	private static void reverseString(char[] str) {

		reverse(str, 0, str.length - 1);
		System.out.println(str);
		int j = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				reverse(str, j, i - 1);
				j = i + 1;
			}
		}
		reverse(str, j, str.length - 1);
		System.out.println(str);
	}

	private static void reverse(char[] charArr, int start, int end) {
		char ch;
		while (start < end) {
			ch = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = ch;
			start++;
			end--;
		}
	}
}
