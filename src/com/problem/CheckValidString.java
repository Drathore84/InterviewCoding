package com.problem;

public class CheckValidString {

	public boolean balancedParenthesis(String s) {

		if (s.isEmpty())return true;
		
		
		
		int obCount, cbCount, $Count;
		obCount = cbCount = $Count = 0;

		for (int i = 0; i < s.length(); i++) {

			char x = s.charAt(i);
			
			if(s.charAt(0)==']' || s.charAt(s.length()-1) == '[') return false;
			if (x == '[')
				obCount++;
			else if (x == ']')
				cbCount++;
			else if (x == '$')
				$Count++;

		}

		if (cbCount == obCount)return true;
		else {
			if ($Count - (cbCount - obCount) >= 0)return true;
		}

		return false;
	}

}
