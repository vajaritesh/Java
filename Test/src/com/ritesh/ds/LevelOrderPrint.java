package com.ritesh.ds;

import java.util.LinkedList;
import java.util.Queue;

class NewNode {
	int data;
	NewNode left, right;

	NewNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

public class LevelOrderPrint {

	public static void main(String[] args) {

		NewNode root = new NewNode(1);
		root.left = new NewNode(2);
		root.right = new NewNode(3);
		root.left.left = new NewNode(4);
		root.left.right = new NewNode(5);
		root.right.right = new NewNode(6);
		root.left.right.left = new NewNode(7);
		root.left.right.right = new NewNode(8);
		root.right.right.left = new NewNode(9);

		printLevelOrder(root);
	}

	private static void printLevelOrder(NewNode root) {
		if (root == null)
			return;

		Queue<NewNode> queue = new LinkedList<NewNode>();
		// Queue<NewNode> levelQueue = new LinkedList<NewNode>();
		queue.add(root);
		int size = 1;
		// int newSize = 0;
		while (!queue.isEmpty()) {
			// newSize = 0;
			for (int i = 0; i < size; i++) {
				NewNode top = queue.poll();
				System.out.print(top.data + " ");
				if (top.left != null) {
					queue.add(top.left);
					// newSize++;
				}
				if (top.right != null) {
					queue.add(top.right);
					// newSize++;
				}
			}
			System.out.println();
			size = queue.size();
		}
	}
}
