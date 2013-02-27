import javax.swing.JFrame;

public class BullsEyeTest {
	public static void main(String[] args) {
		BullsEye panel = new BullsEye();
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(500, 520);
		frame.setVisible(true);
	}
}

