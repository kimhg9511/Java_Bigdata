//DeleteAction.java
package member.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction implements Action {	// 3.회원 삭제

	@Override
	public void execute(Scanner sc) {
		//MemberVO[] members = MemberMain.members; ***
		ArrayList<MemberVO> members = MemberMain.members;
		//MemberVO member; ***
		
		System.out.println("삭제할 회원의 이름을 넣으시오");
		System.out.println("이름 : ");
		
		String name = sc.next();
		for(MemberVO member : members) {
			if(member.getName().equals(name)) {
				members.remove(member);
				System.out.println("Delete complete.");
				return;
			}
		}
		System.out.println("삭제할 회원이 없습니다.");
//		for(int i=0;i<members.size();i++) {
//			member = members.get(i);
//			if(member.getName().equals(name)) {
//				members.remove(i);
//			}
//		}
		//deleteMember(name);
	}

//	private void deleteMember(String name) {	
//		int deleteIndex = -1; // 회원이 없을 때의 값
//		MemberVO[] members = MemberMain.members;
//		MemberVO[] temp = null;
//		int count = 0;
//		for (MemberVO member : members) {
//			if (member.getName().equals(name)) {
//				deleteIndex = count;
//				break;
//			}
//			count++;
//		}
//		if (deleteIndex == -1) {
//			System.out.println("member name not found..");
//			return;
//		}
//		temp = new MemberVO[members.length - 1];
//		for (int i = 0; i < members.length; i++) {
//			if (i == deleteIndex) {
//				continue;
//			} else if (i > deleteIndex) {
//				temp[i - 1] = members[i];
//			} else {
//				temp[i] = members[i];
//			}
//
//		}
//		MemberMain.members = temp;
//	}
}
