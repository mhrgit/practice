package projectEuler.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import projectEuler.EvenFibonacciNumbers;

public class EvenFibonacciNumbersTest {

	@Test
	public void testWithFibonacciNumbersValuesLessThan100() {
		
		// 1,2,3,5,8,13,21,34,55,89
		
		int expectedResult = 44;
		int result = EvenFibonacciNumbers.run(100);
		
		assertEquals(expectedResult, result);		
	}
	
	@Test
	public void testWithFibonacciNumbersValuesLessThan4Million() {
		
		int expectedResult = 187;
		int result = EvenFibonacciNumbers.run(4000000);
		
		assertEquals(expectedResult, result);		
	}
}
