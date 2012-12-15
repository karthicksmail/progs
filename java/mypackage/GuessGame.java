import java.lang.String;
import java.lang.Math;

class GuessGame {
	private int number;

	public void generateNumber() {
		number = (int) (Math.random() * 10);
	}

	public boolean compareWithGuessNumber(int guessNumber) {
		if (number == guessNumber) {
			return true;
		}
		else {
			return false;
		}
	}
}

