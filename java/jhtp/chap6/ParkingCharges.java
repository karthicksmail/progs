//(Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for longer than 24 hours at a time. Write an application that calculates and displays the parking charges for each customer who parked in the garage yesterday. You should enter the hours parked for each customer. The program should display the charge for the current customer and should calculate and display the running total of yesterday’s receipts. It should use the method calculateCharges to determine the charge for each customer.

public class ParkingCharges {
	private double numOfHours;
	public double calculateCharges() {
		double charges = 0.0;
		if (numOfHours <= 0.0) {
			charges = 0.0;
		} else if (numOfHours <= 3.0) {
			charges = 2.0;
		} else {
			charges = 2.0 + (numOfHours - 3.0) * 0.5;
		}

		if (charges > 10.0) {
			charges = 10.0;
		}
		return charges;
	}

	public void setHours(double numOfHours) {
		if (numOfHours < 0) {
			numOfHours = 0;
		}
		this.numOfHours = numOfHours;
	}

	public static void main(String[] args) {
		ParkingCharges pc = new ParkingCharges();
		// Instead of using Scanner to input the values, I used this method since I can cover all possibilities.
		pc.setHours(-0.5);
		System.out.println("The parking charges for -0.5 hours is " + pc.calculateCharges());
		pc.setHours(0.0);
		System.out.println("The parking charges for 0.0 hours is " + pc.calculateCharges());
		pc.setHours(1.0);
		System.out.println("The parking charges for 1.0 hours is " + pc.calculateCharges());
		pc.setHours(3.0);
		System.out.println("The parking charges for 3.0 hours is " + pc.calculateCharges());
		pc.setHours(5.0);
		System.out.println("The parking charges for 5.0 hours is " + pc.calculateCharges());
		pc.setHours(19.5);
		System.out.println("The parking charges for 19.5 hours is " + pc.calculateCharges());
		pc.setHours(20.0);
		System.out.println("The parking charges for 20.0 hours is " + pc.calculateCharges());
	}
}
