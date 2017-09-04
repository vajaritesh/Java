package com.ritesh.ds;

public class mergedTwoSortedArray {

	public static void main(String[] args) {
		int arr1[] = { 2, -1, 7, -1, -1, 10, -1 };
		int arr2[] = { 5, 8, 12, 14 };
		mergedTwoSortedArray(arr1, arr2);
		printArray(arr1);

	}

	private static void printArray(int[] arr1) {
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

	private static void mergedTwoSortedArray(int[] arr1, int[] arr2) {
		int len1 = arr1.length - 1;
		int len2 = arr2.length - 1;
		int j = len1;
		System.out.print("First Original");
		printArray(arr1);
		boolean flag = false;
		for (int i = len1; i >= 0; i--) {
			if (arr1[i] != -1) {
				arr1[j] = arr1[i];
				j--;
				if (flag) {
					arr1[i] = -1;
				}
			}
			else {
				flag = true;
			}
		}
		System.out.print("Modfied Original");
		printArray(arr1);
		System.out.print("Second Original");
		printArray(arr2);
		int k;
		j++;
		for (int i = len2; i >= 0; i--) {
			k = j;
			while (k <= len1 && arr1[k] < arr2[i]) {
				arr1[k - 1] = arr1[k];
				k++;
			}
			k--;
			j--;
			arr1[k] = arr2[i];
		}

	}

}
