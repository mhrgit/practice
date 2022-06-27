package projectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestPalindrome {
	
	public static int run() {
		
		List<Integer> palindromes = new ArrayList<Integer>();
		int startValue = 100;
		
		for(int i=startValue; i < 1000; i++) {
			
			for(int j=startValue; j < 1000; j++) {
				int product = i*j;
				
				if(isItPalindrome(product)) {
					palindromes.add(product);
				}
			}			
		}
		
		Collections.sort(palindromes, Collections.reverseOrder());
		System.out.println("Largest palindrome: " + palindromes.get(0));
		return palindromes.get(0);
	}
	
	private static boolean isItPalindrome(int num) {
		boolean isPalindrome = false;
		
		char[] array = String.valueOf(num).toCharArray();
		
		String reverseNum = "";
		for(int i=array.length-1; i >= 0; i--) {
			reverseNum += array[i];
		}
		
		isPalindrome = String.valueOf(num).equals(reverseNum);
				
		return isPalindrome;
	}

}
