package chap03;
import java.util.*;

public class FlowTest9 {
	/**
	 * 가위(1)바위(2)보(3) 게임
	 * 0 < Math.random() <= 1
	 * 1-1	0
	 * 2-2	0
	 * 3-3	0	비김
	 * 1-2	-1
	 * 2-3	-1
	 * 3-1	2	짐
	 * 2-1	1
	 * 3-2	1
	 * 1-3	-2	이김
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0, com=0;
		String sUser = "", sCom ="";
		String match = "";
		Scanner sc = new Scanner(System.in);
		
		//사용자 입력
		System.out.print("가위바위보 !! >>");
		sUser = sc.next();
		user = userStoI(sUser); //사용자가 입력한 문자를 수로 변환
		
		//컴퓨터가 랜덤한 가위,바위,보 값을 설정
		//com = (int)Math.round(Math.random() * 3 + 0.5);
		com = (int)(Math.random()*3) + 1; 
		sCom = comItoS(com); //컴퓨터의 값을 문자열로 변환
		
		match = matching(user,com); //승부 결정
		
		//출력
		System.out.printf("나 : %s(%s) / 컴퓨터 : %s(%s) , %s %n", sUser,user, sCom,com, match);
	}
	static int userStoI(String sUser) {//사용자가 입력한 문자를 수로 변환
		int user = 0;
		switch(sUser) {
		case "가위":
			user = 1;
			break;
		case "바위":
			user = 2;
			break;
		case "보":
			user = 3;
			break;
		default:
			System.out.println("잘못된 값입니다.");
			System.exit(0);
		}
		return user;
	}
	static String comItoS(int com) {//컴퓨터의 값을 문자열로 변환
		String sCom = "";
		switch(com) {
		case 1:
			sCom = "가위";
			break;
		case 2:
			sCom = "바위";
			break;
		case 3:
			sCom = "보";
			break;
		}
		return sCom;
	}
	static String matching(int user,int com) { //승부 결정
		String match = "";
		if(user-com == 0) {
			match = "비겼습니다.";
		} else if(user-com == 1 || user-com == -2) {
			match = "이겼습니다.";
		} else if(user-com == -1 || user-com == 2) {
			match = "졌습니다.";
		} else { // 있을 수 없는 에러
			System.out.println("???????");
		}
		return match;
	}
}
