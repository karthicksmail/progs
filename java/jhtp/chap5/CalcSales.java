import java.util.Scanner;

public class CalcSales {
	public static void main(String[] args) { 
		double prod1 = 2.98;
		double prod2 = 4.5;
		double prod3 = 9.98;
		double prod4 = 4.49;
		double prod5 = 6.87;

		int prodNum = 0;
		int qtySold = 0;
		double amt = 0.0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the product Number: ");
		prodNum = input.nextInt();
		do {
			System.out.print("Enter the quantity sold: ");
			qtySold = input.nextInt();

			switch(prodNum) {
				case 1:
					amt += prod1 * qtySold;
					break;
				case 2:
					amt += prod2 * qtySold;
					break;
				case 3:
					amt += prod3 * qtySold;
					break;
				case 4:
					amt += prod4 * qtySold;
					break;
			}
			System.out.print("Enter the product Number: ");
			prodNum = input.nextInt();
		} while (prodNum > 0 && prodNum < 6);
		System.out.println("The total sales is: " + amt);
	}
}

