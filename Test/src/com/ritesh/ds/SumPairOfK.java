package com.ritesh.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumPairOfK {

	public static void main(String[] args) {
		int[] input = { 11, 5, 7, -1, 5, 3 };
		long k = 10;
		int ans = findNumberOfDistinctPairs(input, k);
		// System.out.println(ans);

	}

	private static int findNumberOfDistinctPairs(int[] input, long k) {

		if (input.length < 2) {
			return 0;
		}

		Map<Integer, Integer> result = new HashMap<Integer, Integer>();

		int target = 0;
		List<List<Integer>> ans = new ArrayList<>();
		for (int element : input) {
			target = (int) k - element;
			if (result.containsKey(element) || result.containsValue(element)) {
				List<Integer> a = new ArrayList<Integer>();
				a.add(element);
				a.add(target);
				ans.add(a);
			}
			else {
				result.put(element, target);
			}
		}
		for (List<Integer> l : ans) {
			for (Integer i : l) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// Iterator it = result.entrySet().iterator();
		// while (it.hasNext()) {
		// Map.Entry pair = (Map.Entry) it.next();
		// System.out.println(pair.getKey() + " = " + pair.getValue());
		// it.remove();
		// }
		// return result.size();
		return 1;

	}
}
