package com.ritesh.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNodePostOrder {
	int data;
	TreeNodePostOrder left, right;

	TreeNodePostOrder(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

// http://www.programcreek.com/2012/12/leetcode-solution-of-iterative-binary-tree-postorder-traversal-in-java/
public class BinaryTreePostOrder {
	TreeNodePostOrder root;

	private List<Integer> postOrderIterative() {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNodePostOrder> stack = new Stack<TreeNodePostOrder>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNodePostOrder top = stack.peek();
			if (top.left != null) {
				stack.push(top.left);
				top.left = null;
			}
			else if (top.right != null) {
				stack.push(top.right);
				top.right = null;
			}
			else {
				result.add(top.data);
				stack.pop();
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
		BinaryTreePostOrder tree = new BinaryTreePostOrder();
		tree.root = new TreeNodePostOrder(1);
		tree.root.left = new TreeNodePostOrder(2);
		tree.root.right = new TreeNodePostOrder(3);
		tree.root.left.left = new TreeNodePostOrder(4);
		tree.root.left.right = new TreeNodePostOrder(5);
		tree.root.left.right.left = new TreeNodePostOrder(6);
		List<Integer> resultIterative = tree.postOrderIterative();
		display(resultIterative);
	}

}
