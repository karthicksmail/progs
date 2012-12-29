/*(Computerization of Health Records) A health care issue that has been in the news lately is the computerization of health records. This possibility is being approached cautiously because of sensitive privacy and security concerns, among others. [We address such concerns in later exercises.] Computerizing health records could make it easier for patients to share their health profiles and histories among their various health care professionals. This could improve the quality of health care, help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class should have a constructor that receives this data. For each attribute, provide set and get methods. The class also should include methods that calculate and return the user’s age in years, maximum heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see Exercise 2.33). Write a Java application that prompts for the person’s information, instantiates an object of class HealthProfile for that person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display the BMI values chart from Exercise 2.33.*/
import java.util.Calendar;

class HealthProfile {
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private double weight;
	private double height;

	/**
	 * Default Constructor
	 * @private
	 */
	private HealthProfile() {
	}

	/**
	 * Parameterized Constructor
	 * @param fName First Name
	 * @param lName Last Name
	 * @param sex Gender
	 * @param dob Date of Birth
	 */
	public HealthProfile(String fName, String lName, String sex, Date dob, double ht, double wt) {
		firstName = fName;
		lastName = lName;
		gender = sex;
		dateOfBirth = dob;
		height = ht;
		weight = wt;
	}

	/**
	 * Getter for First Name
	 * @return First Name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Setter for First Name
	 * @param fName First Name
	 */
	public void setFirstName(String fName) {
		firstName = fName;
	}

	/**
	 * Getter for Last Name
	 * @return Last Name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Setter for Last Name
	 * @param lName Last Name
	 */
	public void setLastName(String lName) {
		lastName = lName;
	}

	/**
	 * Getter for Gender
	 * @return Gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Setter for Gender
	 * @param sex Gender
	 */
	public void setGender(String sex) {
		gender = sex;
	}

	/**
	 * Getter for Date of birth
	 * @return Date Of Birth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Setter for Date of birth
	 * @param dob Date Of Birth
	 */
	public void setDateOfBirth(Date dob) {
		dateOfBirth.setDay(dob.getDay());
		dateOfBirth.setMonth(dob.getMonth());
		dateOfBirth.setYear(dob.getYear());
	}

	/**
	 * Getter for Height in meters
	 * @return Height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Setter for Height in meters
	 * @param ht Height
	 */
	public void setHeight(double ht) {
		if (ht <= 0) { 
			height = 0;	
		} else {
			height = ht;
		}
	}

	/**
	 * Getter for Weight in kilograms
	 * @return Weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Setter for Weight in kilograms
	 * @param wt Weight
	 */
	public void setWeight(double wt) {
		if (wt <= 0) {
			weight = 0;
		} else {
			weight = wt;
		}
	}

	/**
	 * Calculate and return the BMI of the person
	 */
	public double calcBMI() {
		return weight / (height * height);
	}

	public void displayInfo() {
		HeartRates hr = new HeartRates(firstName, lastName, dateOfBirth);
		System.out.printf("First Name: %s\n", firstName);
		System.out.printf("Last Name: %s\n",  lastName);
		System.out.printf("Gender: %s\n", gender);
		System.out.printf("Date of Birth: ");
		dateOfBirth.displayDate();
		System.out.println();
		System.out.printf("Age: %d\n", hr.calcAge());
		System.out.printf("Height: %.2f\n", height);
		System.out.printf("Weight: %.2f\n", weight);
		System.out.printf("BMI: %.2f\n", calcBMI());
		System.out.println();
		System.out.printf("BMI VALUES\n");
		System.out.printf("Underweight: less than 18.5\n");
		System.out.printf("Normal:      between 18.5 and 24.9\n");
		System.out.printf("Overweight:  between 25 and 29.9\n");
		System.out.printf("Obese:       30 or greater\n");
	}
}

