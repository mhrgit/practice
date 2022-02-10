package projectEuler;
public class EvenFibonacciNumbers {

	public static int run(int number) {
		
		int num1 = 1;
		int num2 = 2;
		int total = 0;
		int evenTotal = 2;
		
		while(total < number  ) {
			total = num1 + num2;
			num1 = num2;
			num2 = total;
			if(total %2 == 0) {
				evenTotal += total;
			}
		}

		System.out.println(evenTotal);
		
		return evenTotal;
	}
}
