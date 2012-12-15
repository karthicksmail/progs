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

	public double getBalance() {
		return balance;
	}
}

