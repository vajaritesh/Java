package com.ritesh.ds;

import java.util.HashSet;
import java.util.Set;

public class Temp4 {

	public static void main(String[] args) {
		// String str = "00110";
		String str = "000111";
		// int result = counting(str);
		int result = strPermutation(str);
		System.out.println("Final sum: " + result);

	}

	private static int strPermutation(String str) {
		String subStr = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j <= str.length() - i; j++) {
				subStr = str.substring(i, i + j);
				System.out.println(subStr);
				sum += countPattern(subStr);
				// System.out.println("sum: " + sum);
			}
		}
		return sum;
	}

	private static int countPattern(String sub) {
		int len = sub.length();
		if (len % 2 != 0)
			return 0;
		int sum0 = 0;
		int sum1 = 0;

		if (sub.charAt(0) == '0') {

			for (int i = 0; i < len / 2; i++) {
				if (sub.charAt(i) == '0') {
					sum0++;
				}
			}
			for (int j = len / 2; j < len; j++) {
				if (sub.charAt(j) == '1') {
					sum1++;
				}
			}
		}
		else if (sub.charAt(0) == '1') {
			for (int i = 0; i < len / 2; i++) {
				if (sub.charAt(i) == '1') {
					sum0++;
				}
			}
			for (int j = len / 2; j < len; j++) {
				if (sub.charAt(j) == '0') {
					sum1++;
				}
			}
		}
		if (sum0 == sum1 && len / 2 == sum0 && sum0 != 0) {
			return 1;
		}
		return 0;
	}

	private static int counting(String s) {

		int len = s.length();
		char[] ch = s.toCharArray();

		Set<String> strSet = new HashSet<String>();
		for (int k = 0; k < len; k++) {
			for (int i = k; i < len; i++) {
				StringBuilder sb = new StringBuilder();
				int cnt0 = 0;
				int cnt1 = 0;
				for (int j = k; j <= i; j++) {
					String sub = s.substring(i, i + j);
					System.out.println(sub);
					// System.out.print(ch[j]+" ");
					sb.append(ch[j]);
					// if(ch[j]=='1' && ch[j] == ch[j+1])
					// cnt1++;
					// if(ch[j]=='0' && ch[j] == ch[j+1])
					// cnt0++;
				}
				if (sb.length() > 2 && cnt0 == cnt1) {
					System.out.println("resut= " + sb.toString());
					strSet.add(sb.toString());
				}
				System.out.println();
			}
			System.out.println("New");
		}
		// System.out.println(strSet.size());
		return 0;
	}

}
