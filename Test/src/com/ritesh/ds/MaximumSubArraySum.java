package com.ritesh.ds;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = maximumSubArraySum(arr);
		System.out.println(maxSum);

	}

	private static int maximumSubArraySum(int[] A) {
		int newsum = A[0];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			newsum = Math.max(newsum + A[i], A[i]);
			max = Math.max(max, newsum);
		}
		return max;
	}
}
