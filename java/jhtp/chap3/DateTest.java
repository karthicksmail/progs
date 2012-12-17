//Exercise 3.15
//Test driver for Date Class. Is not based on any unit test framework. Confirmation of values need to be done manually.
public class DateTest {
	public static void main(String[] args) {
		Date d1 = new Date(31, 3, 2010);
		Date d2 = new Date(4, 12, 2012);

		System.out.print("d1 is ");
		d1.displayDate();
		System.out.println();

		System.out.printf("d2 is %d/%d/%d\n", d2.getDay(), d2.getMonth(), d2.getYear());

		d1.setDay(10);
		d1.setMonth(4);
		d1.setYear(2013);

		System.out.print("d1 is ");
		d1.displayDate();
		System.out.println();

		System.out.printf("d2 is %d/%d/%d\n", d2.getDay(), d2.getMonth(), d2.getYear());
	}
}
