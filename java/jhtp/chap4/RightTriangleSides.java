import java.util.Scanner;

public class RightTriangleSides {
	public static void main(String[] args) {
		int s1, s2, s3;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the three sides: ");
		s1 = input.nextInt();	
		s2 = input.nextInt();	
		s3 = input.nextInt();	

		if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
			System.out.println("The numbers should be positive");
		} else if ((Math.pow(s1, 2) == Math.pow(s2, 2) + Math.pow(s3, 2))
				|| (Math.pow(s2, 2) == Math.pow(s3, 2) + Math.pow(s1, 2))
				|| (Math.pow(s3, 2) == Math.pow(s1, 2) + Math.pow(s2, 2))) {
			System.out.println("The numbers make a right angled triangle");
		} else {
			System.out.println("The numbers do not make a right angled triangle");
		}
	}
}

