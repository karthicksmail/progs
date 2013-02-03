import java.util.Scanner;

public class ModDiamondPrint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("Enter an odd number from 1 to 19: ");
			count = input.nextInt();
		} while ((count % 2 == 0) || (count < 1) || (count > 19));

		int spc_cnt = (count + 1) / 2;
		for (int j = 1; j <= count; j++ ) {
			// This if condition determines the number of spaces to be displayed before and after the *s
			if (j < ((count + 3) / 2)) {
				spc_cnt--;
			} else {
				spc_cnt++;
			}
			for (int k = 0; k < spc_cnt; k++) {
				System.out.print(" ");
			}
			for (int k = 0; k < count - (spc_cnt * 2); k++) {
				System.out.print("*");
			}
			for (int k = 0; k < spc_cnt; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

