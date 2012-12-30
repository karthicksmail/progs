public class HealthProfileTest {
	public static void main(String[] args){
		String fName = "Soumiya", lName = "Karthick", gender = "F";
		Date dob = new Date(25, 5, 1984);
		double ht = 1.628, wt = 82.5;

		HealthProfile healthProfile = new HealthProfile(fName, lName, gender, dob, ht, wt);
		healthProfile.displayInfo();
		if (healthProfile.calcBMI() == 31.13){
			System.out.println("SUCCESS!\n");
		} else {
			System.out.println("FAILURE!\n");
		}

		ht = 0.0;
		wt = 82.5;
		healthProfile.setHeight(ht);
		healthProfile.setWeight(wt);
		healthProfile.displayInfo();
		if (healthProfile.calcBMI() == -1.0){
			System.out.println("SUCCESS!\n");
		} else {
			System.out.println("FAILURE!\n");
		}

		ht = -1.0;
		wt = 82.5;
		healthProfile.setHeight(ht);
		healthProfile.setWeight(wt);
		healthProfile.displayInfo();
		if (healthProfile.calcBMI() == -1.0){
			System.out.println("SUCCESS!\n");
		} else {
			System.out.println("FAILURE!\n");
		}

		ht = 1.628;
		wt = 0.0;
		healthProfile.setHeight(ht);
		healthProfile.setWeight(wt);
		healthProfile.displayInfo();
		if (healthProfile.calcBMI() == 0.0){
			System.out.println("SUCCESS!\n");
		} else {
			System.out.println("FAILURE!\n");
		}

		ht = 1.628;
		wt = -1.0;
		healthProfile.setHeight(ht);
		healthProfile.setWeight(wt);
		healthProfile.displayInfo();
		if (healthProfile.calcBMI() == 0.0){
			System.out.println("SUCCESS!\n");
		} else {
			System.out.println("FAILURE!\n");
		}

		ht = -1.0;
		wt = -1.0;
		healthProfile.setHeight(ht);
		healthProfile.setWeight(wt);
		healthProfile.displayInfo();
		if (healthProfile.calcBMI() == -1.0){
			System.out.println("SUCCESS!\n");
		} else {
			System.out.println("FAILURE!\n");
		}
	}
}

