import javax.swing.*;
import java.awt.*;

public class Panel1 {
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.setBackground(Color.darkGray);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.add(new JButton("Shock me!"));
		panel.add(new JButton("bliss"));
		panel.add(new JButton("huh?"));

		frame.getContentPane().add(BorderLayout.EAST, panel);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
