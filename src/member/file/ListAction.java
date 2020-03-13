//ListAction.java
package member.file;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListAction extends fileIO implements Action { // 2.회원 정보 보기

	@Override
	public void execute(Scanner sc) {
		try {
			fr = new FileReader(path + "\\member.txt");		//member.txt 파일을 읽어와라.
			bfr = new BufferedReader(fr);					//읽어온 파일을 버퍼 단위로 읽겠다
			
			String msg = null;								//임시로 저장할 문자열이 담길 공간
			//버퍼에 파일의 한 줄을 꺼내 저장하고 그 값이 null이 아니라면
			while((msg = bfr.readLine()) != null) {			
					System.out.println(msg);				//한 줄 그대로 출력
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bfr.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}