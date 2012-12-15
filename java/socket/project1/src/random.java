import java.util.ArrayList;


public class random {
	public static void main(String[] args) {
		String[] reg = new String[3];
		reg[0]="1";
		reg[1]="2";
		ArrayList array = new ArrayList();
		array.add(reg);
		for(int i = 0; i<array.size(); i++)
			System.out.println(array.get(i));
	}
}
