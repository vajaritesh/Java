package com.ritesh.ds;

public class Test2 {

	public static void main(String[] args) {
		int num = convertStrToInt("1234");
		System.out.println(num);
		System.out.println(Character.getNumericValue('1'));

	}

	private static int convertStrToInt(String str) {
		// return Integer.parseInt(str);
		int strLength = str.length();
		int tempLength = 1;
		for (int j = 0; j < strLength - 1; j++) {
			tempLength *= 10;
		}

		int result = 0;
		for (int i = 0; i < strLength; i++) {
			Character c = str.charAt(i);
			// int tempResult = Character.getNumericValue(c);
			int tempResult = (int) c;
			result += tempResult * tempLength;
			tempLength = tempLength / 10;
		}
		return result;
	}

}
