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

