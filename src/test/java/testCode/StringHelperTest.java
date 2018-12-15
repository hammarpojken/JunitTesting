package testCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper = new StringHelper();

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

}
