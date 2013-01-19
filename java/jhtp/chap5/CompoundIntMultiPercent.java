public class CompoundIntMultiPercent {
	public static void main( String[] args ) {
		double amount;
		double principal = 1000.0;
		// Print headline and start the formatting for the table
		System.out.printf("Tabular column for Amount on Deposit for a principal of %.2f\n        ", principal);

		//Print the headline row with the years specified
		for (int year = 1; year <= 10; year++) {
			System.out.printf("%12d", year);
		}
		System.out.println();

		// Loop through and print the values
		for (double rate = 0.05; rate < 0.11; rate+=0.01) {
			//Print the rate for the row
			System.out.printf("%8.2f", rate);
			for (int year = 1; year <= 10; year++) {                                                    
				amount = principal * Math.pow( 1.0 + rate, year );
				System.out.printf("%12.2f", amount);
			}
			System.out.println();
		}
	}
}
