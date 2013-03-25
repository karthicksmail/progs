import java.util.Scanner;

public class RoundingNumbers2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = 'n';
		do {
			System.out.print("Enter the number: ");
			double num = input.nextDouble();

			System.out.println("The value of " + num + " rounded to the closest integer is " + RoundingNumbers2.roundToIntegers(num));
			System.out.println("The value of " + num + " rounded to the closest tenths is " + RoundingNumbers2.roundToTenths(num));
			System.out.println("The value of " + num + " rounded to the closest hundredths is " + RoundingNumbers2.roundToHundredths(num));
			System.out.println("The value of " + num + " rounded to the closest thousandths is " + RoundingNumbers2.roundToThousandths(num));

			System.out.print("Continue? (y/n)");
			ch = input.next().toLowerCase().charAt(0);
		} while (ch == 'y');
	}

	public static int roundToIntegers(double num) {
		return (int)Math.floor( num + 0.5 );
	}

	public static double roundToTenths(double num) {
		return Math.floor( num * 10 + 0.5 ) / 10;
	}

	public static double roundToHundredths(double num) {
		return Math.floor( num * 100 + 0.5 ) / 100;
	}

	public static double roundToThousandths(double num) {
		return Math.floor( num * 1000 + 0.5 ) / 1000;
	}
}

