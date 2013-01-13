/**
 * Problem Statement:
 * (Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
 *	System.out.print( "* " );
 *	System.out.print( " " );
 *	System.out.println();
 * to display the checkerboard pattern that follows.
 * A System.out.println method call with no arguments causes the program to output a single newline character. [Hint: Repetition statements are required.]
 */
public class AsteriskCheckerBoard {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			if (i % 2 == 1) {
				System.out.print(" ");
			}
			for (int j = 0; j < 8; j++) {
				System.out.print( "* " );
			}
			System.out.println();
		}
	}
}

