//UpdateAction.java
package member.array;

import java.util.Scanner;

public class UpdateAction implements Action {    //4.회원 정보 수정
    MemberVO[] members = MemberMain.members;

    @Override
    public void execute(Scanner sc) {
        //수정할 객체의 이름을 입력받음
        System.out.println("수정할 이름을 넣어주세요");
        System.out.print("이름 : ");
        String name = sc.next();

        //입력받은 이름으로부터 객체를 찾는다.
        MemberVO member = getUpdateMember(name);
        if (member == null) {
            System.out.println("Member not found.. ");
        } else {
            updateMember(member, sc);
        }
    }

    private void updateMember(MemberVO member, Scanner sc) {
        //변경할 정보를 입력받는다.
        System.out.println("전화번호 : ");
        String tel = sc.next();
        System.out.println("국가 : ");
        String nation = sc.next();
        System.out.println("나이 : ");
        String age = sc.next();
        System.out.println("이메일 : ");
        String email = sc.next();
        //입력받은 정보에 따라 members[]의 값을 갱신
        //members[]배열의 객체 참조값을 받아왔으므로 setter()로 접근이 가능
        member.setAge(Integer.parseInt(age));
        member.setEmail(email);
        member.setNation(nation);
        member.setTel(tel);
    }

    private MemberVO getUpdateMember(String name) {
        // 수정할 멤버 확인
        MemberVO member = null;
        for (MemberVO tempMember : members) {
            if (tempMember.getName().equals(name)) {
                member = tempMember;
            }
        }
        return member;
    }

}