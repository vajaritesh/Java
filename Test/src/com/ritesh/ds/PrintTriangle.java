package com.ritesh.ds;

public class PrintTriangle {

	public static void main(String[] args) {

		int n = 3;
		printStars(n);
	}

	private static void printStars(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
// *
// * *
// * * *
// * * * *
// * * * * *
