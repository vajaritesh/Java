package com.ritesh.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
	int data;
	TreeNode left, right;

	TreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

// http://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
public class BinaryTreeInOrder {
	TreeNode root;

	private List<Integer> inOrderIterative() {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode top = stack.peek();
			if (top.left != null) {
				stack.push(top.left);
				top.left = null;
			}
			else {
				result.add(top.data);
				stack.pop();
				if (top.right != null) {
					stack.push(top.right);
				}
			}
		}
		return result;
	}

	private static void display(List<Integer> resultIterative) {
		for (Integer result : resultIterative) {
			System.out.print(result + " ");
		}
	}

	public static void main(String[] args) {
		BinaryTreeInOrder tree = new BinaryTreeInOrder();
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		List<Integer> resultIterative = tree.inOrderIterative();
		display(resultIterative);
	}

}
