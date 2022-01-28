package projectEuler;

public class MultiplesOf3Or5 {
	
	public static int run(int num) {
		
		int total = 0;
		for(int i=0; i < num; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				total += i;
			}
		}
		System.out.println("Total: " + total);
		return total;
	}
}
