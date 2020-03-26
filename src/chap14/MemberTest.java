package chap14;

import java.util.ArrayList;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> members = dao.getMemberList();
		for(MemberVO member : members) {
			System.out.println(member.toString());
		}
		MemberVO getmem = dao.getMember(1);
		getmem = dao.searchMember("홍길동2");
		
		System.out.println(getmem);
		
	}

}
