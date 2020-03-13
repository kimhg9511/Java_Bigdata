package chap11;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
/**
 * FileReader 테스트
 * @param args
 */
	public static void main(String[] args) {
		FileReader fr = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			fr = new FileReader(path + "\\address.txt");
			int readChar = -1;
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
