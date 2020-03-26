//AddAction.java
package member.database;

import java.util.Scanner;
//import java.util.ArrayList;

public class AddAction implements Action{
	
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
		
		MemberVO member = new MemberVO(Integer.parseInt(age), name, tel, email, nation);
		MemberMain.dao.insertMember(member);
	}
}
