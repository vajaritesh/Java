package com.ritesh.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SumTwo {

	List<Integer> numbers = new ArrayList<Integer>();
	Set<Integer> set = new HashSet<Integer>();

	public void add(int n) {
		numbers.add(n);
	}

	public boolean find(int x) {
		for (Integer n : numbers) {
			if (set.contains(x - n)) {
				return true;
			}
			else {
				set.add(n);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 2, 7, 7 };
		int[] sortedArr = { 2, 2, 7, 7 };
		int target = 9;
		int[] result = twoSum(arr, target);
		System.out.println(result[0] + "," + result[1]);
		// int[] ans = twoSumSorted(sortedArr, target);
		// System.out.println(ans[0] + "," + ans[1]);
		//
		// SumTwo obj = new SumTwo();
		// obj.numbers.add(1);
		// obj.numbers.add(3);
		// obj.numbers.add(5);
		// System.out.println(obj.find(4));
		// System.out.println(obj.find(7));

	}

	public static int[] twoSum(int[] arr, int target) {
		int[] result = { -1, -1 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int diff;
		for (int i = 0; i < arr.length; i++) {
			diff = target - arr[i];
			if (map.containsKey(diff)) {
				result[0] = map.get(diff);
				result[1] = i;
				return result;
			}
			else {
				map.put(arr[i], i);
			}
		}
		return result;
	}

	public static int[] twoSumSorted(int[] arr, int target) {
		int[] result = { -1, -1 };
		int low = 0;
		int high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[low] + arr[mid] == target) {
				result[0] = low;
				result[1] = mid;
				return result;
			}
			else if (arr[low] + arr[mid] < target) {
				low++;
			}
			else if (arr[low] + arr[mid] > target) {
				high = mid - 1;
			}

			if (arr[high] + arr[mid] == target) {
				result[0] = mid;
				result[1] = high;
				return result;
			}
			else if (arr[mid] + arr[high] > target) {
				high--;
			}
			else if (arr[mid] + arr[high] < target) {
				low = mid + 1;
			}
		}
		return result;
	}

}
