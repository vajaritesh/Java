package com.ritesh.ds;

public class PowerOfFour {

	public static void main(String[] args) {
		int num = 16;
		if (isPowerOfFour(num)) {
			System.out.println(num + " is power of 4");
		}
		else {
			System.out.println(num + " is not power of 4");
		}
	}

	public static boolean isPowerOfFour(int num) {

		if (num <= 0) {
			return false;
		}

		if ((num & (num - 1)) != 0) {
			return false;
		}

		// check if the '1' bit is on the even position
		return (num & 0x55555555) != 0;
	}
}
