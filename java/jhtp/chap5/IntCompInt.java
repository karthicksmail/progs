public class IntCompInt
{
	public static void main( String[] args )
	{
		int amount;
		int principal = 100000;
		int rate = 5;

		System.out.printf("%s%20s\n", "Year", "Amount on deposit");

		for (int year = 1; year <= 10; year++){                                                    
			amount = (int) (principal * Math.pow( 1.0 + (double)(rate)/100, year ));

			int dollars = amount / 100;
			int cents = amount % 100;
			System.out.printf( "%4d%,15d.%02d\n", year, dollars, cents );
		}
	}
}
