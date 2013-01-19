public class ModTrianglePrinting {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i < j){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for (int j = 0; j < 5; j++) {
				System.out.print(" ");
			}

			for(int j = 0; j < 10; j++) {
				if(i > j){
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
			}
			for (int j = 0; j < 5; j++) {
				System.out.print(" ");
			}


			for(int j = 0; j < 10; j++) {
				if(i >= 10 - j){
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for (int j = 0; j < 5; j++) {
				System.out.print(" ");
			}

			for(int j = 0; j < 10; j++) {
				if(9 - i > j){
					System.out.print(" ");
				}
				else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

