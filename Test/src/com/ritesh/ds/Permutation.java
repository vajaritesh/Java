package com.ritesh.ds;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		String str = "abc";
		List<String> resultList = new ArrayList<String>();
		getPermutation("", str, resultList);
		display(resultList);
	}

	private static void display(List<String> resultList) {
		int i = 1;
		for (String result : resultList) {
			System.out.println(i++ + " " + result);
		}
	}

	private static void getPermutation(String ithChar, String str, List<String> resultList) {
		if (str.isEmpty()) {
			resultList.add(ithChar);
		}
		else {
			for (int i = 0; i < str.length(); i++) {
				String tempFirstChar = ithChar + str.charAt(i);
				String tempStrBeforeIthCharChar = str.substring(0, i);
				String tempStrAfterIthCharChar = str.substring(i + 1, str.length());
				String tempStr = tempStrBeforeIthCharChar + tempStrAfterIthCharChar;
				getPermutation(tempFirstChar, tempStr, resultList);
			}
		}

	}
}
