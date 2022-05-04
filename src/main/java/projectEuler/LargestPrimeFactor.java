package projectEuler;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

	public static List<Long> run(long number) {
		long counter = 3;
		long tempNumber = number;
		List<Long> primeNumbers = new ArrayList<>();  
		
		while(counter <= tempNumber) {
			if(checkPrime(counter) && tempNumber % counter == 0) {
				primeNumbers.add(counter);
				
				if(checkPrimeMultiples(primeNumbers, number)) {
					break;
				}
				
				tempNumber = tempNumber / counter;
			}
			counter++;
		}
		
		return primeNumbers;
	}
	
	private static boolean checkPrime(long number) {
		
		boolean isPrime = true;
		
		for(long n=2; n<number; n++) {
			if(n != number) {
				if(number % n == 0) {
					isPrime = false;
				}
			}
		}
		
		return isPrime;
	}
	
	private static boolean checkPrimeMultiples(List<Long> primes, long number) {
		boolean found = false;
		
		long multiples = primes.stream().reduce(1l, (a, b) -> a * b);
		if(multiples == number) {
			found = true;
		}
		return found;
	}
}
