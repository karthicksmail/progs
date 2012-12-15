import javax.swing.*;
import java.awt.*;

public class RandomGradientCircle {
	public static void main(String[] args) {
		RandomGradientCircle rgc = new RandomGradientCircle();

		rgc.draw();
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
		
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		
		Color startColor = new Color(red, green, blue);

		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);
		
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gp = new GradientPaint(70, 70, startColor,
											150, 150, endColor);
		g2d.setPaint(gp);
		g2d.fillOval(70, 70, 100, 100);
	}
}
