import java.lang.String;
import java.lang.Math;

class GuessGame {
	private int number;

	public void generateNumber() {
		number = (int) (Math.random() * 10);
	}

	public boolean compareWithGuessNumber(int guessNumber) {
		return (guessNumber == number);
	}
}

class Player {
	private int number;
	private boolean guess_success = false;
	public int guessNumber() {
		number = (int) (Math.random() * 10);
		return number;
	}

	public int getNumber() {
		return number;
	}

	public void setGuessSuccess(boolean guess_success) {
		this.guess_success = guess_success;
	}

	public boolean getGuessSuccess() {
		return guess_success;
	}
}

class GuessGameTester {
	public static void main(String[] args) {
		GuessGame g1 = new GuessGame();
		g1.generateNumber();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		while(!p1.getGuessSuccess() && !p2.getGuessSuccess() && !p3.getGuessSuccess()) {
			p1.setGuessSuccess(g1.compareWithGuessNumber(p1.guessNumber()));
			p2.setGuessSuccess(g1.compareWithGuessNumber(p2.guessNumber()));
			p3.setGuessSuccess(g1.compareWithGuessNumber(p3.guessNumber()));

			System.out.println("Player 1's guess (" + p1.getNumber() + ") was " + ((p1.getGuessSuccess())?"correct":"not correct"));
			System.out.println("Player 2's guess (" + p2.getNumber() + ") was " + ((p2.getGuessSuccess())?"correct":"not correct"));
			System.out.println("Player 3's guess (" + p3.getNumber() + ") was " + ((p3.getGuessSuccess())?"correct":"not correct"));
		}
	}
}
