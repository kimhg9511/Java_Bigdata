package chap13;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class AWTEx2 extends Frame{
	//addWindowListener()의 파라미터로 WindowHandler 객체 생성
	//WindowHandler 객체의 WindowAdapter에 정의된 창닫기 메소드 사용
	
	Button redBt, blueBt;
	public AWTEx2() {
		super("::AWTEx2::");
		setLayout(new FlowLayout());
		
		redBt = new Button("Red");
		blueBt = new Button("Blue");
		add(redBt);
		add(blueBt);
		
		//익명 클래스로 인터페이스를 구현하여 해야 할 일을 Listener에 알림
		redBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.RED);
			}
		});
		
		blueBt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.BLUE);
			}
		});
		
		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
	}
	
	
	public static void main(String[] args) {
		AWTEx2 awt = new AWTEx2();
		awt.setSize(300,300);
		awt.setVisible(true);
	}

}
