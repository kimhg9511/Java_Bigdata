package chap13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SwingEx3 extends JFrame {

	int index = 0;
	String[] msgs = { "첫번째 문장", "두번째 문장", "세번째 문장", };
	JButton button1 = new JButton("<<");
	JButton button2 = new JButton(">>");
	JButton button3 = new JButton(msgs[0]);

	public SwingEx3() {
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.CENTER);

//		button1.addActionListener(this);
//		button2.addActionListener(this);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				index = (--index+3)%3;
				button3.setText(msgs[index]);
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				index = ++index%3;
				button3.setText(msgs[index]);
			}
		});
		setDefaultCloseOperation(3);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingEx3 app = new SwingEx3();
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Object obj = e.getSource();
//		if (obj == button1) {
//			index--;
//		} else if (obj == button2) {
//			index++;
//		}
//		if (index > 2) {
//			index = 0;
//		} else if (index < 0) {
//			index = 2;
//		}
//		button3.setText(msgs[index]);
//	}
}
