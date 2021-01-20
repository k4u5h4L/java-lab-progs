package PartA;

//import java.util.Scanner;

/*
 * Design a java program to calculate the difference between the sum of the odd
   level and even level nodes of a binary tree
 */

class Node { 
	int data; 
	Node left, right; 

	Node(int item) { 
		data = item; 
		left = null;
		right = null;
	} 
} 

class Prog5 { 
	Node root; 

	int getLevelDiff(Node node) { 
		if (node == null) 
			return 0; 

		return node.data - getLevelDiff(node.left) - 
											getLevelDiff(node.right); 
	} 

	public static void main(String args[]) { 
		Prog5 tree = new Prog5();
		tree.root = new Node(5); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(6); 
		tree.root.left.left = new Node(1); 
		tree.root.left.right = new Node(4); 
		tree.root.left.right.left = new Node(3); 
		tree.root.right.right = new Node(8); 
		tree.root.right.right.right = new Node(9); 
		tree.root.right.right.left = new Node(7); 
		System.out.println(tree.getLevelDiff(tree.root) + " is the required difference"); 

	} 
} 

