package com.ritesh.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstIndexANAGRAMString {

	public static void main(String[] args) {
		// String str = "abdcghbaabcdij";
		// String pattern = "bcda";
		String str = "ABCDBACDAB";
		String pattern = "AB";
		List<Integer> result = findAnagram(str, pattern);
		for (Integer i : result) {
			System.out.print(i + " ");
		}
	}

	private static List<Integer> findAnagram(String str, String pattern) {
		List<Integer> result = new ArrayList<Integer>();
		List<String> anagrams = new ArrayList<String>();
		getAnagram("", pattern, anagrams);
		for (String s : anagrams) {
			// System.out.println(s);
			if (str.contains(s)) {
				int index = str.indexOf(s);
				while (index >= 0) {
					result.add(index);
					index = str.indexOf(s, index + 1);
				}

			}
		}
		Collections.sort(result);
		return result;
	}

	private static void getAnagram(String perm, String word, List<String> anagrams) {
		if (word.isEmpty()) {
			anagrams.add(perm + word);
		}
		else {
			for (int i = 0; i < word.length(); i++) {
				getAnagram(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()), anagrams);
			}
		}
	}
}
