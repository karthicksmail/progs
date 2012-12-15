import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorCreator{
	private JFrame frame;
	private int red, green, blue;
	private ColorCreatorPanel ccp;

	public static void main(String[] args) {
		ColorCreator cc1 = new ColorCreator();
		cc1.dispForm();
	}
	
	public static int getLineNumber() {
		return Thread.currentThread().getStackTrace()[2].getLineNumber();
	}
	
	public ColorCreator() {
		red = green = blue = 255;
		frame = new JFrame();
		ccp = new ColorCreatorPanel();
	}

	public void dispForm() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn_red = new JButton("Red");
		btn_red.addActionListener(new RedButtonListener());

		JButton btn_green = new JButton("Green");
		btn_green.addActionListener(new GreenButtonListener());

		JButton btn_blue = new JButton("Blue");
		btn_blue.addActionListener(new BlueButtonListener());

		ccp.setRed(red);
		ccp.setGreen(green);
		ccp.setBlue(blue);

		frame.getContentPane().add(BorderLayout.SOUTH, btn_red);
		frame.getContentPane().add(BorderLayout.WEST, btn_green);
		frame.getContentPane().add(BorderLayout.EAST, btn_blue);
		frame.getContentPane().add(BorderLayout.CENTER, ccp);

		frame.setSize(300, 300);
		frame.setVisible(true);
		red=blue=green=0;
		ccp.setRed(red);
		ccp.setGreen(green);
		ccp.setBlue(blue);
	}

	class RedButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (red != 255) red++;
			ccp.setRed(red);
			frame.repaint();
		}
	}

	class GreenButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (green != 255) green++;
			ccp.setGreen(green);
			frame.repaint();
		}
	}

	class BlueButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (blue != 255) blue++;
			ccp.setBlue(blue);
			frame.repaint();
		}
	}
}

class ColorCreatorPanel extends JPanel {
	private int red, green, blue;

	public void setRed(int red) {
		this.red = red;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public void paintComponent(Graphics g) {
		g.setColor(new Color(red, green, blue));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}
}
