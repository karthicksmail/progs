/**
(Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of a right triangle when the lengths of the other two sides are given. The method should take two arguments of type double and return the hypotenuse as a double. Incorporate this method into an application that reads values for side1 and side2 and performs the calculation with the hypotenuse method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]
**/

import java.util.Scanner;

public class HypotenuseCalculations {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of one of the sides: ");
		double side1 = input.nextDouble();

		System.out.print("Enter the length of the other side: ");
		double side2 = input.nextDouble();

		double hypo = hypoCalc(side1, side2);

		System.out.println("The Hypotenuse of the triangle with sides " + side1 + " and " + side2 + " is " + hypo);
	}

	public static double hypoCalc(double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2, 2.0));
	}
}

