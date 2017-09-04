package com.ritesh.ds;

public class OddOcurringNumber {

	public static void main(String[] args) {
		int[] input = { 2, 1, 2, 3, 3 };
		int ans = findOddOccurringNumber(input);
		System.out.println(ans);

	}

	private static int findOddOccurringNumber(int[] input) {
		int res = 0;

		for (int i = 0; i < input.length; i++) {
			res = res ^ input[i];
		}
		return res;
	}

}
