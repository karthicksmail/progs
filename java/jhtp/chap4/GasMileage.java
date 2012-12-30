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

