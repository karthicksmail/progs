public class Factorials{
	public static void main(String[] args) {
		System.out.println("Number\tFactorial");
		for (int i = 1; i <= 20; i++){
			long fact = 1;
			for (int j = 2; j <= i; j++) {
				fact *= j;
			}
			System.out.println(i + "\t" + fact);
		}
	}
}
