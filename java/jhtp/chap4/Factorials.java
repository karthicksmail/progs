import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		int choice = 0;
		Scanner input = new Scanner(System.in);

		System.out.printf("\n\n\n\t\t\tFactorial Options");
		System.out.printf("\n\n\t1. Print a number's factorial");
		System.out.printf("\n\n\t2. Calculate the value of e");
		System.out.printf("\n\n\t3. Calculate the value of e^x");
		System.out.printf("\n\n\t*. Exit from program");
		System.out.printf("\n\n\tEnter a choice: ");
		choice = input.nextInt();

		if (choice == 1) {
			System.out.printf("\n\n\tEnter the number for which factorial needs to be calculated: ");
			int num = input.nextInt();
			int fact = 1;
			// Not handling 0! since the assignment above and the loop below will handle it.
			for (int i = 1; i <= num; i++) {
				fact *= i;
			}
			System.out.printf("\n\n\tThe Factorial of %d is %d\n", num, fact);
		} else if (choice == 2) {
			System.out.printf("\n\n\tEnter the value till which you want to calculate e: ");
			int num = input.nextInt();

			double e = 1.0;
			for (int i = 1; i <= num; i++) {
				int fact = 1;

				for (int j = 1; j <= i; j++) {
					fact *= i;
				}

				e += (1.0 / fact);
			}
			System.out.printf("\n\n\tThe value of e till %d is %f\n", num, e);
		} else if (choice == 3) {
			System.out.printf("\n\n\tEnter the value till which you want to calculate e^x: ");
			int num = input.nextInt();
			double e = 1.0;
			for (int i = 1; i <= num; i++) {
				int fact = 1;

				for (int j = 1; j <= i; j++) {
					fact *= i;
				}

				e += (Math.pow(num, i) / fact);
			}
			System.out.printf("\n\n\tThe value of e^x till %d is %f\n", num, e);
		} else {
			System.out.println("\n\n\tWrong choice entered. Terminating...");
		}
	}
}
