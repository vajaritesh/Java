package com.ritesh.ds;

import java.util.HashSet;
import java.util.Set;

public class MyLogestSubString {

	public static void main(String[] args) {
		// String str = "java_language_is_sweet";
		String str = "abcabcbb";
		findLogestSubStringSet(str);
	}

	private static void findLogestSubStringSet(String str) {
		String longestString = null;
		String newLongestString = null;
		Set<String> set = new HashSet<String>();

		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			longestString = getNonRepeatingSubString(i, str);
			if (max <= longestString.length()) {
				if (max < longestString.length()) {
					set.remove(newLongestString);
					newLongestString = longestString;
					set.add(newLongestString);
				}
				else {
					set.add(longestString);
				}
				max = longestString.length();

			}
		}
		for (String result : set) {
			System.out.print(result + " ");
		}

	}

	private static String getNonRepeatingSubString(int i, String str) {
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<Character>();
		for (int j = i; j < str.length(); j++) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				sb.append(str.charAt(j));
			}
			else {
				return sb.toString();
			}
		}
		return sb.toString();
	}

}
