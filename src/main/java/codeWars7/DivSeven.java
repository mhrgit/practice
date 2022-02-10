package codeWars7;

public class DivSeven {

	public static long[] run(long number) {
		if(number % 7 != 0) {
			return new long[] {};
		}
        int counter = 0;
        while (number > 99) {
            long modifiedNumber = number % 10;
            number = (number - modifiedNumber) / 10 - 2 * modifiedNumber;
            counter++;
        }
        return new long[] {number, counter};
	}
}
