package codeWars7;

public class Largest5DigitNumber {
	
		public static int run(String num) {
		      
			int max = 0;
		        for (int i = 0; i < num.length()-4; i++) {
		            max = Math.max(Integer.valueOf(num.substring(i, i+5)), max);
		        }

		        return max;
		}
	}
