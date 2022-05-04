package projectEuler.tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import projectEuler.LargestPrimeFactor;

public class LargestPrimeFactorTest {

//	@Test
//	public void testTwoDigitsNumber() {
//		int number = 65;
//		
//		List<Integer> expectedNumbers = new ArrayList<Integer>(Arrays.asList(5,13));
//		List<Integer> actualNumbers = LargestPrimeFactor.run(number);
//		
//		if(!actualNumbers.isEmpty()) {
//			actualNumbers.forEach(item -> System.out.println(item));
//		}
//		
//		assertEquals(expectedNumbers, actualNumbers);
//	}
//	
//	@Test
//	public void testTwoDigitsNumber2() {
//		int number = 161;
//		
//		List<Integer> expectedNumbers = new ArrayList<Integer>(Arrays.asList(7,23));
//		List<Integer> actualNumbers = LargestPrimeFactor.run(number);
//		
//		if(!actualNumbers.isEmpty()) {
//			actualNumbers.forEach(item -> System.out.println(item));
//		}
//		
//		assertEquals(expectedNumbers, actualNumbers);
//	}
//	
//	@Test
//	public void testThreeDigitsNumber() {
//		int number = 2093;
//		
//		List<Integer> expectedNumbers = new ArrayList<Integer>(Arrays.asList(7,13,23));
//		List<Integer> actualNumbers = LargestPrimeFactor.run(number);
//		
//		if(!actualNumbers.isEmpty()) {
//			actualNumbers.forEach(item -> System.out.println(item));
//		}
//		
//		assertEquals(expectedNumbers, actualNumbers);
//	}
//	
//	@Test
//	public void testFourDigitsNumber() {
//		int number = 60697;
//		
//		List<Integer> expectedNumbers = new ArrayList<Integer>(Arrays.asList(7,13,23, 29));
//		List<Integer> actualNumbers = LargestPrimeFactor.run(number);
//		
//		if(!actualNumbers.isEmpty()) {
//			actualNumbers.forEach(item -> System.out.println(item));
//		}
//		
//		assertEquals(expectedNumbers, actualNumbers);
//	}
	
	@Test
	public void testEulerNumberNumber() {
		long number = 600851475143l;

		List<Long> actualNumbers = LargestPrimeFactor.run(number);
		
		if(!actualNumbers.isEmpty()) {
			actualNumbers.forEach(item -> System.out.println(item));
		}
	}

}
