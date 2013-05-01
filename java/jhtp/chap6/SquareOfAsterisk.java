/*
(Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid square (the same number of rows and columns) of asterisks whose side is specified in integer parameter side. For example, if side is 4, the method should display
*/
import java.util.Scanner;

public class SquareOfAsterisk {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of asterisk in each side of the square: ");
		int size = input.nextInt();

		squareOfAsterisks(size);
	}

	public static void squareOfAsterisks(int size) {
		for (int i = 0 ; i < size; i++) {
			lineOfAsterisks(size);
		}
	}

	public static void lineOfAsterisks(int size) {
		for (int j = 0; j < size; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}

