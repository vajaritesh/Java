package com.ritesh.ds;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 2, 4, 7, 8 };
		Set<Integer> ans = findIntersection(a, b);

		for (Integer num : ans) {
			System.out.println(num + " ");
		}

	}

	private static Set<Integer> findIntersection(int[] a, int[] b) {

		Set<Integer> aSet = new HashSet<Integer>();
		Set<Integer> ans = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			aSet.add(a[i]);

		}
		for (int i = 0; i < b.length; i++) {
			if (!aSet.add(b[i])) {
				ans.add(b[i]);
			}
		}
		return ans;
	}
}
