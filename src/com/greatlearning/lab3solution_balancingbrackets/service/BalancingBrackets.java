package com.greatlearning.lab3solution_balancingbrackets.service;

import java.util.Stack;

public class BalancingBrackets {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}

			switch (c) {
			case ')':
				if (stack.empty() || stack.peek() != '(')
					return false;
				else
					stack.pop();
				break;
			case '}':
				if (stack.empty() || stack.peek() != '{')
					return false;
				else
					stack.pop();
				break;
			case ']':
				if (stack.empty() || stack.peek() != '[')
					return false;
				else
					stack.pop();
				break;
			default:
				;
			}
		}
		return (stack.isEmpty());
	}

}
