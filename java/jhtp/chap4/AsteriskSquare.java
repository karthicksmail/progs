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

