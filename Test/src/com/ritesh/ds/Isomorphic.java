package com.ritesh.ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Isomorphic {

	public static void main(String[] args) {
		String str1 = "egg";
		String str2 = "oop";
		boolean ans = isIsomorphic(str1, str2);
		if (ans) {
			System.out.println(str1 + " " + str2 + " are Isomorphic");
		}
		else {
			System.out.println(str1 + " " + str2 + " Not are Isomorphic");
		}
	}

	private static boolean isIsomorphic(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		char ch1, ch2;
		for (int i = 0; i < str1.length(); i++) {
			ch1 = str1.charAt(i);
			ch2 = str2.charAt(i);
			if (map1.containsKey(ch1)) {
				map1.put(ch1, map1.get(ch1) + 1);
			}
			else {
				map1.put(ch1, 1);
			}
			if (map2.containsKey(ch2)) {
				map2.put(ch2, map2.get(ch2) + 1);
			}
			else {
				map2.put(ch2, 1);
			}
		}

		return compareMaps(map1, map2);
	}

	private static boolean compareMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
		Iterator itr = map1.entrySet().iterator();
		int val;
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry) itr.next();
			val = (int) pair.getValue();
			if (!map2.containsValue(val)) {
				return false;
			}
		}
		return true;
	}
}
