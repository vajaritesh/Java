package com.ritesh.ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}

}

public class BinaryTree {

	public static void main(String[] args) {

		int[] data = { 3, 5, 2, 1, 4, 6, 7, 2 };
		Node root = null;

		for (int i = 0; i < data.length; i++) {
			root = insertRecursive(root, data[i]);
			// root = insertIterativeWithDuplicate(root, data[i]);
			// root = insertIterativeWithoutDuplicate(root, data[i]);

		}
		int search = 3;
		if (findIterative(root, search)) {
			System.out.println(search + " Found using Iterative");
		}
		else {
			System.out.println(search + " Not Found using Iterative");
		}

		System.out.print("InOrder: ");
		inOrder(root);
		System.out.println();
		System.out.print("PreOrder: ");
		preOrder(root);
		System.out.println();
		System.out.print("PostOrder: ");
		postOrder(root);
		System.out.println();
		System.out.print("LevelOrder: ");
		levelOrder(root);
		System.out.println();
		System.out.print("Iterative InOrder: ");
		displayIterativeInOrder(root);
		System.out.println();
		System.out.print("Iterative PreOrder: ");
		displayIterativelyPreOrder(root);
		int height = getHeight(root);
		System.out.println("Height of the truee = " + height);

		if (validateBinaryTree(root)) {
			System.out.println("Its validate Binary Tree");
		}
		else {
			System.out.println("Its not a validate Binary Tree");
		}

	}

	private static boolean validateBinaryTree(Node root) {

		return false;
	}

	private static boolean findIterative(Node root, int data) {

		if (root == null) {
			return false;
		}
		else {
			Node curr = root;
			while (curr != null) {
				if (data < curr.data) {
					curr = curr.left;
				}
				else if (data > curr.data) {
					curr = curr.right;
				}
				else {
					return true;
				}
			}
		}
		return false;
	}

	// Insert with recursion
	private static Node insertRecursive(Node root, int data) {
		if (root == null) {
			Node newBorn = new Node(data);
			return newBorn;
		}
		else {
			Node curr;
			if (data < root.data) {
				curr = insertRecursive(root.left, data);
				root.left = curr;
			}
			else if (data > root.data) {
				curr = insertRecursive(root.right, data);
				root.right = curr;
			}
		}
		return root;
	}

	private static Node insertIterativeWithDuplicate(Node root, int data) {
		if (root == null) {
			Node newBorn = new Node(data);
			return newBorn;
		}
		else {
			Node curr = root;
			Node parent = root;
			while (curr != null) {
				parent = curr;
				if (data < curr.data) {
					curr = curr.left;
				}
				else if (data > curr.data) {
					curr = curr.right;
				}
				else {
					break;
				}

			}
			if (data < parent.data) {
				parent.left = new Node(data);
			}
			else {
				parent.right = new Node(data);
			}
		}
		return root;
	}

	private static Node insertIterativeWithoutDuplicate(Node root, int data) {
		Node newBornNode = new Node(data);
		if (root == null) {
			root = newBornNode;
		}
		else {
			Node curr = root;
			Node parent = root;
			while (curr != null) {
				parent = curr;
				if (data < curr.data) {
					curr = curr.left;
				}
				else if (data > curr.data) {
					curr = curr.right;
				}
				else {
					curr.data = data;
					break;
				}
			}
			if (data < parent.data) {
				parent.left = newBornNode;
			}
			else if (data > parent.data) {
				parent.right = newBornNode;
			}
			// else {
			// parent = curr;
			// }
		}
		return root;
	}

	// In Order: Left Root Right

	// Pre Order Root Left Right

	// Post Order Left Right Root

	// Level Order Root Left Right Left Right

	public static void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	public static void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	private static void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

	// Inline
	private static void displayIterativeInOrder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node curr = root;
		while (curr != null) {
			stack.push(curr);
			curr = curr.left;
		}
		while (stack.size() > 0) {
			curr = stack.pop();
			System.out.print(curr.data + " ");
			if (curr.right != null) {
				curr = curr.right;
				while (curr != null) {
					stack.push(curr);
					curr = curr.left;
				}
			}
		}
	}

	private static void displayIterativelyPreOrder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node curr = root;
		stack.push(curr);
		while (stack.size() > 0) {
			curr = stack.peek();
			System.out.print(curr.data + " ");
			stack.pop();
			if (curr.right != null) {
				stack.push(curr.right);
			}
			if (curr.left != null) {
				stack.push(curr.left);
			}
		}
	}

	private static void levelOrder(Node root) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<Node>();
		Node curr = root;
		queue.add(curr);
		while (!queue.isEmpty()) {
			Node node = queue.remove();
			System.out.print(node.data + " ");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}

	private static int getHeight(Node root) {

		if (root == null) {
			return -1;
		}

		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;

	}
}