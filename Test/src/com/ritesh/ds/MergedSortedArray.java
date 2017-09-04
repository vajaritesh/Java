package com.ritesh.ds;

public class MergedSortedArray {

	public static void main(String[] args) {

		int[] A = new int[15];
		int[] B = new int[5];

		A[0] = 10;
		A[1] = 15;
		A[2] = 17;
		A[3] = 19;
		A[4] = 20;

		B[0] = 3;
		B[1] = 4;
		B[2] = 6;
		B[3] = 8;
		B[4] = 9;

		merge(A, A.length, B, B.length);
		for (int i = 0; i < 10; i++) {
			System.out.println(A[i]);
		}

	}

	public static void merge(int A[], int m, int B[], int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (k >= 0) {
			if (j < 0 || (i >= 0 && A[i] > B[j]))
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
	}

}
