package chap13;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class SwingLayout extends JFrame {
	JButton button1 = new JButton("Button1");
	JButton button2 = new JButton("Button2");
	JButton button3 = new JButton("Button3");
	JButton button4 = new JButton("Button4");
	JButton button5 = new JButton("Button5");

	Panel panel1 = new Panel();
	Panel panel2 = new Panel();

	// 가로배치
	void flowLayout() {
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
		panel1.add(button5);
	}

	// 가로x세로의 격자 모양 배치
	void gridLayout() {
		panel1.setLayout(new GridLayout(2, 2));
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel1.add(button4);
	}

	// 중앙 - 동서남북 배치
	void borderLayout() {
		panel1.setLayout(new BorderLayout());
		panel1.add(button1, BorderLayout.NORTH);
		panel1.add(button2, BorderLayout.SOUTH);
		panel1.add(button3, BorderLayout.EAST);
		panel1.add(button4, BorderLayout.WEST);
		panel1.add(button5, BorderLayout.CENTER);
	}

	// 카드
	void cardLayout() {
		final CardLayout card = new CardLayout();
		setLayout(card);
		panel1.add(button1);
		panel1.add(button2);
		panel1.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		add("panel1", panel1);
		add("panel2", panel2);
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "panel2");
			}
		});
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(getContentPane(), "panel1");
			}
		});
	}

	// 생성자
	public SwingLayout() {
		super("Layout Showcase");
		getContentPane().add(panel1);
		// flowLayout();
		// gridLayout();
		borderLayout();
		//cardLayout();
		setDefaultCloseOperation(3);
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingLayout app = new SwingLayout();
	}

}
