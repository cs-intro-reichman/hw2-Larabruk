// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int numberOfTerms = Integer.parseInt(args[0]);
		double sum = 0;
		double odd = 3;
		

		for (int i = 0; i < numberOfTerms; i++){
			odd = 1 / odd;
			double newOdd = odd + 2;
			
			for (int j = 0; j < numberOfTerms; j++){
			sum =+ odd;
			}
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (1 - sum));
	}
}
