package com.ritesh.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {

	public static void main(String[] args) {

		String temp = "";
		// System.out.println(temp.substring(0, 1));
		// System.out.println(temp.substring(1));
		System.out.println(temp.length());
		int i = 0;
		while (i < temp.length()) {
			System.out.println("hi");
			i++;
		}

		System.out.println();
		String[] strs = { "cat", "bat", "tac", "tab", "act" };
		List<List<String>> results = groupAnagrams(strs);
		for (List<String> result : results) {
			for (String r : result) {
				System.out.println(r);
			}
		}
		String str1 = "c";
		String str2 = "a";
		boolean ans = IsAnagram(str1, str2);
		if (ans) {
			System.out.println("Strings are anagram:  " + str1 + " " + str2);
		}
		else {
			System.out.println("Strings not are anagram: " + str1 + " " + str2);
		}

	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (String str : strs) {
			char[] arr = new char[26];
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - 'a']++;
			}
			String ns = new String(arr);

			if (map.containsKey(ns)) {
				map.get(ns).add(str);
			}
			else {
				ArrayList<String> al = new ArrayList<String>();
				al.add(str);
				map.put(ns, al);
			}
		}

		result.addAll(map.values());

		return result;
	}

	public static boolean IsAnagram(String str1, String str2) {

		if (str1.length() != str2.length())
			return false;

		int[] counter = new int[256];
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : str1.toCharArray()) {
			counter[c] += counter[c];
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}
			else {
				map.put(c, 1);
			}
		}

		for (char c : str2.toCharArray()) {
			counter[c]--;
			if (map.containsKey(c)) {
				if (map.get(c) > 1) {
					map.put(c, map.get(c) - 1);
				}
				else {
					map.remove(c);
				}
			}
			else {
				map.put(c, 1);
			}
		}

		return map.size() == 0;
		// for (int i = 0; i < 256; i++) {
		// if (counter[i] > 0)
		// return false;
		// }
		//
		// return true;
	}
}
