import java.lang.String;
import java.util.Random;

class DotCom {
	private int start;
	private int end;

	public DotCom(){
		start = -1;
		end = -1;
	}

	public void Initialize(){
	    Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(7);
		start = randomInt;
		end = randomInt + 2;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}
}

class DotComBoard {
	private int[] dotcomboard;
	DotCom dotcom;

	public DotComBoard() {
		dotcomboard = new int[10];
		dotcom =  new DotCom();
	}

	public void Initialize() {
		int i;

		dotcom.Initialize();

		for (i = 0; i < 10; i++) {
			if(dotcom.getStart() == i) {
				dotcomboard[i] = 1;
				dotcomboard[i+1] = 1;
				dotcomboard[i+2] = 1;
				i+=2;
			}
			else {
				dotcomboard[i] = 0;
			}
		}

	}

	public void markAsHit(int column) {
		dotcomboard[column] = 2;
		if(column >= dotcom.getStart() && column <= dotcom.getEnd()) {
			System.out.println("Hit!");
		}
	}

	public boolean hasDotComSunk() {
		for (int i = dotcom.getStart(); i <= dotcom.getEnd(); i++) {
			if (2 != dotcomboard[i]) {
				return false;
			}
		}
		return true;
	}

	public void printDotCom() {
		System.out.println(dotcom.getStart() + " " + dotcom.getEnd());
	}
}

class DotComSinker1 {
	public static void main(String[] args){
		String input = new String();
		GameHelper gh1 = new GameHelper();
		DotComBoard dcb1 = new DotComBoard();

		dcb1.Initialize();
		System.out.print("Dot Com fields: ");
		dcb1.printDotCom();

		do {
			input = gh1.getUserInput("Wanna Guess?");
			int column = Integer.parseInt(input);

			if(column < 0) {
				System.out.println("You failed!!");
				break;
			}

			dcb1.markAsHit(column);
		} while(dcb1.hasDotComSunk() == false);

		if(dcb1.hasDotComSunk()) {
			System.out.println("You Passed!!");
		}
	}
}
