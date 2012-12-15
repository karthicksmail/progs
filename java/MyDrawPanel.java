import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		MyDrawPanel mdp = new MyDrawPanel();
		frame.getContentPane().add(mdp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(20,50,100,100);
	}
}
