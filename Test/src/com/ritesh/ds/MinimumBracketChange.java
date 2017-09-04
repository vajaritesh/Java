package com.ritesh.ds;

import java.util.Stack;

public class MinimumBracketChange {

	public static void main(String[] args) {
		String str = "{{{{}}";
		int result = findMinBracketChange(str);
		if (result == -1) {
			System.out.println("Can't find");
		}
		else {
			System.out.println(result);
		}

	}

	private static int findMinBracketChange(String str) {
		int reverseBracketCnt = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '{') {
				stack.push(ch);
			}
			else {
				if (stack.isEmpty()) {
					reverseBracketCnt++;
				}
				else {
					stack.pop();
				}
			}
		}
		int remainingBacketSize = stack.size() - reverseBracketCnt;
		if (stack.size() == reverseBracketCnt) {
			return reverseBracketCnt * 2;
		}
		else if (remainingBacketSize % 2 != 0) {
			return -1;
		}
		else {
			return (remainingBacketSize / 2) + reverseBracketCnt * 2;
		}
	}

}
