package com.ritesh.ds;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Temp2 {

	public static void main(String[] args) {
		String str = "Forget  CVs..Save time . x x";
		//String str = "We test coders. Give us a try?";
		
		
		int result = wordMax(str);
		System.out.println(result);
	}

	private static int wordMax(String str) {
		
		String[] sentences = countSentence(str);
		int max = Integer.MIN_VALUE;
		int size = 0;
		for(String s: sentences) {
			size =  countWord(s);
			if(size>max) {
				max = size;
			}
		}
		return max;
	}
	
	public static int countWord(String word) {
		if (word == null) {
			return 0;
		}
		String input = word.trim();

		int count = input.isEmpty() ? 0 : input.split("\\s+").length;
		return count;
	}

	public static String[] countSentence(String paragraph) {
		if (paragraph == null) {
			return null;
		}
		String[] input = paragraph.split("(?<=[.!?]+)\\s*");

		
		String pattern = "(\\w)(\\s+)([\\.,])";
		System.out.println(paragraph.replaceAll(pattern, "$1$3"));
		for(String temp: input){
		    System.out.println(temp);
		}
		
		
		return input;

	}
	
}


