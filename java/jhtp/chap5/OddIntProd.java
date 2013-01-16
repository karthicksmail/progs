public class OddIntProd {
	public static void main(String[] args) {
		int prod = 3; // Initialize to 3 because you know that 3 is the first odd integer which makes a difference while calculating a product.
		for (int i = 5; i < 15; i+=2) { // Integer set [5,15)
			prod *= i;
		}
		System.out.println("Product of odd integers from 1 to 15 is " + prod);
	}
}
