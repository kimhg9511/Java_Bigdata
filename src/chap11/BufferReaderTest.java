package chap11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderTest {

	public static void main(String[] args) {
		BufferedReader bfr = null;
		InputStreamReader isr = null;
		FileInputStream fIn = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			fIn = new FileInputStream(path + "\\input.txt");	// 파일을 읽어온다.
			isr = new InputStreamReader(fIn);					// Reader 객체로 변환
			bfr = new BufferedReader(isr);						// 변환된 Reader 객체를 buffer에 저장
			String str = null;
			while((str = bfr.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fIn.close();
				isr.close();
				bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
