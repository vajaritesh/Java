package com.ritesh.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class checkPermutation {

	public static void main(String[] args) {
		String a = "abc";
		String b = "bca";
		// boolean ans = isPermutation(a, b);
		boolean ans = arePermutations(a, b);
		System.out.println(ans);
	}

	private static boolean isPermutation(String a, String b) {
		List<String> resultList = new ArrayList<String>();
		getPermutation("", a, resultList);
		for (String s : resultList) {
			if (s.equals(b)) {
				return true;
			}
		}
		return false;

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

	private static boolean arePermutations(String a, String b) {

		if (a.length() != b.length()) {
			return false;
		}

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			if (charMap.containsKey(a.charAt(i))) {
				charMap.put(a.charAt(i), charMap.get(a.charAt(i)) + 1);
			}
			else {
				charMap.put(a.charAt(i), 1);
			}
		}

		int cnt = 0;
		for (int j = 0; j < b.length(); j++) {
			if (charMap.containsKey(b.charAt(j))) {
				cnt = charMap.get(b.charAt(j));
				cnt--;
				if (cnt < 0) {
					return false;
				}
				charMap.put(b.charAt(j), cnt);
			}
			else {
				return false;
			}
		}
		return true;
	}

}
