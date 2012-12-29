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

		//Test for calcMilliSecSinceEpoch()
		Date d3 = new Date(25, 3, 1971);
		d3.displayDate();
		System.out.printf(" is %d days since epoch\n", d3.calcDaysSinceEpoch());
		d3.displayDate();
		System.out.printf(" is %d milliseconds since epoch\n", d3.calcMilliSecsSinceEpoch());

		Date d6 = new Date(20, 12, 2012);
		long count = d6.dateDiff(d3);
		d6.displayDate();
		System.out.printf(" is %d days since ", count);
		d3.displayDate();
		System.out.println();
	}
}

