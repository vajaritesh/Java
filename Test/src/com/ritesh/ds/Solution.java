package com.ritesh.ds;

public class Solution {

	public static void main(String[] args) {
		int num = 955;
		int[] binaryArr = new int[30];
		int len = convertBinary(num, binaryArr);
		printBinary(binaryArr, len);
		int numPeriod = findPeriod(binaryArr, len);
		System.out.println(numPeriod);
	}

	private static int convertBinary(int num, int[] binaryArr) {

		int len = 0;

		while (num > 0) {
			binaryArr[len] = num % 2;
			num /= 2;
			len++;
		}
		return len;
	}

	private static void printBinary(int[] binaryArr, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(binaryArr[i] + " ");
		}
		System.out.println();

	}

	private static int findPeriod(int[] binaryArr, int len) {
		int period;
		for (period = 1; period < 1 + len; ++period) {
			int i;
			if (period <= len / 2) {
				boolean ok = true;
				for (i = 0; i < len - period; ++i) {
					if (binaryArr[i] != binaryArr[i + period]) {
						ok = false;
						break;
					}
				}
				if (ok) {
					return period;
				}
			}
		}
		return -1;
	}

}
