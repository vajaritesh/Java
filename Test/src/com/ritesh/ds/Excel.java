package com.ritesh.ds;

import java.util.ArrayList;
import java.util.List;

class Excel {

	private static List<String> calculateExpression(String input) {
		String[] tempExpression = input.split(",");
		Excel s = new Excel();
		List<String> result = new ArrayList<String>();
		for (String exp : tempExpression) {
			String tempResult = s.calculate(exp, result, tempExpression);
			result.add(tempResult);
		}
		return result;
	}

	private String calculate(String exp, List<String> result, String[] tempExpression) {
		String[] stack = exp.split("\\+");
		Integer answer = 0;
		String tempValue;
		int getIndex;

		// if(stack.length==1) {
		// if(isReference(stack[0])) {
		// return fetchIndexData(parseReference(stack[0]), result);
		// } else {
		// return stack[0];
		// }
		// }
		// if(stack.length>1) {

		for (String value : stack) {
			if (isReference(value)) {
				getIndex = parseReference(value);
				tempValue = fetchIndexData(getIndex, result, tempExpression);
				// answer += Integer.parseInt(tempValue);
				answer += Integer.parseInt(calculate(tempValue, result, tempExpression));
			}
			else {
				answer += Integer.parseInt(value);
			}
		}
		// }
		return "" + answer;

	}

	private boolean isReference(String input) {
		return (input.charAt(0) == 'A') ? true : false;
	}

	// TODO review this
	private int parseReference(String input) {
		return Integer.parseInt(input.substring(1, input.length()));
	}

	private String fetchIndexData(int index, List<String> result, String[] tempExpression) {
		if (index > result.size()) {
			return tempExpression[index];
		}
		else {
			return result.get(index);
		}
	}

	private static void printResult(List<String> result) {
		// System.out.println(Collection.toString(result));
		for (String s : result) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// String input = "100+202,200,A0+1000,A1+10000";
		// output
		// 302
		// 200
		// 1302
		// 10200

		String input = "A1+1,A2+2,100";
		// String input = "10,A1+2,A3+100, 200";
		// 103
		// 102
		// 100

		List<String> result = calculateExpression(input);
		printResult(result);
	}
}
