//DeleteAction.java
package member.database;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction implements Action {	// 3.회원 삭제

	@Override
	public void execute(Scanner sc) {
		ArrayList<MemberVO> members = MemberMain.dao.getMemberList();
		
		System.out.println("삭제할 회원의 인덱스를 넣으시오");
		System.out.println("인덱스 : ");
		
		int idx = sc.nextInt();
		
		for(MemberVO member : members) {
			if(member.getIdx() == idx) {
				MemberMain.dao.deleteMember(idx);
				System.out.println("Delete complete.");
				return;
			}
		}
		System.out.println("삭제할 회원이 없습니다.");
	}
}
