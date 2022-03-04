package codeWars7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import codeWars7.Largest5DigitNumber;

public class Largest5DigitNumberTest {

	@Test
	public void test6Digits() {
		
		String num = "349821";
		int result = Largest5DigitNumber.run(num);
		int expectedResult = 49821;
		
		assertEquals(expectedResult, result);		
	}
	
	@Test
	public void test7Digits() {
		
		String num = "7895329";
		int result = Largest5DigitNumber.run(num);
		int expectedResult = 95329;
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void test15Digits() {
		
		String num = "7895329754245889";
		int result = Largest5DigitNumber.run(num);
		int expectedResult = 97542;
		
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testLargeDigits() {
		
		String num = "1232132112312332112332112332112332112321239876512332112332112332112323212321321321";
		int result = Largest5DigitNumber.run(num);
		int expectedResult = 98765;
		
		assertEquals(expectedResult, result);
	}
}
