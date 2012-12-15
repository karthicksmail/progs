import java.util.ArrayList;

public class TeleToWord {

	public static void main(String[] args) {
		TeleToWord ttw = new TeleToWord();
		String teleWord = ttw.go();
		System.out.println("The Tele Word is " + teleWord);
	}

	public String go() {
		String teleNumber = getTeleNumber();
		ArrayList<String> teleWords = new ArrayList<String>();
		for (int i = 0; i < teleNumber.length(); i++) {
			switch(Integer.parseInt(teleNumber.substring(i, i+1)))
			{
				case 0:
					teleWords[i] = new String(" ");
					break;
				case 1:
//					telewordsadd(".,");
					break;
			}
		}

		return teleNumber;
	}
	
	private String getTeleNumber() {
		return "65104640";
	}
}
