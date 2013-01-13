/**
 * Problem Statement:
 * (Palindromes)
 * A palindrome is a sequence of characters that reads the same backward as forward.
 * For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611.
 * Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
 * If the number is not five digits long, display an error message and allow the user to enter a new value.
 */
import java.util.Scanner;

public class NumberPalindromes {
	public static void main(String[] args) {
		int num = 0;
		int mun = 0;

		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter a five digit number: ");
			num = input.nextInt();

			if(num < 10000 || num > 99999) {
				System.out.println("Please enter a five digit number only");
			}
		}while (num < 10000 || num > 99999);
		for (int i = num; i != 0; i /= 10) {
			mun = mun * 10 + i % 10;
		}

		if (num == mun) {
			System.out.println("The number is a palindrome.");
		} else {
			System.out.println("The number is not a palindrome.");
		}
	}
}

