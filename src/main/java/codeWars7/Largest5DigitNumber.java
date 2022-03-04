package codeWars7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Largest5DigitNumber {
	
		public static int run(String num) {
					
			List<Integer> numbers5Digits = new ArrayList<>();
			
			while(num.length() >= 5) {
				String sub5DigitStr = num.substring(0, 5);
				numbers5Digits.add(Integer.parseInt(sub5DigitStr));
				num = num.substring(1);
			}
			
			return Collections.max(numbers5Digits);
		}
	}
