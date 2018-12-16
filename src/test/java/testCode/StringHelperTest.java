package testCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();
	
	// Tests for TruncateAInFirst2Positions()

	@Test
	public void testTruncateAInFirst2Positions_Condition1() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Condition2() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTurncateAinFIrst2Postitions_Condition3() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	@Test
	public void testTurncateAinFIrst2Postitions_Condition4() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	// Tests for areFirstAndLast2CharactersTheSame
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Condition1() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Condition2() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
		
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Condition3() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
		
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Condition4() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
		
	}

}
