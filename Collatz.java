// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seedN = Integer.parseInt(args[0]);
		String mode = args[1];
		String verbose = "v";
		String concise = "c";

		if (mode.equals(verbose)){
			for (int i = 1; i <= seedN; i++){
				int currentSeed = i;
				int counter = 1;
				System.out.print(currentSeed + " ");

				if (currentSeed == 1) {
					currentSeed = 4;
					System.out.print(currentSeed + " ");
				}
			
				while (currentSeed != 1){
					if (currentSeed % 2 == 0){
						currentSeed = currentSeed / 2;
					} else {
						currentSeed = currentSeed * 3 + 1;
					}
					System.out.print(currentSeed + " ");
					counter++;
				}
					if (currentSeed == 1){
						System.out.println(" (" + (counter + 1) + ")");
					} else {
						System.out.println(" (" + counter + ")");
					}
			}
			System.out.print("Every one of the first " + seedN + " hailsone sequences reached 1.");
		}
		if (mode.equals(concise)){
			System.out.println("Every one of the first " + seedN + " hailsone sequences reached 1.");
		}
	}	
}
	

		


	
	

