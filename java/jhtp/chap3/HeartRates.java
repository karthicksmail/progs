/*(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that your heart rate stays within a safe range suggested by your trainers and doctors. According to the American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years. Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified health care professional before beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods. The class also should include a method that calculates and returns the person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a Java application that prompts for the person’s information, instantiates an object of class HeartRates and prints the information from that object—including the person’s first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate range.
*/
import java.util.Calendar;

/**
 * Target Heart Rate Calculator. Helps in calculating the target heart rate for an individual while exercising. It is essential for the heart rate to be within a safe range as suggested by the individual's trainers and doctors.
 * Disclaimer: Note that these formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified health care professional before beginning or modifying an exercise program.
 */
public class HeartRates {
	private String firstName;
	private String lastName;
	private Date dateOfBirth;

	/**
	 * Default Constructor. Initializes the member variables to default value of the data type.
	 */
	public HeartRates(){
		firstName = new String();
		lastName = new String();
		dateOfBirth = new Date(1, 1, 1971);
	}

	/**
	 * Parameterized Constructor. Initializes the member variables to value specified in the parameters.
	 * @param fName First Name
	 * @param lName Last Name
	 * @param dateOfBirth Date of Birth
	 */
	public HeartRates(String fName, String lName, Date date) {
		firstName = fName;
		lastName = lName;
		dateOfBirth = date;
	}

	/**
	 * Getter for firstName.
	 * @return First Name
	 */
	public String getFirstName(){
		return firstName;
	}

	/**
	 * Getter for lastName.
	 * @return Last Name
	 */
	public String getLastName(){
		return lastName;
	}

	/**
	 * Calculate Age. Uses Date of Birth to calculate the age.
	 * @return Age in years
	 */
	public int calcAge() {
		Calendar calToday = Calendar.getInstance();
		Date today = new Date(calToday.get(Calendar.DATE), calToday.get(Calendar.MONTH), calToday.get(Calendar.YEAR));
		long diff = today.dateDiff(dateOfBirth);
		Date forAge = HeartRates.convertDaysCountToDate(diff);
		return forAge.getYear();
	}

	/**
	 * Calculate Target Heart Rate based on percent specified.
	 * @param percent Percentage of maximum heart rate
	 */
	public int calcTargetHeartRate(int percent) {
		System.out.println("Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness and gender of the individual. Always consult a physician or qualified health care professional before beginning or modifying an exercise program.");
		return ((220 - calcAge()) * percent / 100);
	}

	/**
	 * Method to convert the count of days specified to a Date object
	 * @param numOfDays Number of Days
	 * @return Date object which represents the difference in years, months and days
	 */
	public static Date convertDaysCountToDate(long numOfDays) {
		int  year = (int)(numOfDays / 365);
		int  remaining = (int)(numOfDays - year * 365);
		int  month = (int)(remaining / 30);
		int  days = (int)(remaining - month * 30);

		return new Date(days, month, year);
	}

	public static void main(String[] args) {
		Date dob = new Date(25, 9, 1984);
		HeartRates hr = new HeartRates("Soumiyashri", "Swaminathan", dob);
		int targHeartRate = hr.calcTargetHeartRate(100);
		System.out.printf("The Target Heart Rate for %s %s is %d\n", hr.getFirstName(), hr.getLastName(), targHeartRate);
	}
}

