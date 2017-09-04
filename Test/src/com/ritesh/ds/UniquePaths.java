package com.ritesh.ds;

public class UniquePaths {

	public static void main(String[] args) {
		int[][] input = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int m = input.length;
		int n = input[0].length;
		int result = findUniquePath(0, 0, m, n);
		System.out.println(result);
	}

	private static int findUniquePath(int i, int j, int m, int n) {
		if (i == m - 1 && j == n - 1) {
			return 1;
		}
		if (i < m - 1 && j < n - 1) {
			return findUniquePath(i + 1, j + 1, m, n);
		}
		if (i < m - 1) {
			return findUniquePath(i + 1, j, m, n);
		}
		if (j < n - 1) {
			return findUniquePath(i, j + 1, m, n);
		}
		return 0;
	}

}
