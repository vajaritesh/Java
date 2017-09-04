package com.ritesh.ds;

public class SortingMergeSort {

	public static void main(String[] args) {
		int[] arr = { -1, 4, 0, 2, 7, 9 };
		printArr(arr);
		mergeSort(arr);
		printArr(arr);
	}

	private static void mergeSort(int[] arr) {

	}

	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
