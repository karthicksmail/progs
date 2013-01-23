public class DeMorgansLaws {
	public static void main(String[] args) {
		//!( x < 5 ) && !( y >= 7 )
		int x = 3;
		int y = 10;
		System.out.println("If x = " + x + " and y = " + y + ", then the expression [!( x < 5 ) && !( y >= 7 )] = " + (!( x < 5 ) && !( y >= 7 )));
		System.out.println("If x = " + x + " and y = " + y + ", then the expression [!(( x < 5 ) || ( y >= 7 ))] = " + !(( x < 5 ) || ( y >= 7 )));

		// !( a == b ) || !( g != 5 )
		int a = 3;
		int b = 10;
		int g = 5;
		System.out.println("If a = " + a + ", b = " + b + " and g = " + g + ", then the expression [!( a == b ) || !( g != 5 )] = " + (!( a == b ) || !( g != 5 )));
		System.out.println("If a = " + a + ", b = " + b + " and g = " + g + ", then the expression [!(( a == b ) && ( g != 5 ))] = " + (!(( a == b ) && ( g != 5 ))));

		// !( ( x <= 8 ) && ( y > 4 ) )
		x = 8;
		y = 5;
		System.out.println("If x = " + x + " and y = " + y + ", then the expression [!( ( x <= 8 ) && ( y > 4 ) )] = " + (!( ( x <= 8 ) && ( y > 4 ) )));
		System.out.println("If x = " + x + " and y = " + y + ", then the expression [( !( x <= 8 ) || !( y > 4 ) )] = " + (( !( x <= 8 ) || !( y > 4 ) )));

		// !( ( i > 4 ) || ( j <= 6 ) )
		int i = 8;
		int j = 5;
		System.out.println("If i = " + i + " and j = " + j + ", then the expression [!( ( i > 4 ) || ( j <= 6 ) )] = " + (!( ( i > 4 ) || ( j <= 6 ) )));
		System.out.println("If i = " + i + " and j = " + j + ", then the expression [( !( i > 4 ) && !( j <= 6 ) )] = " + (( !( i > 4 ) && !( j <= 6 ) )));
	}
}

