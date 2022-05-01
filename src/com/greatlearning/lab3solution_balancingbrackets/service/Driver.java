package com.greatlearning.lab3solution_balancingbrackets.service;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		BalancingBrackets balanceBrackets = new BalancingBrackets();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Paranthesis:");
		String brackets = sc.nextLine();
		boolean res = balanceBrackets.isValid(brackets);
		if (res) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");

		}
		sc.close();
	}

}
