package codeWars7.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import codeWars7.LargestPairSum;

public class LargestPairSumTest {

	@Test
	public void testLargestSum1(){
		
		int[] array = new int[] {10,14,2,23,19};
		int expectedResult = 42;
		int result = LargestPairSum.run(array);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testLargestSum2(){
		
		int[] array = new int[] {99, 2, 2, 23, 19};
		int expectedResult = 122;
		int result = LargestPairSum.run(array);
		assertEquals(expectedResult, result);
	}
}
