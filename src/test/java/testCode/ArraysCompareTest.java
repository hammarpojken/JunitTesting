package testCode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 2, 5, 6, 7, 4, 2, 6, 5 };
		int[] expected = { 2, 2, 4, 5, 5, 6, 6, 7 };

		Arrays.sort(numbers);

		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		
		int[] numbers = null;
		Arrays.sort(numbers);
	}

}
