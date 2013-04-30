/*
(Multiples) Write a method isMultiple that determines, for a pair of integers, whether the second integer is a multiple of the first. The method should take two integer arguments and return true if the second is a multiple of the first and false otherwise. [Hint: Use the remainder operator.] Incorporate this method into an application that inputs a series of pairs of integers (one pair at a time) and determines whether the second value in each pair is a multiple of the first.
*/
import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		do {
			System.out.print("Enter the first number: ");
			int num1 = input.nextInt();

			System.out.print("Enter the second number: ");
			int num2 = input.nextInt();
			if(num2 == 0) {
				break;
			}

			if (isMultiple(num1, num2) == true) {
				System.out.println("The number " + num2 + " is a multiple of " + num1 + ".");
			} else {
				System.out.println("The number " + num2 + " is not a multiple of " + num1 + ".");
			}
		} while (true);
	}

	public static boolean isMultiple(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}

