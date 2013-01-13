/**
 * Problem Statement:
 * (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
 * The salespeople receive $200 per week plus 9% of their gross sales for that week.
 * For example, a salesperson who sells $5000 worth of merchandise in a week receives $200 plus 9% of $5000, or a total of $650.
 * You’ve been supplied with a list of the items sold by each salesperson. The values of these items are as follows:
 * Item     Value
 * 1        239.99
 * 2        129.75
 * 3         99.95
 * 4        350.89
 * Develop a Java application that inputs one salesperson’s items sold for last week and calculates and displays that salesperson’s earnings.
 * There’s no limit to the number of items that can be sold.
 */
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

