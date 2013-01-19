import java.util.Scanner;

public class BarChart {
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		int max = 30;

		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter the first number: ");
			num1 = input.nextInt();
		} while ((num1 < 0) || (num1 > 30));

		do {
			System.out.print("Enter the second number: ");
			num2 = input.nextInt();
		} while ((num2 < 0) || (num2 > 30));

		do {
			System.out.print("Enter the third number: ");
			num3 = input.nextInt();
		} while ((num3 < 0) || (num3 > 30));

		do {
			System.out.print("Enter the fourth number: ");
			num4 = input.nextInt();
		} while ((num4 < 0) || (num4 > 30));

		do {
			System.out.print("Enter the fifth number: ");
			num5 = input.nextInt();
		} while ((num5 < 0) || (num5 > 30));

		for (int i = 0; i < num1; i++) {
			System.out.print("*");
		}
		System.out.print(num1);
		System.out.println();

		for (int i = 0; i < num2; i++) {
			System.out.print("*");
		}
		System.out.print(num2);
		System.out.println();

		for (int i = 0; i < num3; i++) {
			System.out.print("*");
		}
		System.out.print(num3);
		System.out.println();

		for (int i = 0; i < num4; i++) {
			System.out.print("*");
		}
		System.out.print(num4);
		System.out.println();

		for (int i = 0; i < num5; i++) {
			System.out.print("*");
		}
		System.out.print(num5);
		System.out.println();
	}
}

