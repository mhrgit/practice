package projectEuler.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import projectEuler.LargestPalindrome;

public class LargestPalindromeTests {
		
		@Test
		public void test2DigitNumbers() {			
			int result = LargestPalindrome.run();
			
			int expectedResult = 9009;
					
			//assertEquals(result, expectedResult);			
		}		
}
