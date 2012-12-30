import java.util.Scanner;

public class GasMileageTest {
	public static void main(String[] args) {
		double miles = 0;
		double gallons = 0;
		GasMileage gasMileage = new GasMileage();
		double totalMpg = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of miles: ");
		miles = input.nextDouble();
		System.out.print("Enter the number of gallons: ");
		gallons = input.nextDouble();

		gasMileage.setMiles(miles);
		gasMileage.setGallons(gallons);
		while (gallons > 0) {
			// Have implemented this in this convoluted way because of lack of exceptions. Ideally, I would have thrown exception when trying to set and handled the exception by printing the values
			totalMpg += gasMileage.calcMilesPerGallon();

			System.out.print("Enter the number of miles: ");
			miles = input.nextDouble();
			System.out.print("Enter the number of gallons: ");
			gallons = input.nextDouble();
	
			gasMileage.setMiles(miles);
			gasMileage.setGallons(gallons);
		}

		System.out.printf("Total Mileage is: %.2f\n", totalMpg);
	}
}

