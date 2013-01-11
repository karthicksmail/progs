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

