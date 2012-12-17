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
	 * Do I need this really when I have a parameterized constructor? No! But doing this for practise.
	 */
	private Date() {
		day = month = year = 0;
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
}

