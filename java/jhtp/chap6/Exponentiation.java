import java.util.Scanner;

public class Exponentiation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = input.nextInt();

		System.out.print("Enter the exponent: ");
		int exponent = input.nextInt();

		int answer = integerPower(base, exponent);

		System.out.println(base + " ^ " + exponent + " = " + answer);
	}

	public static int integerPower(int base, int exponent) {
		// Reducing one iteration by assigning base to answer and starting the oop from 1
		int answer = base;
		for (int i = 1; i < exponent; i++) {
			answer *= base;
		}
		return answer;
	}
}

