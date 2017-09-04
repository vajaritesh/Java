package com.ritesh.ds;

import java.util.LinkedList;
import java.util.Queue;

class InvertTreeNode {
	int data;
	InvertTreeNode left, right;

	InvertTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

// http://www.programcreek.com/2012/12/leetcode-solution-of-iterative-binary-tree-postorder-traversal-in-java/
public class BinaryTreeInvert {
	static InvertTreeNode root;

	private void invertBinaryTree() {

		Queue<InvertTreeNode> queue = new LinkedList<InvertTreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			InvertTreeNode top = queue.poll();

			if (top.left != null) {
				queue.add(top.left);
			}
			if (top.right != null) {
				queue.add(top.right);
			}
			InvertTreeNode temp = top.left;
			top.left = top.right;
			top.right = temp;
		}
	}

	public void inOrder(InvertTreeNode root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		inOrder(root.left);
		inOrder(root.right);

	}

	public static void main(String[] args) {
		BinaryTreeInvert tree = new BinaryTreeInvert();
		tree.root = new InvertTreeNode(1);
		tree.root.left = new InvertTreeNode(2);
		tree.root.right = new InvertTreeNode(3);
		tree.root.left.left = new InvertTreeNode(4);
		tree.root.left.right = new InvertTreeNode(5);
		tree.root.right.left = new InvertTreeNode(6);
		// tree.root.right.right = new InvertTreeNode(7);
		tree.inOrder(root);
		tree.invertBinaryTree();
		System.out.println();
		System.out.println("After Invert ");
		tree.inOrder(root);
	}

}
