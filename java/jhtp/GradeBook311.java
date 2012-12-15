public class GradeBook311
{
	private String courseName; // course name for this GradeBook311
	private String instructorName; // name of the instructor for this course

	// constructor initializes courseName and instructorName with String arguments
	public GradeBook311(String cName, String iName){ // constructor name is class name
		courseName = cName; // initializes courseName
		instructorName = iName; // initializes instructorName
	} // end constructor

	// method to set the course name
	public void setCourseName(String name) {
		courseName = name; // store the course name
	} // end method setCourseName

	// method to retrieve the course name
	public String getCourseName() {
		return courseName;
	} // end method getCourseName

	// method to set the course instructor's name
	public void setInstructorName(String name) {
		instructorName = name;
	}

	public String getInstructorName(){
		return instructorName;
	}

	// display a welcome message to the GradeBook311 user
	public void displayMessage() {
		// this statement calls getCourseName to get the
		// name of the course this GradeBook311 represents
		System.out.printf( "Welcome to the grade book for %s!\n", getCourseName() );
		System.out.printf( "This course is presented by %s!\n", getInstructorName() );
	} // end method displayMessage
} // end class GradeBook311

