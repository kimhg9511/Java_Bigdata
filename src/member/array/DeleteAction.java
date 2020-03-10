package member.array;

import java.util.Scanner;

public class DeleteAction implements Action {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 회원의 이름을 넣으시오");
		System.out.println("이름 : ");
		String name = sc.next();

		deleteMember(name);

	}

	private void deleteMember(String name) {
		int deleteIndex = -1; // 회원이 없을 때의 값
		MemberVO[] members = MemberMain.members;
		MemberVO[] temp = null;
		int count = 0;
		for (MemberVO member : members) {
			if (member.getName().equals(name)) {
				deleteIndex = count;
				break;
			}
			count++;
		}
		if (deleteIndex == -1) {
			System.out.println("member name not found..");
			return;
		}
		temp = new MemberVO[members.length - 1];
		for (int i = 0; i < members.length; i++) {
			if (i == deleteIndex) {
				continue;
			} else if (i > deleteIndex) {
				temp[i - 1] = members[i];
			} else {
				temp[i] = members[i];
			}

		}
		MemberMain.members = temp;

	}
}
