//ListAction.java
package member.database;

import java.util.Scanner;
import java.util.ArrayList;

public class ListAction implements Action {// 2.회원 정보 보기

	@Override
	public void execute(Scanner sc) {
		ArrayList<MemberVO> members = MemberMain.dao.getMemberList();
		if (members.size() >= 1) {
			printMember(members); // 데이터를 출력하는 메서드
		} else {
			System.out.println("member not found");
		}
	}

	private void printMember(ArrayList<MemberVO> members) {
		for (MemberVO member : members) {
			int idx = member.getIdx();
			String name = member.getName();
			int age = member.getAge();
			String email = member.getEmail();
			String nation = member.getNation();
			String tel = member.getTel();
			String date = member.getRegdate();
			String s = "idx : %s, name : %s, age : %s, email : %s";
			s = s + ", nation : %s, tel : %s, date : %s%n";

			System.out.printf(s, idx, name, age, email, nation, tel, date);
		}
	}

}