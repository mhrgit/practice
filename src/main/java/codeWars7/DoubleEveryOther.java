package codeWars7;

public class DoubleEveryOther {
	
	public static int[] run(int[] array) {
		
		for(int i=0; i < array.length; i++) {
			if(i % 2 == 1) {
				array[i]*= 2;
			}
		}
		return array;
	}
}
