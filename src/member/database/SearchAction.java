package member.database;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAction implements Action{

	@Override
	public void execute(Scanner sc) {		
		System.out.println("찾을 이름을 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		ArrayList<MemberVO> members = MemberMain.dao.searchMember(name);
		printMember(members);
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
