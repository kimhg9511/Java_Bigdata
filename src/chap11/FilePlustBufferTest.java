package chap11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FilePlustBufferTest {
	/**
	 * 주소 정보 출력하기
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader bfr = null;
		StringTokenizer st = null;
		String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";
		try {
			fr = new FileReader(path + "\\address.txt");
			bfr = new BufferedReader(fr);

			String str = null;
			while ((str = bfr.readLine()) != null) {
				st = new StringTokenizer(str, ",");
				String s = "이름 : %s, 주소 : %s, 이메일 : %s, 전화번호 : %s %n";
				System.out.printf(s, st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
