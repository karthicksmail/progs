/**
 * Problem Statement:
 * (Sides of a Triangle)
 * Write an application that reads three nonzero values entered by the user and determines and prints whether they could represent the sides of a triangle.
 */
import java.util.Scanner;

public class TriangleSides {
	public static void main(String[] args) {
		int s1, s2, s3;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the three sides: ");
		s1 = input.nextInt();
		s2 = input.nextInt();
		s3 = input.nextInt();

		if ((s1 <= 0) || (s2 <= 0) || (s3 <= 0)) {
			System.out.println("The numbers should be positive.");
		} else if ( ((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s3 + s1) > s2) ) {
			System.out.println("These three lengths make a triangle");
		} else {
			System.out.println("These three lengths do not make a triangle");
		}
	}
}

