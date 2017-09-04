package com.ritesh.ds;

import java.util.ArrayList;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		String str = "abc";
		List<String> result = getCombination(str);
		display(result);

	}

	private static void display(List<String> resultList) {
		int i = 1;
		for (String result : resultList) {
			System.out.println(i++ + " " + result);
		}
	}

	private static List<String> getCombination(String str) {
		List<String> list = new ArrayList<String>();
		String subStr = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j <= str.length() - i; j++) {
				subStr = str.substring(i, i + j);
				// System.out.println(subStr);
				list.add(subStr);
			}
		}
		return list;
	}
}
