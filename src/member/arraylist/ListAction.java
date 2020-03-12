//ListAction.java
package member.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class ListAction implements Action {//2.회원 정보 보기

    @Override
    public void execute(Scanner sc) {
        //MemberVO[] members = MemberMain.members; ***
    	ArrayList<MemberVO> members = MemberMain.members;
        //출력할 데이터가 있는지?
       // if (members.length >= 1) { ***
    	if(members.size()>=1) {
            printMember(members);        //데이터를 출력하는 메서드
        } else {
            System.out.println("member not found");
        }
    }
	//private void printMember(memberVO[] members) { ***
    private void printMember(ArrayList<MemberVO> members) {
        for (MemberVO member : members) {
            String name = member.getName();
            int age = member.getAge();
            String email = member.getEmail();
            String nation = member.getNation();
            String tel = member.getTel();

            String s = "name : %s, age : %s, email : %s";
            s = s + ", nation : %s, tel : %s %n";

            System.out.printf(s, name, age, email, nation, tel);
        }
    }

}