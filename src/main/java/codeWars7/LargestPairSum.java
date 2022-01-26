package codeWars7;

import java.util.Arrays;

public class LargestPairSum {
	
	public static int run(int[] array) {
		int largest1 = 0;
		int largest2 = 0;
		int size = array.length;
		
		Arrays.sort(array);
		largest1 = array[size -1];
		largest2 = array[size -2];
		
		return largest1 + largest2;
	}
}
