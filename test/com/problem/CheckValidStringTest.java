package com.problem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CheckValidStringTest extends CheckValidString {

	@ParameterizedTest
	@ValueSource(strings ={"[]","$$", "[$]]",  "[[]$", "[$]"})
	void balancedParenthesisTest(String input) {
		
		boolean result = balancedParenthesis(input);
		assertTrue(result);
	}


}
