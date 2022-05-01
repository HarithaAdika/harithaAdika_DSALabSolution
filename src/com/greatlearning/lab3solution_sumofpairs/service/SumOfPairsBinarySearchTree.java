package com.greatlearning.lab3solution_sumofpairs.service;

import java.util.ArrayList;

public class SumOfPairsBinarySearchTree {
	ArrayList<Integer> treeList(Node node, ArrayList<Integer> list) {
		if (node == null)
			return list;
		// InOrder traversal of the tree
		treeList(node.left, list);
		list.add(node.data);
		treeList(node.right, list);

		return list;
	}

	public boolean isSumOfPairsPresent(Node node, int target) {
		ArrayList<Integer> list1 = new ArrayList<>();

		ArrayList<Integer> list2 = treeList(node, list1);
		// starting index of list
		int start = 0;
		// last index of list
		int end = list2.size() - 1;

		while (start < end) {

			if (list2.get(start) + list2.get(end) == target) {
				System.out.println("Sum = " + target);
				System.out.println("Pair is (" + list2.get(start) + "," + list2.get(end) + ")" + "= " + target);
				return true;
			}
			if (list2.get(start) + list2.get(end) > target) {
				end--;
			}

			if (list2.get(start) + list2.get(end) < target) {
				start++;
			}
		}

		return false;
	}

}
