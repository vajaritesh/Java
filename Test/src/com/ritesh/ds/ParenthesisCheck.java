package com.ritesh.ds;

import java.util.Stack;

public class ParenthesisCheck {

	public static void main(String[] args) {
		String input = "{[}]}";
		boolean ans = checkParenthesis(input);
		if (ans) {
			System.out.println("Valid Parenthesis " + input);
		}
		else {
			System.out.println("Invalid Parenthesis " + input);
		}

	}

	private static boolean checkParenthesis(String input) {
		Stack<Character> s = new Stack<Character>();
		char temp, ch;
		if (input.length() < 2)
			return false;
		for (int i = 0; i < input.length(); i++) {
			temp = input.charAt(i);
			if (temp == '{' || temp == '[' || temp == '(') {
				s.push(temp);
			}
			else if (s.isEmpty()) {
				return false;
			}
			else {
				ch = s.peek();
				if ((ch == '{' && temp != '}') || (ch == '(' && temp != ')') || (ch == '[' || temp != ']')) {
					s.pop();
					continue;
				}
				else {
					return false;
				}
			}
		}
		if (s.isEmpty())
			return true;
		else
			return false;
	}

}
