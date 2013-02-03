public class DiamondPrint {
	public static void main(String[] args) {
		int spc_cnt = 0;
			for (int j = 1; j <= 9; j++ ) {
				switch (j) {
					case 1:
					case 9:
						spc_cnt = 4;
						break;
					case 2:
					case 8:
						spc_cnt = 3;
						break;
					case 3:
					case 7:
						spc_cnt = 2;
						break;
					case 4:
					case 6:
						spc_cnt = 1;
						break;
					case 5:
						spc_cnt = 0;
						break;
				}
				for (int k = 0; k < spc_cnt; k++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 9 - (spc_cnt * 2); k++) {
					System.out.print("*");
				}
				for (int k = 0; k < spc_cnt; k++) {
					System.out.print(" ");
				}
				System.out.println();
			} // end inner for
	}
}

