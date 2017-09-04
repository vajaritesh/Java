package com.ritesh.ds;

public class SearchInRotationArray {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 8, 10, 1, 3 };
		for (int element : arr) {
			int result = findInRotationArray(arr, element);
			System.out.println("Search value: " + element + " Index: " + result);
		}

	}

	public static int findInRotationArray(int[] arr, int sv) {
		if (arr.length == 0)
			return -1;
		int mid = -1;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == sv)
				return mid;
			if (arr[low] < arr[mid]) {
				if (sv >= arr[low] && sv < arr[mid]) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
			}
			else {
				if (sv > arr[mid] && sv <= arr[high]) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
		}
		if (arr[low] == sv) {
			return low;
		}
		return mid;

	}

}
