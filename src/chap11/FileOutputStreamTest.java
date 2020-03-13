package chap11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	/**
	 * FileOutputStream 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileOutputStream fo = null;
		FileInputStream fIn = null;
		String msg = "FileOutputStream Test!\n";
		byte[] byteArray = msg.getBytes();
		int var_read = -1;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			//arg(2) // 이미 파일이 있다면 내용을 덧붙일 것인가? true=yes : false=no(전부 지우고 새 내용만)
			fo = new FileOutputStream(path + "\\output.txt",true); 
			fo.write(byteArray);
			fIn = new FileInputStream(path + "\\output.txt");
			while((var_read = fIn.read()) != -1) {
				System.out.println((char)var_read);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fo.close();
				fIn.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
