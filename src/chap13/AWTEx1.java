package chap13;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class AWTEx1 extends Frame {

	public static void main(String[] args) {
		// Frame : 독립창 만들기
		Frame f = new Frame("Hello, World!");
		f.setLayout(new FlowLayout());
		Label label = new Label("Welcom to AWT");
		f.add(label);
		f.setSize(500, 500);
		f.setVisible(true);
		//f.addWindowListener(new WindowCloseHandler());
	}
	
}

//class WindowCloseHandler extends WindowAdapter{
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}
//}
