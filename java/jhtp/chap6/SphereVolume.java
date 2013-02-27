import java.util.Scanner;

public class SphereVolume {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();

		double volume = sphereVolume(radius);
		System.out.println("The Volume of the sphere with radius " + radius + " is " + volume);
	}

	public static double sphereVolume(double radius) {
		return ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
	}
}

