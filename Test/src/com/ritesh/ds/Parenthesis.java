package com.ritesh.ds;

import java.util.Stack;

public class Parenthesis {

	public static void main(String[] args) {
		String[] str = new String[2];
		str[0] = "()()[]";
		str[1] = "{[}]}";
		String[] result = isBalanced(str);
		for (String ans : result) {
			System.out.println(ans);
		}
	}

	private static String[] isBalanced(String[] str) {
		int len = str.length;
		int strSize = 0;
		for (int i = 0; i < len; i++) {
			strSize = str[i].length();
			Stack<Character> stack = new Stack<Character>();
			for (int j = 0; j < strSize; j++) {
				char ch = str[i].charAt(j);
				if (ch == '(' || ch == '[' || ch == '{') {
					stack.push(ch);
				}
				else {
					char top = stack.peek();
					if ((ch == ')' && top == '(') || (ch == ']') || (ch == '}')) {

					}
				}
			}
		}
		return null;
	}
}
