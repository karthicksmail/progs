import java.util.Scanner;

public class CreditLimitCalculator {
	public static void main(String[] args) {
		int acctNumber; // Customer's Account number
		double beginMonthBalance = 0.0; // Balance at the beginning of the month
		double chargedAmount = 0.0; // Total of all items charged by the customer this month
		double creditsApplied = 0.0; // Total of all credits applied to the customer’s account this month
		double allowedCredit = 0.0; // Allowed credit limit

		Scanner input = new Scanner(System.in);

		System.out.printf("Please enter the Account Number: ");
		acctNumber = input.nextInt();

		while (acctNumber != 0) {
			System.out.printf("Please enter the balance at the beginning of the month: ");
			beginMonthBalance = input.nextDouble();
	
			System.out.printf("Please enter the total of all items charged by the customer this month: ");
			chargedAmount = input.nextDouble();
	
			System.out.printf("Please enter the total of all credits applied to the customer's account this month: ");
			creditsApplied = input.nextDouble();
	
			System.out.printf("Please enter the allowd credit limit: ");
			allowedCredit = input.nextDouble();
	
			double newBalance = beginMonthBalance + chargedAmount - creditsApplied;
			System.out.printf("Account Number: %d\n", acctNumber);
			System.out.printf("Beginning Balance: %.2f\n", beginMonthBalance);
			System.out.printf("Charged Amount: %.2f\n", chargedAmount);
			System.out.printf("Credits Applied: %.2f\n", creditsApplied);
			System.out.printf("Allowed Credits: %.2f\n", allowedCredit);
			if(newBalance > allowedCredit) {
				System.out.printf("Credit limit exceeded.\n");
			} else {
				System.out.printf("New Credit Limit: %.2f\n", newBalance);
			}

			System.out.println();
			System.out.printf("Please enter the Account Number: ");
			acctNumber = input.nextInt();
		}
	}
}

