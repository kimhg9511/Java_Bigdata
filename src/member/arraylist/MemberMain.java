//MemberMain.java
package member.arraylist;

//import java.util.Arrays;	***
import java.util.Scanner;
import java.util.ArrayList;
public class MemberMain {
	
    //static MemberVO[] members;// 회원정보를 저장할 객체배열 members[] 생성 ***
	static ArrayList<MemberVO> members; // 회원정보를 저장할 ArrayList members 생성

    public static void main(String[] args) {
        //선언부
        MemberService ms = new MemberService();
        Scanner sc = new Scanner(System.in);
        //members = new MemberVO[0]; ***
        members = new ArrayList<MemberVO>();
        boolean isStop = false;
        //메뉴구현
        do {
            System.out.println("메뉴 선택");
            System.out.println("============");
            System.out.println("1.회원 가입");
            System.out.println("2.회원 목록 보기");
            System.out.println("3.회원 삭제");
            System.out.println("4.회원 정보 수정");
            System.out.println("5.종료");
            System.out.println("============");
            String command = sc.next();
            Action action = null;
            switch (command) {
            case "1":
                action = new AddAction();
                ms.process(action, sc);
                break;
            case "2":
                action = new ListAction();
                ms.process(action, sc);
                break;
            case "3":
                action = new DeleteAction();
                ms.process(action, sc);
                break;
            case "4":
                action = new UpdateAction();
                ms.process(action, sc);
                break;
            case "5":
                isStop = true;
                break;
            default:
                System.out.println("유효한 값을 입력하세요.");
            }
        } while (!isStop);
    }
}