package chap03;
import java.util.*;

public class LoginTest {
/**
 * 로그인 처리
 * 아이디 : java 비밀번호 : java
 * 아이디 불일치 : 당신은 우리 회원이 아닙니다.
 * 비밀번호 불일치 : 비밀번호가 일치하지 않습니다.
 * 일치 : 로그인 되셨습니다.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("아이디와 패스워드를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("ID: ");
		String id = sc.nextLine();
		System.out.print("PW: ");
		String pw = sc.nextLine();
		
		if(!id.equals("java")) {
			System.out.println("당신은 우리 회원이 아닙니다.");
		} else if(!pw.equals("java")) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		} else {
			System.out.println("로그인 되셨습니다.");
		}
	}

}
