package com.ritesh.ds;

import java.util.HashSet;
import java.util.Set;

public class CoinsOf3Faces {
	/*
	 * Given many coins of 3 different face values, print the combination sum of the coins up to 1000. Must be printed
	 * in order.
	 */
	public static void main(String[] args) {

		printSums(10, 15, 55);
	}

	public static void printSums(int c1, int c2, int c3) {

		Set<Integer> sums = new HashSet<>();
		sums.add(0);

		for (int sum = 1; sum <= 1000; sum++) {

			if (sums.contains(sum - c1) || sums.contains(sum - c2) || sums.contains(sum - c3)) {
				System.out.println(sum);
				sums.add(sum);
			}
		}
	}
}
