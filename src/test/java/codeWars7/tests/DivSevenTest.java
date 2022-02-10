package codeWars7.tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import codeWars7.DivSeven;

public class DivSevenTest {
	
	@Test
	public void testOneStep() {
		long number = 371;
		long[] expectedResult = new long[] {35,1};			
	 	long[] result = DivSeven.run(number);
	 	
	 	assertArrayEquals(expectedResult, result);
	}

	@Test
	public void testTwoStep() {
		long number = 1603;
		long[] expectedResult = new long[] {7, 2};
		long[] result = DivSeven.run(number);
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void testThreeStep() {
		long number = 18522;
		long[] expectedResult = new long[] {0, 3};
		long[] result = DivSeven.run(number);
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void testSevenStep() {
		long number = 477557101;
		long[] expectedResult = new long[] {28, 7};
		long[] result = DivSeven.run(number);
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void testNotDividedBy7() {
		
		long number = 477557102;
		long[] expectedResult = new long[] {};
		long[] result = DivSeven.run(number);
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void test2DigitsDividedBy7() {
		
		long number = 42;
		long[] expectedResult = new long[] {42, 0};
		long[] result = DivSeven.run(number);
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void test2DigitsNotDivideabledBy7() {
		
		long number = 43;
		long[] expectedResult = new long[] {};
		long[] result = DivSeven.run(number);
		
		assertArrayEquals(expectedResult, result);
	}
}
