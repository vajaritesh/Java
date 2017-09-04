package com.ritesh.ds;

public class Matrix2DArray {

	public static void main(String[] args) {
		int[][] twoDArray = new int[4][4];
		twoDArray[0][0] = 0;
		twoDArray[0][1] = 1;
		twoDArray[0][2] = 9;
		twoDArray[0][3] = 3;
		twoDArray[1][0] = 7;
		twoDArray[1][1] = 5;
		twoDArray[1][2] = 8;
		twoDArray[1][3] = 3;
		twoDArray[2][0] = 9;
		twoDArray[2][1] = 2;
		twoDArray[2][2] = 9;
		twoDArray[2][3] = 4;
		twoDArray[3][0] = 4;
		twoDArray[3][1] = 6;
		twoDArray[3][2] = 7;
		twoDArray[3][3] = 1;
		printArray(twoDArray);
		int result = findPoints(twoDArray);
		System.out.println("saddle Points:" + result);
	}

	private static void printArray(int[][] twoDArray) {
		int rowSize = twoDArray.length;
		int colSize = twoDArray[0].length;
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------");

	}

	private static int findPoints(int[][] twoDArray) {
		int cnt = 0;
		int minMax = 0;
		int rowSize = twoDArray.length;
		int colSize = twoDArray[0].length;
		for (int i = 1; i < rowSize - 1; i++) {
			for (int j = 1; j < colSize - 1; j++) {
				System.out.print("(" + i + "," + j + ") =>" + twoDArray[i][j] + " "); // Debug
				// if (i > 0 && i < rowSize - 1) { //added condition in original for loop so not needed here
				minMax = findMinMax(i, twoDArray, rowSize, colSize);
				cnt += minMax;
				// }

			}
			System.out.println(); // Debug
		}
		return cnt;
	}

	private static int findMinMax(int i, int[][] twoDArray, int rowSize, int colSize) {
		int rowMin = Integer.MAX_VALUE;
		int rowMax = Integer.MIN_VALUE;
		int colMin = Integer.MAX_VALUE;
		int colMax = Integer.MIN_VALUE;
		int rowMinIndex = 0;
		int rowMaxIndex = 0;
		int colMinIndex = 0;
		int colMaxIndex = 0;
		for (int k = i; k < rowSize - 1; k++) {
			if (twoDArray[i][k] > rowMax) {
				rowMax = twoDArray[i][k];
				rowMaxIndex = k;
			}
			if (twoDArray[i][k] < rowMin) {
				rowMin = twoDArray[i][k];
				rowMinIndex = k;
			}
		}
		for (int k = 1; k < colSize - 1; k++) {
			if (twoDArray[k][rowMaxIndex] > colMax) {
				colMax = twoDArray[k][rowMaxIndex];
				colMaxIndex = k;
			}
			if (twoDArray[k][rowMinIndex] < colMin) {
				colMin = twoDArray[k][rowMinIndex];
				colMinIndex = k;
			}
		}
		if (rowMax == colMin || rowMin == colMax)
			return 1;
		else
			return 0;

		// System.out.println("MAx: " + max + " " + min); //Debug
	}

}
