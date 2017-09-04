package com.ritesh.ds;

import java.util.HashMap;
import java.util.Map;

class Lnode {
	int data;
	Lnode next;

	Lnode(int data) {
		this.data = data;
		this.next = null;
	}
}

public class Linkedlist1 {

	public static void main(String args[]) {
		int[] num = { 1, 3, 6, 2, 4, 0, 8 };
		Lnode head = null;
		for (int i = 0; i < num.length; i++) {
			head = insert(head, num[i]);
		}
		printList(head);
		System.out.println();
		int search = 2;
		if (searchList(head, 2)) {
			System.out.println(search + " Found");
		}
		else {
			System.out.println(search + " Not found");
		}
		// Map<Integer, Integer> dupArr = countDuplicates(head);

	}

	private static Map<Integer, Integer> countDuplicates(Lnode head) {
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		if (head == null) {
			return result;
		}
		else {
			Lnode curr = head;
			while (curr != null) {
				result.put(curr.data, result.get(curr.data) + 1);
			}
		}
		return result;
	}

	private static boolean searchList(Lnode head, int data) {
		if (head == null)
			return false;
		else {
			Lnode curr = head;
			while (curr != null && curr.data != data) {
				curr = curr.next;
			}
			if (curr != null && curr.data == data)
				return true;
			else
				return false;
		}
	}

	private static void printList(Lnode head) {
		if (head == null) {
			return;
		}
		else {
			Lnode curr = head;
			while (curr != null) {
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
		}

	}

	private static Lnode insert(Lnode head, int data) {
		Lnode newBorn = new Lnode(data);
		if (head == null) {
			head = newBorn;
		}
		else {
			Lnode curr = head;
			Lnode prev = head;
			while (curr != null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next = newBorn;
		}
		return head;
	}
}
