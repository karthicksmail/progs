/*
(Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive a second parameter of type char called fillCharacter. Form the square using the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
*/
import java.util.Scanner;

public class SquareOfAnyChar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of asterisk in each side of the square: ");
		int size = input.nextInt();

		System.out.print("Enter the character to be printed: ");
		char ch = input.next().charAt(0);

		squareOfAnyChars(size, ch);
	}

	public static void squareOfAnyChars(int size, char ch) {
		for (int i = 0 ; i < size; i++) {
			lineOfAnyChars(size, ch);
		}
	}

	public static void lineOfAnyChars(int size, char ch) {
		for (int j = 0; j < size; j++) {
			System.out.print(ch);
		}
		System.out.println("");
	}
}

