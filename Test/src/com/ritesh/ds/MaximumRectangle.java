package com.ritesh.ds;

import java.util.Stack;

public class MaximumRectangle {

	public static void main(String[] args) {
		char[][] matrix =
		        { { '0', '1', '1', '0' }, { '1', '1', '1', '1' }, { '1', '1', '1', '1' }, { '1', '1', '0', '0' } };
		int ans = maximalRectangle(matrix);
		System.out.println(ans);
	}

	public static int maximalRectangle(char[][] matrix) {
		int m = matrix.length;
		int n = m == 0 ? 0 : matrix[0].length;
		int[][] height = new int[m][n + 1];

		int maxArea = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == '0') {
					height[i][j] = 0;
				}
				else {
					height[i][j] = i == 0 ? 1 : height[i - 1][j] + 1;
				}
			}
		}

		for (int i = 0; i < m; i++) {
			int area = maxAreaInHist(height[i]);
			if (area > maxArea) {
				maxArea = area;
			}
		}

		return maxArea;
	}

	private static int maxAreaInHist(int[] height) {
		Stack<Integer> stack = new Stack<Integer>();

		int i = 0;
		int max = 0;

		while (i < height.length) {
			if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
				stack.push(i++);
			}
			else {
				int t = stack.pop();
				max = Math.max(max, height[t] * (stack.isEmpty() ? i : i - stack.peek() - 1));
			}
		}

		return max;
	}
}
