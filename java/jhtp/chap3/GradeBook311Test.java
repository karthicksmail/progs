public class GradeBook311Test
{
	// main method begins program execution
	public static void main( String[] args )
	{
		// create GradeBook311 object
		GradeBook311 gradeBook1 = new GradeBook311("CS101 Introduction to Java Programming", "Shriram");
		GradeBook311 gradeBook2 = new GradeBook311("CS102 Data Structures in Java", "Darshan");

		// display initial value of courseName for each GradeBook311
		gradeBook1.displayMessage();
		gradeBook2.displayMessage();
	} // end main
} // end class GradeBookTest
