import java.io.*;
import java.lang.String;
import java.lang.Math;
package mypackage;

class Sphere {
	double pi = 3.14159;
	double radius;

	Sphere(double radius) {
		this.radius = radius;
	}

	double getRadius() {
		return radius;
	}

	double calcVolume() {
		return (pi * Math.pow(radius, 3) * 4 / 3);
	}

	double calcSurfaceArea() {
		return (4 * pi * Math.pow(radius, 2));
	}

	public static void main(String args[]) {
		Sphere s1 = new Sphere(5);
		System.out.println("Volume of sphere of radius " + s1.getRadius() + " is " + s1.calcVolume());
		System.out.println("Area of sphere of radius " + s1.getRadius() + " is " + s1.calcSurfaceArea());
	}
}
