package com.ritesh.ds;

import java.util.HashMap;
import java.util.Map;

public class TwoSumPairsIndexes {

	public static void main(String[] args) {
		int[] input = { 12, 7, 21, 15 };
		int sum = 9;
		int[] ans = findTwoPairSumIndexes(input, sum);
		System.out.println(ans[0] + " " + ans[1]);
	}

	private static int[] findTwoPairSumIndexes(int[] input, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int element;
		int[] ans = new int[2];
		for (int i = 0; i < input.length; i++) {
			element = sum - input[i];
			if (map.containsKey(element)) {
				ans[0] = map.get(element);
				ans[1] = i;
			}
			else {
				map.put(input[i], i);
			}
		}
		return ans;
	}
}
