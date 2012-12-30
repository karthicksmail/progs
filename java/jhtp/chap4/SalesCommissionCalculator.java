import java.util.Scanner;

public class SalesCommissionCalculator {
	public static void main(String[] args) {
		// Price of the 4 items
		double price1 = 239.99,
				 price2 = 129.75,
				 price3 = 99.95,
				 price4 = 350.89;

		// Initialize the sales Commission with the basic value
		double salesComm = 200.0;

		// Number of items sold;
		int cntOfItems = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.printf("Enter the count of item%d sold by the salesperson: ", i + 1);
			cntOfItems = input.nextInt();
			if (cntOfItems < 0) {
				cntOfItems = 0;
			}

			//If only arrays were covered earlier
			if (i == 0) { 
				salesComm += cntOfItems * price1;
			} else if (i == 1) {
				salesComm += cntOfItems * price2;
			} else if (i == 2) {
				salesComm += cntOfItems * price3;
			} else if (i == 3) {
				salesComm += cntOfItems * price4;
			}
		}

		System.out.printf("The Sales Commission is: %.2f\n", salesComm);
	}
}

