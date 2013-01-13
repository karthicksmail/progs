/** Problem Statement:
 * (Square of Asterisks) Write an application that prompts the user to enter the size of the side of a square, then displays a hollow square of that size made of asterisks.
 * Your program should work for squares of all side lengths between 1 and 20.
 */
import java.util.Scanner;

public class AsteriskSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;

		System.out.print("Enter the size of the square: ");
		size = input.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j == 1 || j == size) {
					System.out.print("*");
				} else {
					if (i == 1 || i == size) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}

