// Exercise 3.15
/**
 * Date class which stores the Day, Month and Year.
 * This class does not validate the date.
 */
public class Date {
	/**
	 * Day
	 */
	private int day;

	/**
	 * Month
	 */
	private int month;

	/**
	 * Year
	 */
	private int year;

	/**
	 * The default constructor
	 * Have made this private because a date object should not be initialized without proper values.
	 */
	private Date() {
		day = 1;
		month = 1;
		year = 1971;
	}

	/**
	 * The parameterized constructor
	 * @param d Day
	 * @param m Month
	 * @param y Year
	 */
	public Date(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	/**
	 * Setter for day
	 * @param d Day
	 */
	public void setDay(int d) {
		day = d;
	}

	/**
	 * Setter for month
	 * @param m Month
	 */
	public void setMonth(int m) {
		month = m;
	}

	/**
	 * Setter for year
	 * @param y Year
	 */
	public void setYear(int y) {
		year = y;
	}

	/**
	 * Getter for day
	 * @return day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Getter for month
	 * @return month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Getter for year
	 * @return year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Method to display the date with the members separated by "/". 
	 */
	public void displayDate() {
		System.out.printf("%d/%d/%d", day, month, year);
	}

	/**
	 * Method to convert the number of days into milli seconds
	 * @private
	 * @param numOfDays The count of the days to be converted into milli-seconds
	 * @return The count in milli-seconds
	 */
	private long convertDaysIntoMilliSecs(int numOfDays) {
		//day difference in milli seconds = daydiff * number of hours per day * number of seconds per hour * number of milli secs in a second
		return (numOfDays * 24 * 3600 * 1000);
	}

	/**
	 * Method to calculate the number of days since Epoch (1/1/1971)
	 * @return number of days
	 */
	public int calcDaysSinceEpoch() {
		int  yearDiff = year - 1970;
		int  monthDiff = month - 1;
		int  dayDiff = day - 1;

		// We are doing an assumption of 30 days per month. However, every year we lose around 5.25 days. We make up for this by calculating the number of milli seconds for 5 days every year and adding it over here.
		int daysSinceEpoch = dayDiff + monthDiff * 30 + yearDiff * 12 * 30 + (yearDiff * 21) / 4;
		return daysSinceEpoch;
	}

	/**
	 * Method to calculate the milli-seconds since Epoch (1/1/1971)
	 * @return number of milli seconds
	 */
	public long calcMilliSecsSinceEpoch() {
		int daysSinceEpoch = calcDaysSinceEpoch();

		long milliSecSinceEpoch = convertDaysIntoMilliSecs(daysSinceEpoch);

		return milliSecSinceEpoch;
	}

	/**
	 * Method to calculate the difference between current date and specified date in days
	 */
	public long dateDiff(Date olderDate) {
	// Convert the date given in the object into number of days
	// Convert the date given as the parameter into number of days
	// Find Difference between number of days
	// Convert difference into years, months and remaining days
		int objDaysCount = calcDaysSinceEpoch();
		int argDaysCount = olderDate.calcDaysSinceEpoch();
		return (objDaysCount - argDaysCount);
	}
}

