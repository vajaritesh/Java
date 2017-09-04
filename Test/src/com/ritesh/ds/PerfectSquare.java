package com.ritesh.ds;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int a=4;
		int b = 17;
				
		int result = perfectSql(a,b);
		System.out.println(result);

	}

	private static int perfectSql(int a, int b) {
		
		return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) +1);

	}

}
