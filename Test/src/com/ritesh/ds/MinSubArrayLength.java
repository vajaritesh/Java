package com.ritesh.ds;

public class MinSubArrayLength {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		int sum = 7;
		int ans = minSubArrayLen(sum, nums);
		System.out.println(ans);
		int[] num = { 2, 3, 1, -2, 4, 3 };
		int r = maxProduct(num);
		System.out.println(r);

		int[] largestSubArraySum = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int sumResult = maxSubArray(largestSubArraySum);
		System.out.println(sumResult);

		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int area = maxArea(height);
		System.out.println(area);

	}

	public static int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length == 1)
			return 0;

		int result = nums.length;

		int start = 0;
		int sum = 0;
		int i = 0;
		boolean exists = false;

		while (i <= nums.length) {
			if (sum >= s) {
				exists = true; // mark if there exists such a subarray
				if (start == i - 1) {
					return 1;
				}

				result = Math.min(result, i - start);
				sum = sum - nums[start];
				start++;

			}
			else {
				if (i == nums.length)
					break;
				sum = sum + nums[i];
				i++;
			}
		}

		if (exists)
			return result;
		else
			return 0;
	}

	public static int maxProduct(int[] nums) {
		int[] max = new int[nums.length];
		int[] min = new int[nums.length];

		max[0] = min[0] = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > 0) {
				max[i] = Math.max(nums[i], max[i - 1] * nums[i]);
				min[i] = Math.min(nums[i], min[i - 1] * nums[i]);
			}
			else {
				max[i] = Math.max(nums[i], min[i - 1] * nums[i]);
				min[i] = Math.min(nums[i], max[i - 1] * nums[i]);
			}

			result = Math.max(result, max[i]);
		}

		return result;
	}

	public static int maxSubArray(int[] A) {
		int newsum = A[0];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			newsum = Math.max(newsum + A[i], A[i]);
			max = Math.max(max, newsum);
		}
		return max;
	}

	public static int maxArea(int[] height) {
		if (height == null || height.length < 2) {
			return 0;
		}

		int max = 0;
		int left = 0;
		int right = height.length - 1;

		while (left < right) {
			max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}

		return max;
	}
}
