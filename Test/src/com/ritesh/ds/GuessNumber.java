package com.ritesh.ds;

public class GuessNumber {
	static int guessNumber = 1;

	public static void main(String[] args) {

		int n = 10;
		int ans = findGuessNumber(n);
		if (ans != -1) {
			System.out.println("Your guess number " + ans);
		}
		else {
			System.out.println("Coudn't find guess number ");
		}

	}

	private static int findGuessNumber(int n) {

		int low = 1;
		int mid;
		int high = n;
		int result;
		while (low <= high) {
			mid = (low + high - low) / 2;
			result = guessAPI(mid);
			if (result == 0)
				return mid;
			else if (result > 0) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}

	private static int guessAPI(int mid) {
		if (guessNumber == mid)
			return 0;
		else if (guessNumber > mid)
			return 1;
		else
			return -1;
	}

}
