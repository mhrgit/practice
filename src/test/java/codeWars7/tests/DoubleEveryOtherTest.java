package codeWars7.tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

import codeWars7.DoubleEveryOther;

public class DoubleEveryOtherTest {

	@Test
	public void doubleEveryOtherSimple() {
		int[] array = new int[] {1,2,3,4,5};
		
		int[] expectedResult = new int[] {1,4,3,8,5};
		int[] result = DoubleEveryOther.run(array);
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void doubleEveryOtherNegativeNumbers() {
		int[] array = new int[] {1,-2,3,-4,5};
		
		int[] expectedResult = new int[] {1,-4,3,-8,5};
		int[] result = DoubleEveryOther.run(array);
		
		assertArrayEquals(expectedResult, result);
	}
	
	@Test
	public void doubleEveryOtherlargeNumbers() {
		int[] array = new int[] {1,123456,3,11231232,5};
		
		int[] expectedResult = new int[] {1,246912,3,22462464,5};
		int[] result = DoubleEveryOther.run(array);
		
		assertArrayEquals(expectedResult, result, "For input: {1,123456,3,11231232,5}");
	}
}
