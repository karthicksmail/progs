/*
On the twelfth day of Christmas, my true love gave to me..
12 Drummers Drumming
11 Pipers Piping
10 Lords-a-Leaping
9 Ladies Dancing
8 Maids-a-Milking
7 Swans-a-Swimming
6 Geese-a-Laying
5 Gold Rings
4 Colly Birds
3 French Hens[7]
2 Turtle Doves
And a Partridge in a Pear Tree.
*/

public class TwelveDaysOfChristmas {
	public static void main(String[] args) {
		for (int i = 1; i < 13; i++) {
			String dayNum = new String();
			String given = new String();
			for (int j = 1; j <= i; j++) {
				switch(j){
					case 1:
						dayNum = "first";
						if (i == 1) {
							given = "\t";
						}
						given += "a Patridge in a Pear Tree.\n";
//						System.out.println("Case " + j + ":");
						break;
					case 2:
						dayNum = "second";
						given = "\t2 Turtle Doves\n\tAnd " + given;
//						System.out.println("Case " + j + ":");
						break;
					case 3:
						dayNum = "third";
						given = "\t3 French Hens\n " + given;
						break;
					case 4:
						dayNum = "fourth";
						given = "\t4 Colly Birds\n " + given;
						break;
					case 5:
						dayNum = "fifth";
						given = "\t5 Golden Rings\n " + given;
						break;
					case 6:
						dayNum = "sixth";
						given = "\t6 Geese-a-Laying\n " + given;
						break;
					case 7:
						dayNum = "seventh";
						given = "\t7 Swans-a-Swimming\n " + given;
						break;
					case 8:
						dayNum = "eighth";
						given = "\t8 Maids-a-Milking\n " + given;
						break;
					case 9:
						dayNum = "ninth";
						given = "\t9 Ladies Dancing\n " + given;
						break;
					case 10:
						dayNum = "tenth";
						given = "\t10 Lords-a-Leaping\n " + given;
						break;
					case 11:
						dayNum = "eleventh";
						given = "\t11 Pipers Piping\n " + given;
						break;
					case 12:
						dayNum = "twelfth";
						given = "\t12 Drummers Drumming\n " + given;
						break;
					default:
						dayNum = "ERROR";
						break;
				}
//				System.out.printf("Value of i = %d\t Value of j = %d\n", i, j);
			}
			System.out.println("On the " + dayNum + " day of Christmas, my true love gave to me");
			System.out.println(given);
		}
		System.out.println();
	}
}

