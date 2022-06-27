package codeWars6;

public class TakeTenMinutesWalk {

	public static boolean run(char[] array) {
			boolean result = false;
			
			int numberOfW = 0;
			int numberOfE = 0;
			int numberOfS = 0;
			int numberOfN = 0;
			
			if(array.length == 10) {
				for(int i=0; i<array.length; i++) {
					if(array[i] == 'w') {
						numberOfW++;
					} else
					if(array[i] == 'e') {
						numberOfE++;
					} else
					if(array[i] == 's') {
						numberOfS++;
					} else
					if(array[i] == 'n') {
						numberOfN++;
					} else {}
				}
				
				if(numberOfE == numberOfW && numberOfS == numberOfN) {
					result = true;
				}
			}
			
			return result;			
	}
}
