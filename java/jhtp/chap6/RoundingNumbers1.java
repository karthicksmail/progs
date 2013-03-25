import java.util.Scanner;

public class RoundingNumbers1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		char ch = 'n';

		do {
			System.out.print("Enter the number: ");
			double number = input.nextDouble();
	
			int answer = (int)Math.floor(number + 0.5);
			System.out.println("The number " + number + " is rounded to " + answer);

			System.out.print("Continue? (y/n)");
			ch = input.next().toLowerCase().charAt(0);
		} while (ch == 'y');
	}
}

