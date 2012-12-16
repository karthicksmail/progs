// Exercise 3.14
/**
 * Employee class which stores the Employee's first name, last name and salary.
 */
public class Employee {
	/**
	 * The First Name
	 */
	private String firstName;
	/**
	 * The Last Name
	 */
	private String lastName;
	/**
	 * Salary
	 */
	private double salary;

	/**
	 * Default Constructor.
	 * Initializes all members to the default value of the data type.
	 */
	public Employee(){
		firstName = new String();
		lastName = new String();
		salary = 0.0;
	}

	/**
	 * Parameterized Constructor.
	 * @param fName The First Name
	 * @param lName The Last Name
	 * @param sal   Salary
	 * Initializes the members to the parameters that have been set.
	 * salary is set only when the value is more than 0.0
	 */
	public Employee(String fName, String lName, double sal) {
		firstName = fName;
		lastName = lName;
		if (sal > 0.0) {
			salary = sal;
		} else {
			sal = 0.0;
		}
	}

	/**
	 * Setter for First Name
	 * @param fName The First Name
	 */
	public void setFirstName(String fName) {
		firstName = fName;
	}

	/**
	 * Setter for Last Name
	 * @param lName The Last Name
	 */
	public void setLastname(String lName) {
		lastName = lName;
	}

	/**
	 * Setter for Salary
	 * @param sal Salary. The member variable is set to 0.0 if sal is negative.
	 */
	public void setSalary(double sal) {
		salary = sal;
	}

	/**
	 * Getter for First Name
	 * @return The First Name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Getter for Last Name
	 * @return The Last Name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Getter for Salary
	 * @return Salary
	 */
	public double getSalary() {
		return salary;
	}
}

