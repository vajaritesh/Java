package com.ritesh.ds;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int size = 11;
		int[] arr = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		printArr(arr, size);
		System.out.println();
		int newSize = removeDuplicates(arr);
		printArr(arr, newSize);

	}

	private static void printArr(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int removeDuplicates(int[] arr) {
		int j = 0;
		arr[j++] = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			while (arr[i] == arr[i - 1]) {
				i++;
			}
			arr[j++] = arr[i];
		}
		return j;
	}

}
