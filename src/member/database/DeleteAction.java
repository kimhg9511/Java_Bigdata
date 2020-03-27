//DeleteAction.java
package member.database;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction implements Action {	// 3.회원 삭제

	@Override
	public void execute(Scanner sc) {
		int isDelete = 0;
		ArrayList<MemberVO> members = MemberMain.dao.getMemberList();
		
		System.out.println("삭제할 회원의 인덱스를 넣으시오");
		System.out.print("인덱스 : ");
		int idx = sc.nextInt();
		
		for(MemberVO member : members) {
			if(member.getIdx() == idx) {
				isDelete = MemberMain.dao.deleteMember(idx);
			}
		}
		if(isDelete==0) System.out.println("삭제할 회원이 없습니다.");
		else System.out.println("Delete complete.");
	}
}
