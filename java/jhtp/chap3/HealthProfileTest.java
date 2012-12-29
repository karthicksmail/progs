public class HealthProfileTest {
	public static void main(String[] args){
		String fName = "Soumiya", lName = "Karthick", gender = "F";
		Date dob = new Date(25, 5, 1984);
		double ht = 1.628, wt = 82.5;

		HealthProfile healthProfile = new HealthProfile(fName, lName, gender, dob, ht, wt);
		healthProfile.displayInfo();
	}
}
