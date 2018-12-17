package testCode;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	StringHelper helper = new StringHelper();
	private String inputTurnicate;
	private String outputTurnicate;
	private String inputTwoCharacters;
	
	
	public StringHelperParameterizedTest(String inputTurni, String outputTurni, String inputTwoC) {
		this.inputTurnicate = inputTurni;
		this.outputTurnicate = outputTurni;
		this.inputTwoCharacters = inputTwoC;
	}

	// Tests for TruncateAInFirst2Positions()
	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] inputOutput = { 
				{ "AACD", "CD", "ABAD" }, 
				{ "ACD", "CD", "A" }, 
				{ "CDEF", "CDEF", "ACDFE" }, 
				{ "CDAA", "CDAA", "CDBD" }
				};
		return Arrays.asList(inputOutput);
	}

	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(outputTurnicate, helper.truncateAInFirst2Positions(inputTurnicate));
	}

	// Tests for areFirstAndLast2CharactersTheSame

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Condition1() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(inputTwoCharacters));
	}

}
