//AddAction.java
package member.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddAction extends fileIO implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("==========");
		System.out.println("회원 정보 입력");
		System.out.println("==========");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		String age = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("국가: ");
		String nation = sc.next();
		System.out.print("전화번호: ");
		String tel = sc.next();

		MemberVO member = new MemberVO(name, Integer.parseInt(age), tel, email, nation);
		try {
			fw = new FileWriter(path + "\\member.txt", true);	// 값을 저장할(쓸) 파일 
			fw.write(member.toString());						// 파일에 입력
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
