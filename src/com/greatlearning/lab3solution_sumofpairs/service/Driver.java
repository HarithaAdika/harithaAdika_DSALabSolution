package com.greatlearning.lab3solution_sumofpairs.service;

import java.util.Scanner;

public class Driver {
	static Node NewNode(int val) {
		Node tmp = new Node();
		tmp.data = val;
		tmp.right = tmp.left = null;
		return tmp;
	}

	public static void main(String[] args) {
		SumOfPairsBinarySearchTree BST = new SumOfPairsBinarySearchTree();
		Node root = NewNode(40);
		root.left = NewNode(20);
		root.right = NewNode(60);
		root.left.left = NewNode(10);
		root.left.right = NewNode(30);
		root.right.left = NewNode(50);
		root.right.right = NewNode(70);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target value:");
		int target = sc.nextInt();
		boolean result = BST.isSumOfPairsPresent(root, target);
		if (!result) {
			System.out.println("nodes are not found.");
		}
		sc.close();

	}
}
