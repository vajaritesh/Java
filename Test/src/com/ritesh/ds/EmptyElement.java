package com.ritesh.ds;

import java.util.ArrayList;
import java.util.List;

public class EmptyElement {

	public static void main(String[] args) {
		String str = "1,2,,3,4,5";
		String[] arr1 = str.split(",");
		String name = "hello"; // "olleh"
		int j = name.length() - 1;
		char[] nameArr = name.toCharArray();
		for (int i = 0; i < name.length() / 2; i++) {
			char temp = nameArr[i];
			nameArr[i] = nameArr[j];
			nameArr[j] = temp;
			j--;

		}
		System.out.println(nameArr);

		// int[] arr = {1,2,'',4, 5};
		List<Object> alist = new ArrayList<Object>();
		alist.add(1);
		alist.add(2);
		alist.add("");
		alist.add(3);
		alist.add(4);
		int index = 0;
		for (Object ele : alist) {
			if (!(ele instanceof Integer)) {
				System.out.println(index);
			}
			index++;
		}

	}

}
