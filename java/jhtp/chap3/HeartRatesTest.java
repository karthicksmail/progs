public class HeartRatesTest {
	public static void main(String[] args) {
		Date dob1 = new Date(25, 9, 1984);
		HeartRates hr1 = new HeartRates("Soumiya", "Karthick", dob1);
		int percent = 100;
		int targHeartRate = hr1.calcTargetHeartRate(percent);
		System.out.printf("The Target Heart Rate for %s %s at %d%% is %d\n", hr1.getFirstName(), hr1.getLastName(), percent, targHeartRate);
		if (targHeartRate == 192) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("FAILURE!");
		}

		percent = 80;
		targHeartRate = hr1.calcTargetHeartRate(percent);
		System.out.printf("The Target Heart Rate for %s %s at %d%% is %d\n", hr1.getFirstName(), hr1.getLastName(), percent, targHeartRate);
		if (targHeartRate == 153) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("FAILURE!");
		}

		percent = 60;
		targHeartRate = hr1.calcTargetHeartRate(percent);
		System.out.printf("The Target Heart Rate for %s %s at %d%% is %d\n", hr1.getFirstName(), hr1.getLastName(), percent, targHeartRate);
		if (targHeartRate == 115) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("FAILURE!");
		}

		Date dob2 = new Date(25, 5, 1980);
		HeartRates hr2 = new HeartRates("Karthick", "S", dob2);
		percent = 100;
		targHeartRate = hr2.calcTargetHeartRate(percent);
		System.out.printf("The Target Heart Rate for %s %s at %d%% is %d\n", hr1.getFirstName(), hr1.getLastName(), percent, targHeartRate);
		if (targHeartRate == 188) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("FAILURE!");
		}

		percent = 80;
		targHeartRate = hr2.calcTargetHeartRate(percent);
		System.out.printf("The Target Heart Rate for %s %s at %d%% is %d\n", hr1.getFirstName(), hr1.getLastName(), percent, targHeartRate);
		if (targHeartRate == 150) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("FAILURE!");
		}

		percent = 60;
		targHeartRate = hr2.calcTargetHeartRate(percent);
		System.out.printf("The Target Heart Rate for %s %s at %d%% is %d\n", hr1.getFirstName(), hr1.getLastName(), percent, targHeartRate);
		if (targHeartRate == 112) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("FAILURE!");
		}
	}
}

