package chap11;

import java.io.*;

public class InputStreamTest {
/**
 * InputStream 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var_byte = -1;
		System.out.println("문자 입력>>");
		do {
			try {
				var_byte = System.in.read();
			} catch (IOException io) {
				io.printStackTrace();
			}
			if(var_byte == 10 || var_byte == 13) {
				break;
			}else {
				System.out.println("읽은 값 : " + (char)var_byte);
			}
		}while(true);
		System.out.println("end");
	}
	
}
