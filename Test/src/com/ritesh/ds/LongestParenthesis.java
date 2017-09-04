package com.ritesh.ds;

import java.util.Stack;

public class LongestParenthesis {

	public static void main(String[] args) {
		String str = ")((((";
		int result = findLongestParenthesis(str);
		System.out.println(result);
	}

	private static int findLongestParenthesis(String str) {
		int cnt = 0;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				stack.push(ch);
			}
			else {
				if (!stack.isEmpty()) {
					stack.pop();
					cnt++;
				}
			}
		}
		return cnt * 2;
	}

}
