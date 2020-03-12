//AddAction.java
package member.array;

import java.util.Scanner;

public class AddAction implements Action{    // 1.회원 가입

    @Override
    public void execute(Scanner sc) {
        //회원에게서 정보를 입력받음.
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

        //MemberVO의 객체에 값을 전달하여 메서드 호출
        MemberVO member = new MemberVO(Integer.parseInt(age), name, tel, email, nation);
        addMember(member);        
    }
    //값을 추가하기 위해 배열을 늘리는 로직
    private void addMember(MemberVO member) {
        int index = MemberMain.members.length;
        //추가되는 값이 함께 저장될 배열을 선언, 초기화
        MemberVO[] temp = new MemberVO[index+1]; 
        //기존에 있던 members[]의 값과 추가되는 값을 모두 temp[]에 저장
        for(int i=0;i<MemberMain.members.length;i++) {
            temp[i] = MemberMain.members[i];
        }
        temp[index] = member;
        //값이 추가된 배열의 참조값을 members[]에 덮어씌움
        MemberMain.members = temp;
    }
}