/*
 * Problem Statement:
 * (Gas Mileage)
 * Drivers are concerned with the mileage their automobiles get.
 * One driver has kept track of several trips by recording the miles driven and gallons used for each tankful.
 * Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip.
 * The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per gallon obtained for all trips up to this point.
 * All averaging calculations should produce floating-point results.
 * Use class Scanner and sentinel-controlled repetition to obtain the data from the user.
 */

/**
 * Calculates the Gas Mileage.
 */
public class GasMileage {
	private double miles;
	private double gallons;

	/**
	 * Default Constructor. Sets the values to 0.
	 */
	public GasMileage() {
		miles = gallons = 0.0;
	}

	/**
	 * Parameterized Constructor.
	 * @param m Number of miles
	 * @param g Number of gallons
	 */
	public GasMileage(double m, double g) {
		miles = m;
		gallons = g;
	}

	/**
	 * Getter for miles
	 * @return Number of miles
	 */
	public double getMiles() {
		return miles;
	}

	/**
	 * Setter for miles
	 * @param m Number of miles
	 */
	public void setMiles(double m) {
		// Have implemented this in this convoluted way because of lack of exceptions. Ideally, I would have thrown an InvalidDataException when (m <= 0).
		if (m <= 0) {
			miles = -1.0;
		} else {
			miles = m;
		}
	}

	/**
	 * Getter for gallons
	 * @return Number of gallons
	 */
	public double getGallons() {
		return gallons;
	}

	/**
	 * Setter for gallons
	 * @param g Number of gallons
	 */
	public void setGallons(double g) {
		// Have implemented this in this convoluted way because of lack of exceptions. Ideally, I would have thrown an InvalidDataException when (g <= 0).
		if (g <= 0) {
			gallons = -1.0;
		} else {
			gallons = g;
		}
	}

	public double calcMilesPerGallon() {
		// Have implemented this in this convoluted way because of lack of exceptions. Ideally, I would have thrown an InvalidDataException when (g <= 0).
		if (gallons > 0) {
			return miles/gallons;
		} else {
			return -1.0;
		}
	}
}

