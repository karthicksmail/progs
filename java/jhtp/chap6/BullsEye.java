/**
 * This program is not working properly
 */ 
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class BullsEye extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Random rand = new Random();

		int r1 = 1 + rand.nextInt(254);
		int g1 = 1 + rand.nextInt(254);
		int b1 = 1 + rand.nextInt(254);
		Color col1 = new Color(r1, g1, b1);

		int r2 = 1 + rand.nextInt(254);
		int g2 = 1 + rand.nextInt(254);
		int b2 = 1 + rand.nextInt(254);
		Color col2 = new Color(r2, g2, b2);

		int start_x = 10;
		int start_y = 10;
		int w = 480;
		int h = 480;
		int rad = (w - start_x) / 2;
		int unit = w / 10;
		int cen_x = start_x + rad;
		int cen_y = start_y + rad;
		System.out.println("Radius = " + rad + " Cen_x = " + cen_x + " Cen_y = " + cen_y);

		int act_x = (int)Math.sqrt(rad * rad + rad * rad) - cen_x;
		int act_y = (int)Math.sqrt(rad * rad + rad * rad) - cen_y;
		System.out.println("Radius = " + rad + " act_x = " + act_x + " act_y = " + act_y);
		int dist = (int)Math.sqrt(Math.pow((cen_x - act_x), 2) + Math.pow((cen_y - act_y), 2));
		System.out.println("Distance: " + dist);
		g.drawOval(act_x, act_y, 2, 2);
		g.drawOval(cen_x, cen_y, 2, 2);

//		for (int i = 2; i > 0; i--) {
//			if (i % 2 == 0) {
//				g.setColor(col1);
//				System.out.println("Coordinates: " + x + " " + y + " " + w + " " + h);
//				g.fillOval(x, y, w, h);
////				g.fillOval(10, 10, 480, 480);
//			} else {
//				g.setColor(col2);
//				x = x + rad / 2;
//				y = y + rad / 2;
//				w = w - unit * i;
//				h = h - unit * i;
//				System.out.println("Coordinates: " + x + " " + y + " " + w + " " + h);
//				g.fillOval(x, y, w, h);
////				g.fillOval(125, 125, 240, 240);
//			}

//			g.fillOval(10 + 48 * i, 30 + 48 * i, 48 * i, 48 * i);
//		}
	}
}

