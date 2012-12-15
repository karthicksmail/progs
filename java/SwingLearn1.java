import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SwingLearn1 implements ActionListener{
	JFrame frame;
	
	public static void main(String[] args) {
		SwingLearn1 sl1 = new SwingLearn1();
		sl1.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click to change color");
		button.addActionListener(this);
		
		SwingDrawPanel sdp1 = new SwingDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, sdp1);
		frame.setSize(1500, 1000);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
	}
}

class SwingDrawPanel extends JPanel{
	public void paintComponent(Graphics g) {
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color color = new Color(red, green, blue);

		g.setColor(color);
		g.fillRect(20, 50, 100, 100);
	}
}
