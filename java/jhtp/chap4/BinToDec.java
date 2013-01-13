/**
 * (Printing the Decimal Equivalent of a Binary Number)
 * Write an application that inputs an integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent.
 * [Hint: Use the remainder and division operators to pick off the binary numberâs digits one at a time, from right to left.
 * In the decimal number system, the rightmost digit has a positional value of 1 and the next digit to the left a positional value of 10, then 100, then 1000, and so on.
 * The decimal number 234 can be interpreted as 4 * 1 + 3 * 10 + 2 * 100.
 * In the binary number system, the rightmost digit has a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so on.
 * The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
 */
import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bin = 0;
		int dec = 0;

		System.out.print("Enter a binary number to convert to decimal: ");
		bin = input.nextInt();
		boolean isBinary = true;
		for (int binCopy = bin; binCopy != 0; binCopy /= 10) {
			if (binCopy % 10 > 1) { 
				isBinary = false;
				break;
			}
		}
		if (isBinary == false) {
			System.out.println("Number is not binary");
		} else {
			int i = 0;
			for (int binCopy = bin; binCopy != 0; binCopy /= 10) {
				// Take the digit and multiply it by the 2 ^ i and add it to the existing dec.
				// Since we have already multiplied by power, there is no need adjust digit location.
				dec = dec + (binCopy % 10) * (int)Math.pow(2, i);
				i++;
			}
			System.out.printf("bin = %d converts to dec = %d\n", bin, dec);
		}
	}
}

