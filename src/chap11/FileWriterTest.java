package chap11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	/**
	 * FileWriter 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileWriter fw = null;
		String msg = "FileWriter 테스트!!\n";
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			fw = new FileWriter(path + "\\filewriter.txt",true);
			fw.write(msg);
			System.out.println("File write done.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
