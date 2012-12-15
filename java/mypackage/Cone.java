import java.io.*;
import java.lang.String;
import java.lang.Math;
package mypackage;

class Cone {
	double pi=3.14159;
	double height;
	double radius;

	Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public double getHeight() {
		return height;
	}

	public double calcVolume() {
		double volume = 0.0;
		volume = pi * height * Math.pow(radius, 2) / 3;
		return volume;
	}

	public double calcSurfaceArea() {
		return (pi * Math.pow(radius, 2) + pi * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)));
	}

	public static void main(String args[]) {
		Cone c1 = new Cone(5,5);
		System.out.println("Volume of cone of radius " + c1.getRadius() + " and height " + c1.getHeight() + " is " + c1.calcVolume());
		System.out.println("Area of cone of radius " + c1.getRadius() + " and height " + c1.getHeight() + " is " + c1.calcSurfaceArea());
	}
}
