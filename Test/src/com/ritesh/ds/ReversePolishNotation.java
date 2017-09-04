package com.ritesh.ds;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		String[] input = { "2", "1", "+", "3", "*" };
		// String[] input = { "4", "13", "5", "/", "+" };
		int ans = evaluate(input);
		System.out.println(ans);

	}

	private static int evaluate(String[] input) {
		int ans = 0;
		String ch;
		int a = 0, b = 0;
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < input.length; i++) {
			ch = input[i];
			if (ch == "+" || ch == "-" || ch == "*" || ch == "/") {
				if (!s.isEmpty())
					a = s.pop();
				if (!s.isEmpty())
					b = s.pop();
				switch (ch) {
				case "+":
					ans = a + b;
					break;
				case "-":
					ans = b - a;
					break;
				case "*":
					ans = a * b;
					break;
				case "/":
					ans = b / a;
					break;
				}
				s.push(ans);
			}
			else {
				s.push(Integer.valueOf(String.valueOf(ch)));
			}
		}
		return s.pop();
	}
}
