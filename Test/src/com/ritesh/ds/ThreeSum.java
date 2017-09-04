package com.ritesh.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 7, 9, 11, 13, 15 };
		int sv = 30;
		List<List<Integer>> result = threeSum(nums, sv);
		System.out.println(result);

	}

	public static List<List<Integer>> threeSum(int[] nums, int sv) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums == null || nums.length < 3)
			return result;

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] > nums[i - 1]) {
				int j = i + 1;
				int k = nums.length - 1;

				while (j < k) {
					if (nums[i] + nums[j] + nums[k] == sv) {
						List<Integer> l = new ArrayList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[k]);
						result.add(l);

						j++;
						k--;

						// handle duplicate here
						while (j < k && nums[j] == nums[j - 1])
							j++;
						while (j < k && nums[k] == nums[k + 1])
							k--;

					}
					else if (nums[i] + nums[j] + nums[k] < sv) {
						j++;
					}
					else {
						k--;
					}
				}
			}

		}

		return result;
	}

}
