package com.ritesh.ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class StringManipulation {

	public static void main(String[] args) {
		// String str = "1226#24#";
		String str = "2110#(2)";
		Map<String, Integer> alpha = new HashMap<String, Integer>();
		createDefault(alpha);

		convert(str, alpha);
		Iterator it = alpha.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove();
		}

	}

	private static void convert(String str, Map<String, Integer> alpha) {

		Stack<Character> singleD = new Stack<Character>();
		Stack<String> DoubleD = new Stack<String>();

		Map<String, Integer> freqMap = new HashMap<String, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '#' && str.charAt(i) != '(' && str.charAt(i) != ')') {
				singleD.push(str.charAt(i));
			}
			if (str.charAt(i) == '#') {
				Character c1 = singleD.pop();
				Character c2 = singleD.pop();
				String temp = c2.toString() + c1.toString();
				DoubleD.push(temp);
			}
			if (str.charAt(i) == '(') {
				if (str.charAt(i - 1) == '#') {
					freqMap.put(DoubleD.peek(), Integer.parseInt(Character.toString(str.charAt(i + 1))));
				}
				else {
					freqMap.put(Character.toString(singleD.peek()),
					        Integer.parseInt(Character.toString(str.charAt(i + 1))));

				}
			}
		}

		for (int i = 0; i <= singleD.size(); i++) {
			Character key = singleD.peek();
			if (freqMap.containsKey(Character.toString(key))) {
				alpha.put(Character.toString(key), freqMap.get(key));
			}
			else {
				alpha.put(Character.toString(key), 1);
			}
			singleD.pop();
		}

		for (int i = 0; i <= DoubleD.size(); i++) {
			String key = DoubleD.peek();
			if (freqMap.containsKey(key)) {
				alpha.put(key, freqMap.get(key));
			}
			else {
				alpha.put(key, 1);
			}
			DoubleD.pop();
		}

	}

	private static void createDefault(Map<String, Integer> alpha) {
		alpha.put("1", 0);
		alpha.put("2", 0);
		alpha.put("3", 0);
		alpha.put("4", 0);
		alpha.put("5", 0);
		alpha.put("6", 0);
		alpha.put("7", 0);
		alpha.put("8", 0);
		alpha.put("9", 0);
		alpha.put("10", 0);
		alpha.put("11", 0);
		alpha.put("12", 0);
		alpha.put("13", 0);
		alpha.put("14", 0);
		alpha.put("15", 0);
		alpha.put("16", 0);
		alpha.put("17", 0);
		alpha.put("18", 0);
		alpha.put("19", 0);
		alpha.put("20", 0);
		alpha.put("21", 0);
		alpha.put("22", 0);
		alpha.put("23", 0);
		alpha.put("24", 0);
		alpha.put("25", 0);
		alpha.put("26", 0);
	}
}
