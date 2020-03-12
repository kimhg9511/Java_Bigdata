package chap08;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	/**
	 * StringTokenizer 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source1 = "111-111|강원도|춘천시|퇴계동";
		StringTokenizer st1 = new StringTokenizer(source1, ",");
		if (st1.hasMoreTokens()) {
			String zip = st1.nextToken();
			String dou = st1.nextToken();
			String si = st1.nextToken();
			String dong = st1.nextToken();
			// 출력
			System.out.println("우편번호 : " + zip);
			System.out.println("도 : " + dou);
			System.out.println("시 : " + si);
			System.out.println("동 : " + dong);
		}


	}
}
