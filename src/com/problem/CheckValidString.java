package com.problem;

import java.util.Stack;

public class CheckValidString {

	public boolean balancedParenthesis(String s) {

		if (s.isEmpty())
			return true;
		Stack<Character> stack = new Stack<Character>();

		int obCount, $Count;
		obCount = $Count = 0;

		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			if (s.charAt(0) == ']' || s.charAt(s.length() - 1) == '[')
				return false;

			switch (x) {
			case '[':
				obCount++;
				stack.push(x);
				break;
			case '$':

				$Count++;
				stack.push(x);
				break;
			case ']':
				stack.pop();
				obCount--;
				break;

			}
		}

		if (!stack.isEmpty()) {
			if (stack.firstElement() == '$' & obCount != 0)
				return false;
		}

		return ($Count - obCount >= 0);
	}

}
