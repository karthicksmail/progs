import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradientCircle {
	public static void main(String[] args) {
		GradientCircle gc1 = new GradientCircle();
		
		gc1.draw();
	}
	
	public void draw() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GradientDrawPanel gdp = new GradientDrawPanel();
		frame.getContentPane().add(gdp);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}

class GradientDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		GradientPaint gp = new GradientPaint(
									50, 50, Color.blue,
									200, 200, Color.orange);

		g2d.setPaint(gp);
		g2d.fillOval(50, 50, 200, 200);
	}
}
