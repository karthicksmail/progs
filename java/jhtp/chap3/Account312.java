public class Account312 {
	private double balance;

	public Account312(double initBalance) {
		if (initBalance > 0.0) {
			balance = initBalance;
		}
	}

	public void credit(double amt) {
		balance = balance + amt;
	}

	public void debit(double amt) {
		if (balance >= amt) {
			balance = balance - amt;
		}
		else {
			System.out.println("Debit amount exceeded account balance.");
		}
	}
	public double getBalance() {
		return balance;
	}
}

