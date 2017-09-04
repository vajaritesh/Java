package com.ritesh.ds;

import java.util.Arrays;

public class DistinctDigits {

	public static void main(String[] args) {

		int[] arr1 = { 1, 20 };
		int[] arr2 = { 9, 19 };
		int[][] a = { arr1, arr2 };

		countNumber(a);

	}

	private static void countNumber(int[][] a) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			cnt = 0;

			for (int j = a[i][0]; j <= a[i][a[i].length - 1]; j++) {
				if (j > 10) {
					boolean ans = hasDistinctDigits(j);
					if (ans) {
						cnt++;
					}
				}
				else {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

	public static boolean hasDistinctDigits(int number) {
		final int[] digits = new int[10];

		Arrays.fill(digits, 0);
		int digit;

		while (number > 0) {
			digit = number % 10;
			if (digits[digit]++ > 0)
				return false;
			number /= 10;
		}

		return true;
	}
}
