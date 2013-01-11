import java.util.Scanner;

public class LargestNumber{
	public static void main(String[] args) {
		int largest = 0;
		int number = 0;
		int counter;

		Scanner input = new Scanner(System.in);

		for (counter = 0; counter < 10; counter++) {
			System.out.printf("Enter the sales by salesman %d: ", counter + 1);
			number = input.nextInt();

			if (number > largest) {
				largest = number;
			}
		}

		System.out.printf("The maximum sales was %d.\n", largest);
	}
}
