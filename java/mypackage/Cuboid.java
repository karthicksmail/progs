import java.io.*;
import java.lang.String;
import java.lang.Math;
package mypackage;

class Cuboid extends GeoObject{
	double length, width, height;

	Cuboid(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	double getLength() {
		return length;
	}

	double getWidth() {
		return width;
	}

	double getHeight() {
		return height;
	}

	double calcVolume() {
		return (length * height * width);
	}

	double calcSurfaceArea() {
		return (2 * (length * height + height * width + width * length));
	}

	public static void main(String args[]) {
		Cuboid c1 = new Cuboid(5, 5, 5);
		System.out.println("Volume of cuboid of length " + c1.getLength() + ", width " + c1.getWidth() + ", height " + c1.getHeight() + " is " + c1.calcVolume());
		System.out.println("Area of cuboid of length " + c1.getLength() + ", width " + c1.getWidth() + ", height " + c1.getHeight() + " is " + c1.calcSurfaceArea());
	}
}
