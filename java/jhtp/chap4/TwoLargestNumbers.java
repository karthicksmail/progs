import java.util.Scanner;

public class TwoLargestNumbers {
	public static void main(String[] args){
		int largest = 0;
		int largest_2nd = 0;
		int number = 0;
		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.printf("Enter the number %d: ", i);
			number = input.nextInt();
			if (number > largest) {
				largest_2nd = largest;
				largest = number;
			} else if (number > largest_2nd) {
				largest_2nd = number;
			}
		}
		System.out.printf("The Largest number is: %d\n", largest);
		System.out.printf("The 2nd Largest number is: %d\n", largest_2nd);
	}
}
