package chap11;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] datas = {10, 20, 30, 40};
		ByteArrayInputStream bai = new ByteArrayInputStream(datas);
		int var_readByte = -1;
		
		while((var_readByte = bai.read()) != -1) {
			System.out.println(var_readByte);
		}
	}

}
