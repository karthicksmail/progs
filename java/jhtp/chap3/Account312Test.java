import java.util.Scanner;

public class Account312Test {
	public static void main(String[] args) {
		Account312 acct1 = new Account312(50.00);
		Account312 acct2 = new Account312(-7.53);

		System.out.printf("acct1: Account Balance = %.2f\n", acct1.getBalance());
		System.out.printf("acct2: Account Balance = %.2f\n", acct2.getBalance());

		Scanner input = new Scanner(System.in);
		double depositAmount = 0.0;

		System.out.print("How much did acct1 deposit? ");
		depositAmount = input.nextDouble();
		acct1.credit(depositAmount);

		System.out.print("How much did acct2 deposit? ");
		depositAmount = input.nextDouble();
		acct2.credit(depositAmount);

		System.out.printf("acct1: Account Balance = %.2f\n", acct1.getBalance());
		System.out.printf("acct2: Account Balance = %.2f\n", acct2.getBalance());

		double debit_amt = 0.0;
		System.out.print("How much does acct1 want to debit? ");
		debit_amt = input.nextDouble();
		acct1.debit(debit_amt);

		System.out.print("How much does acct2 want to debit? ");
		debit_amt = input.nextDouble();
		acct2.debit(debit_amt);

		System.out.printf("acct1: Account Balance = %.2f\n", acct1.getBalance());
		System.out.printf("acct2: Account Balance = %.2f\n", acct2.getBalance());
	}
}
