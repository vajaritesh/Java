package com.ritesh.ds;

public class DecimalToBinary {

	public void printBinaryFormat(int number) {
		int binary[] = new int[25];
		int result = 0;
		int index = 0;
		int reverse = 0;
		while (number > 0) {
			binary[index++] = number % 2;
			result = result * 10 + number % 2;
			number = number / 2;
		}
		System.out.println("Need to reverse this number: " + result);
		while (result > 0) {
			reverse = reverse * 10 + result % 10;
			result = result / 10;
		}
		System.out.println("Binary Number: " + reverse);
		System.out.print("Same Binary Number: ");
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String a[]) {
		DecimalToBinary dtb = new DecimalToBinary();
		dtb.printBinaryFormat(25);
	}
}
