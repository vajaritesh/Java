package com.ritesh.ds;

public class LongestFlatNumber {

	public static int longest_flat(int[] array) {
		int count = 1, max = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				count++;
			}
			else {
				if (count < max) {
					max = count;
				}
				else {
					count = 1;
				}
			}
		}
		if (count > max) {
			max = count;
		}

		return max;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 2, 2 };

		int result = longest_flat(a);
		System.out.println(result);
	}

}
