package com.ritesh.ds;

public class UniquePathWithObstacle {

	public static void main(String[] args) {
		int[][] input = { { 0, 0, 0 }, { 0, 1, 0, }, { 0, 0, 0 } };
		int result = findUniquePathWithObstacle(input);
		System.out.println(result);
	}

	private static int findUniquePathWithObstacle(int[][] input) {
		if (input == null || input.length == 0) {
			return 0;
		}

		int row = input.length;
		int col = input[0].length;

		if (input[0][0] == 1 || input[row - 1][col - 1] == 1) {
			return 0;
		}

		int[][] dp = new int[row][col];
		dp[0][0] = 1;

		// left column
		for (int i = 1; i < row; i++) {
			if (input[i][0] == 1) {
				dp[i][0] = 0;
			}
			else {
				dp[i][0] = dp[i - 1][0];
			}
		}

		// top row
		for (int i = 1; i < col; i++) {
			if (input[0][i] == 1) {
				dp[0][i] = 0;
			}
			else {
				dp[0][i] = dp[0][i - 1];
			}
		}

		// Inside cell
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (input[i][j] == 1) {
					dp[i][j] = 0;
				}
				else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}
		}
		return dp[row - 1][col - 1];
	}
}
