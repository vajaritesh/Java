package com.ritesh.ds;

public class RotateArray {

	public static void main(String[] args) {
		// int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		int[] input = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		int k = 3;
		// rotateArra1(input, k);
		// rotateArray2(input, k);
		int ans = rotateArray3(input, k);
		System.out.println(ans);
		// printArray(input);

	}

	private static int rotateArray3(int[] input, int k) {
		int low = 0;
		int high = input.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (input[mid] == k) {
				return mid;
			}
			else if (k > input[low] - input[mid] && k <= input[mid] - input[high]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;

	}

	// Method 2
	// private static void rotateArray2(int[] input, int k) {
	// if (k > input.length) {
	// k = k % input.length;
	// }
	// int index = input.length - k;
	// reverse(input, 0, index - 1);
	// reverse(input, index, input.length - 1);
	// reverse(input, 0, input.length - 1);
	// }
	//
	// private static void reverse(int[] arr, int left, int right) {
	// int temp;
	//
	// while (left < right) {
	// temp = arr[left];
	// arr[left] = arr[right];
	// arr[right] = temp;
	// left++;
	// right--;
	// }
	// }
	//
	// // Method 1
	// private static void rotateArray1(int[] arr, int k) {
	// int index = arr.length - k;
	// int temp, ind = 0;
	// int[] tempArr = new int[index];
	// for (int j = index; j < arr.length; j++) {
	// tempArr[ind++] = arr[j];
	// }
	// index--;
	// for (int i = arr.length - 1; index >= 0; i--) {
	// arr[i] = arr[index];
	// index--;
	// }
	// for (int s = 0; s < ind; s++) {
	// arr[s] = tempArr[s];
	// }
	// }

	private static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
