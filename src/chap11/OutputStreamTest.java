package chap11;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {
/**
 * OutputStreamWriter byte => 문자형
 * @param args
 */
	public static void main(String[] args) {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			fos = new FileOutputStream(path + "\\stream.txt");
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			bw.write("OutputStreamWriter 한글 테스트");
			bw.newLine();
			bw.write("OutputStreamWriter 한글 테스트2");
			bw.newLine();
			bw.write("OutputStreamWriter 한글 테스트3");
			bw.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();		//close() 순서를 혼동하면 오류
				osw.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
