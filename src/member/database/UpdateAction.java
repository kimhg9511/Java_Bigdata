package member.database;

import java.util.Scanner;

public class UpdateAction implements Action {	// 4.회원 정보 수정
	MemberVO member = new MemberVO();
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 인덱스를 넣어주세요");
		System.out.print("인덱스 : ");
		int idx = sc.nextInt();

		member = MemberMain.dao.searchMemberIdx(idx);
		if (member == null) {
			System.out.println("Member not found.. ");
		} else {
			System.out.println();
			System.out.print("나이 : ");
			member.setAge(sc.nextInt());
			System.out.print("이메일 : ");
			member.setEmail(sc.next());
			System.out.print("전화번호 : ");
			member.setTel(sc.next());
			System.out.print("국가 : ");
			member.setNation(sc.next());
			
			MemberMain.dao.updateMember(member);
		}
	}

}
