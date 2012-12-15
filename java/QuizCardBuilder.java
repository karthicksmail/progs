import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizCardBuilder {
	private JFrame frame;
	private JTextArea question, answer;

	public void showDialog() {
		frame = new JFrame("Quiz Card Builder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menubar = prepareMenu();
		frame.setJMenuBar(menubar);

		question = new JTextArea(6, 20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		JScrollPane qpane = new JScrollPane(question);
		qpane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		qpane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		answer = new JTextArea(6, 20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		JScrollPane apane = new JScrollPane(answer);
		apane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		apane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JButton submitButton = new JButton("Submit");

		JPanel panel = new JPanel();
		panel.add(question);
		panel.add(answer);
		panel.add(submitButton);

		frame.getContentPane().add(BorderLayout.CENTER, panel);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	private JMenuBar prepareMenu() {
		JMenuBar menubar = new JMenuBar();

		JMenu filemenu = new JMenu("File");
		filemenu.setMnemonic(KeyEvent.VK_F);
		menubar.add(filemenu);

		JMenuItem newmenu = new JMenuItem("New", KeyEvent.VK_N);
		newmenu.setAccelerator(
						KeyStroke.getKeyStroke(KeyEvent.VK_N, 
						ActionEvent.CTRL_MASK));
		filemenu.add(newmenu);

		JMenuItem submitmenu = new JMenuItem("Submit", KeyEvent.VK_S);
		submitmenu.setAccelerator(
						KeyStroke.getKeyStroke(KeyEvent.VK_S, 
						ActionEvent.CTRL_MASK));
		filemenu.add(submitmenu);

		JMenuItem closemenu = new JMenuItem("Close", KeyEvent.VK_C);
		filemenu.add(closemenu);

		return menubar;
	}

	public class NewMenuListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
		}
	}

	public static void main(String[] args) {
		QuizCardBuilder qcb = new QuizCardBuilder();
		qcb.showDialog();
	}
}
