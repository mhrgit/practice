package projectEuler.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import projectEuler.MultiplesOf3Or5;

public class MultiplesOf3Or5Test {

	@Test
	public void testFor10() {
		int num = 10;
		int expectedResult = 23;
		int result = MultiplesOf3Or5.run(num);
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testFor20() {
		int num = 20;
		int expectedResult = 78;
		int result = MultiplesOf3Or5.run(num);
		
		assertEquals(expectedResult, result);
		
		// 3 5 6 9 10 12 15 18
	}
	
	@Test
	public void testFor30() {
		int num = 30;
		int expectedResult = 195;
		int result = MultiplesOf3Or5.run(num);
		
		assertEquals(expectedResult, result);
		
		// 3 5 6 9 10 12 15 18
		// 78 20 21 24 25 27 
	}
	
	@Test
	public void testFor100() {
		int num = 1000;
		int expectedResult = 233168;
		int result = MultiplesOf3Or5.run(num);
		
		assertEquals(expectedResult, result);
		
		// 3 5 6 9 10 12 15 18
		// 78 20 21 24 25 27 
	}
}
