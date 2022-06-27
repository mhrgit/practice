package codeWars6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import codeWars6.TakeTenMinutesWalk;

public class TakeTenMinutesWalkTest {

	@Test
	public void testSimpleCaseTrueWith10Steps() {
		char[] directions = new char[] {'w','s','e','e','e','w','s','w','n','n'};
		boolean result = TakeTenMinutesWalk.run(directions);
		
		boolean expectedResult = true;
		
		assertEquals(result, expectedResult);
	}
	
	@Test
	public void testSimpleCaseFalseWith10Steps() {
		char[] directions = new char[] {'w','s','n','e','e','w','e','w','w','n'};
		boolean result = TakeTenMinutesWalk.run(directions);
		
		boolean expectedResult = false;
		
		assertEquals(result, expectedResult);
	}
	
	@Test
	public void testFalseCaseWithOneStep() {
		char[] directions = new char[] {'w'};
		boolean result = TakeTenMinutesWalk.run(directions);
		
		boolean expectedResult = false;
		
		assertEquals(result, expectedResult);
	}
	
}
