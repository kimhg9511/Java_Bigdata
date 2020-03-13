package chap11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReadAddress {
/**
 * 주소 정보 출력하기
 * @param args
 */
	public static void main(String[] args) {
		FileInputStream fIn = null;
		InputStreamReader isr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			fIn = new FileInputStream(path + "\\address.txt");
			isr = new InputStreamReader(fIn);
			bfr = new BufferedReader(isr);
			String msg = null;
			while((msg = bfr.readLine()) != null) {
				//System.out.println(msg);
				st = new StringTokenizer(msg,",");
				if(st.hasMoreTokens()) {
				String msg2 = "이름 : %s, 주소 : %s, 이메일 : %s, 전화번호 : %s %n";
				System.out.printf(msg2,st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken());
				}
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
