public class PythoNumbersBrute {
	public static void main(String[] args) {
		System.out.println("side1\tside2\tHypotenuse");
		for(int hypo = 1; hypo < 500; hypo++) {
			// The sides cannot be more than the hypotenuse in length
			for(int side1 = 1; side1 < hypo; side1++) {
				// The second side cannot be more than the first side. The combination would surely be caught later in the loop
				for(int side2 = 1; side2 < side1; side2++) {
					if( ((hypo * hypo) == ((side1 * side1) + (side2 * side2))) ) {
						System.out.println(side1 + "\t" + side2 + "\t" + hypo);
					}
				}
			}
		}
	}
}

