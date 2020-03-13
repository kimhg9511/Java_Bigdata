package member.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SearchAction extends fileIO implements Action{

	@Override
	public void execute(Scanner sc) {
		System.out.print("찾으실 이름 : ");
		String name = sc.next();
		try {
			fr = new FileReader(path + "\\member.txt");			// 파일을 읽어와라
			bfr = new BufferedReader(fr);						// 파일을 읽을 때 버퍼로 읽겠다
			String msg = null;
			while((msg = bfr.readLine()) != null) {				// 1줄을 읽었을때 null이 아닐 때까지
				st = new StringTokenizer(msg,",");				// 1줄을 ","를 기준으로 나누겠다.								// 
				String fName = st.nextToken().split("=")[1];	
				if(fName.equals(name)) {						// 첫번째(이름)의 값이 찾는 이름이면
					System.out.println(msg);					// 해당 줄을 출력
				}
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
