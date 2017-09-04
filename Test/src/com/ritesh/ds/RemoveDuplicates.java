package com.ritesh.ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveDuplicates<T> implements Iterator<T> {
	public String[] array;
	public int index;

	public RemoveDuplicates(List<String> a, List<String> b) {
		int i = 0;
		for (String list1 : a) {
			array[i++] = list1;
		}
		for (String list2 : a) {
			array[i++] = list2;
		}

	}

	@Override
	public boolean hasNext() {
		return index <= array.length;
	}

	@Override
	public T next() {
		T output = array[index];
		if (index == 0) {
			index++;
		}
		while (hasNext()) {
			if (array[index] == array[index - 1]) {
				index++;
			}
			else {
				break;
			}
		}
		return outputElement;
	}

	public static void main(String[] args) {
		List<String> A = new ArrayList<String>();
		List<String> B = new ArrayList<String>();
		A.add("RAT");
		A.add("CAT");
		A.add("BAT");
		B.add("RAT");
		B.add("CAT");
		B.add("MAT");

		RemoveDuplicates itr = new RemoveDuplicates(A, B);
		String r = itr.next();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}
