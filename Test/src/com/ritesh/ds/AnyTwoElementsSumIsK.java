package com.ritesh.ds;

import java.util.HashSet;
import java.util.Set;

public class AnyTwoElementsSumIsK {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 100;
		boolean result = anyTwoElementSum(arr, k);
		if (result) {
			System.out.println("found elements");
		}
		else {
			System.out.println("not found elements");
		}

	}

	private static boolean anyTwoElementSum(int[] arr, int k) {

		Set<Integer> result = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			result.add(arr[i]);
		}
		int target;
		for (int i = 0; i < arr.length; i++) {
			target = k - arr[i];
			if (result.contains(target)) {
				return true;
			}
			else {
				result.add(arr[i]);
			}
		}
		return false;
	}
}
