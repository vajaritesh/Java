package com.ritesh.ds;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		int[] array = { 5, 9, 34, 5, 9 }; // 9534330
		String result = getLargestNumber(array);
		System.out.println(result);
	}

	private static String getLargestNumber(int[] arr) {
		Comparator<Long> comp = new Comparator<Long>() {

			@Override
			public int compare(Long o1, Long o2) {
				String r1 = o1 + "" + o2;
				String r2 = o2 + "" + o1;
				if (Long.parseLong(r1) > Long.parseLong(r2)) {
					return -1;
				}
				else {
					return 1;
				}
			}
		};
		Long[] array = convert(arr);
		Arrays.sort(array, comp);
		StringBuilder sb = new StringBuilder();
		for (Long num : array) {
			sb.append(num);
		}
		return sb.toString();
	}

	private static Long[] convert(int[] arr) {
		Long[] longArr = new Long[arr.length];
		int j = 0;
		for (int i : arr) {
			longArr[j++] = (long) i;
		}
		return longArr;
	}

}
