package com.ritesh.ds;

import java.util.ArrayList;
import java.util.Collections;

public class Temp6 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(5);

		ArrayList<Integer> result = plusOne(a);
		for (Integer r : result) {
			System.out.print(r + " ");
		}
	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int len = a.size();
		int temp;
		int j = 0;
		int carry = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		temp = a.get(len - 1) + 1;
		if (temp == 10) {
			result.add(j, 0);
			carry = 1;
		}
		else {
			result.add(j, temp);
		}
		j++;
		for (int i = len - 2; i >= 0; i--) {
			temp = a.get(i) + carry;
			if (temp == 10) {
				carry = 1;
				result.add(j, 0);
			}
			else if (i == 0 && a.get(i) == 0) {
				carry = 0;
			}
			else {
				result.add(j, temp);
				carry = 0;
			}
			j++;
		}
		if (carry == 1)
			result.add(j, carry);
		Collections.reverse(result);
		return result;
	}
}
