/*
(Circle Area) Write an application that prompts the user for the radius of a circle and uses a method called circleArea to calculate the area of the circle.
*/

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextInt();
	
		double area = circleArea(radius);
		System.out.println("The area of circle with radius " + radius + " is " + area);
	}

	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2.0);
	}
}

