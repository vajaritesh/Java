package com.ritesh.ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNodeLevelOrder {
	int data;
	TreeNodeLevelOrder left, right;

	TreeNodeLevelOrder(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

// http://www.programcreek.com/2012/12/leetcode-solution-of-iterative-binary-tree-postorder-traversal-in-java/
public class BinaryTreeLevelOrder {
	TreeNodeLevelOrder root;

	private List<List<Integer>> levelOrderIterativeTopToBottom() {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		Queue<TreeNodeLevelOrder> queue = new LinkedList<TreeNodeLevelOrder>();
		Stack<Queue<TreeNodeLevelOrder>> stack = new Stack<Queue<TreeNodeLevelOrder>>();
		queue.add(root);
		stack.add(queue);
		while (!stack.isEmpty()) {
			Queue<TreeNodeLevelOrder> top = stack.pop();
			List<Integer> tempList = new ArrayList<Integer>();
			Queue<TreeNodeLevelOrder> tempQueue = new LinkedList<TreeNodeLevelOrder>();
			while (!top.isEmpty()) {
				TreeNodeLevelOrder qNode = top.poll();
				tempList.add(qNode.data);
				if (qNode.left != null) {
					tempQueue.add(qNode.left);
				}
				if (qNode.right != null) {
					tempQueue.add(qNode.right);
				}
			}
			if (!tempQueue.isEmpty()) {
				stack.push(tempQueue);
			}
			result.add(tempList);
		}

		return result;
	}

	private static void display(List<List<Integer>> resultIterative) {
		for (List<Integer> result : resultIterative) {
			System.out.print(result + " ");
		}
	}

	public static void main(String[] args) {
		BinaryTreeLevelOrder tree = new BinaryTreeLevelOrder();
		tree.root = new TreeNodeLevelOrder(3);
		tree.root.left = new TreeNodeLevelOrder(9);
		tree.root.right = new TreeNodeLevelOrder(20);
		tree.root.right.left = new TreeNodeLevelOrder(15);
		tree.root.right.right = new TreeNodeLevelOrder(7);

		List<List<Integer>> topToBottonResult = tree.levelOrderIterativeTopToBottom();
		System.out.print("Top DownLevel");
		display(topToBottonResult);
		List<List<Integer>> bottomToTopResult = tree.levelOrderIterativeBottomToTop();
		System.out.println();
		System.out.print("Bottom Up Level");
		display(bottomToTopResult);
	}

	private List<List<Integer>> levelOrderIterativeBottomToTop() {
		Stack<Queue<TreeNodeLevelOrder>> stack = new Stack<Queue<TreeNodeLevelOrder>>();
		Queue<TreeNodeLevelOrder> queue = new LinkedList<TreeNodeLevelOrder>();
		queue.add(root);
		stack.push(queue);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Stack<List<Integer>> resultStack = new Stack<List<Integer>>();
		while (!stack.isEmpty()) {
			Queue<TreeNodeLevelOrder> top = stack.pop();
			Queue<TreeNodeLevelOrder> tempQueue = new LinkedList<TreeNodeLevelOrder>();
			List<Integer> tempList = new ArrayList<Integer>();
			while (!top.isEmpty()) {
				TreeNodeLevelOrder node = top.poll();
				if (node.left != null) {
					tempQueue.add(node.left);
				}
				if (node.right != null) {
					tempQueue.add(node.right);
				}
				tempList.add(node.data);
			}
			if (!tempQueue.isEmpty()) {
				stack.push(tempQueue);
			}
			if (!tempList.isEmpty()) {
				resultStack.push(tempList);
			}
		}
		while (!resultStack.isEmpty()) {
			List<Integer> top = resultStack.pop();
			result.add(top);
		}
		return result;
	}

}
