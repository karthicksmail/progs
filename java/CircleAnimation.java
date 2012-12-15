import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CircleAnimation {
	private int x, y;
	private JFrame frame;
	private AnimationPanel panel;

	public static void main(String[] args) {
		CircleAnimation ca = new CircleAnimation();
		ca.dispForm();
	}

	public CircleAnimation() {
		frame = new JFrame();
		panel = new AnimationPanel();
		x = y = 20;
	}

	public void dispForm() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		frame.setSize(700, 700);
		frame.setVisible(true);

		for(x = 20, y = 20; x < (int)(panel.getWidth() - 20.0); x++, y++) {
//			for(y = 20; y < (int)(panel.getHeight() - 20.0); y++) {
				panel.repaint();

				for (int q = 0; q < 1000000; q++);
//			}
		}
	}

	class AnimationPanel extends JPanel {
		public void paintComponent(Graphics g){
			g.setColor(Color.green);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(new Color(0, 0, 0));
			System.out.println("x = " + x + " y = " + y);
			g.fillOval(x, y, 20, 20);
		}
	}
}