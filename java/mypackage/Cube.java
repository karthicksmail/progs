import java.io.*;
import java.lang.String;
import java.lang.Math;
package mypackage;

class Cube {
	double side;

	Cube (double side) {
		this.side = side;
	}

	double getSide() {
		return side;
	}

	double calcSurfaceArea() {
		return (6 * Math.pow(side, 2));
	}

	double calcVolume() {
		return (Math.pow(side, 3));
	}

	public static void main(String args[]) {
		Cube c1 = new Cube(5);
		System.out.println("Volume of cube of side " + c1.getSide() + " is " + c1.calcVolume());
		System.out.println("Area of cube of side " + c1.getSide() + " is " + c1.calcSurfaceArea());
	}
}
