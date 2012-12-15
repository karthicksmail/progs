import javax.swing.*;
import java.awt.*;

public class UserDetailsForm {
	public static void main(String[] args) {
		UserDetailsForm udf = new UserDetailsForm();
		udf.dispForm();
	}

	public void dispForm() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel lblFirstName = new JLabel("First Name:");
		JTextField txtFirstName = new JTextField(20);

		panel.add(lblFirstName);
		panel.add(txtFirstName);
		
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
