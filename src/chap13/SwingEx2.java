package chap13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SwingEx2 extends JFrame implements ActionListener {

	int index = 0;
	String[] msgs = { "첫번째 문장", "두번째 문장", "세번째 문장", };
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton(msgs[0]);

	public SwingEx2() {
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.CENTER);

		button1.addActionListener(this);
		button2.addActionListener(this);

		setDefaultCloseOperation(3);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingEx2 app = new SwingEx2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == button1) {
			index--;
		} else if (obj == button2) {
			index++;
		}
		if (index > 2) {
			index = 0;
		} else if (index < 0) {
			index = 2;
		}
		button3.setText(msgs[index]);
	}
}
