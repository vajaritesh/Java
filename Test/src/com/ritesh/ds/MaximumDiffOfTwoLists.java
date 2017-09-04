package com.ritesh.ds;

public class MaximumDiffOfTwoLists {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, 5, 1, 1, 3 };
		// int arr[] = { 1, 3, -3 };
		int max = findMaxDifference(arr);
		System.out.println(max);
		findDiff(arr);
	}

	// Rakesh
	private static void findDiff(int[] A) {
		int temp = 0;
		int maxDiff = 0;
		int splitIndex = 0;
		for (int i = 0; i < A.length - 1; i++) {
			temp = A[i] - A[i + 1];
			if (maxDiff < temp) {
				maxDiff = temp;
				splitIndex = i;
			}
		}
		System.out.print("maximum Diff :" + maxDiff + " & SplitIndex :" + splitIndex);
	}

	// Ritesh
	private static int findMaxDifference(int[] arr) {
		int maxNumber1 = Integer.MIN_VALUE;
		int maxIndex = 0;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] > maxNumber1) {
				maxNumber1 = arr[i];
				maxIndex = i;
			}
		}
		int maxNumber2 = Integer.MIN_VALUE;
		for (int j = maxIndex + 1; j < arr.length; j++) {
			if (arr[j] > maxNumber2) {
				maxNumber2 = arr[j];
			}
		}

		return Math.abs(maxNumber1 - maxNumber2);
	}

}
