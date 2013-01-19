public class PiCalc {
	public static void main(String[] args) {
		double pi = 0;
		int sign = 1;
		int iter = 0;

		for (int i = 1; i < 400000; i+=2) {
			pi = pi + (sign * 4.0 / i);
			sign *= -1;
//		System.out.println("The value of PI = " + pi);
			if (pi >= 3.14158 && pi <= 3.1416 && iter == 0) {
				iter = i;
			}
		}
		System.out.println("The value of PI = " + pi);
		System.out.println("The value of iter is when it first gets near 3.14159 = " + iter);
	}
}
