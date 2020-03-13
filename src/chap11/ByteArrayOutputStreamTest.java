package chap11;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {
	/**
	 * ByteArrayOutputStream 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "ByteArrayOutputStream Test\n";
		ByteArrayOutputStream bao = null;
		try {
			bao = new ByteArrayOutputStream();
			bao.write(msg.getBytes());
			System.out.println("bao = " + bao);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bao.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
