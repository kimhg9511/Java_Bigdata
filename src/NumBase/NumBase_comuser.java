package NumBase;
import java.util.*;

public class NumBase_comuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*take1. 값을 고정한 채 처리 먼저 구현*/
		/*take2. 컴퓨터는 랜덤한 값으로, 유저는 값을 입력받게 변경*/
		//com
		int com1=0;
		int com2=0;
		int com3=0;
		/*random var.1
		do {
		com1 = (int)(Math.random()*9)+1;
		com2 = (int)(Math.random()*9)+1;
		com3 = (int)(Math.random()*9)+1;
		} while(isCheck(com1,com2,com3));
		*/	
		//random var.2
		while(true) {
			com1 = (int)(Math.random()*9)+1;
			com2 = (int)(Math.random()*9)+1;
			com3 = (int)(Math.random()*9)+1;
			
			if(!(com1 == com2 || com2 == com3 || com3 == com1)) break;
		}
		//user(Scanner)
		Scanner sc = new Scanner(System.in);
		int user1 = 0;
		int user2 = 0;
		int user3 = 0;
		//S, B, O
		int strike=0, ball=0, out=0;
		//실행 테스트를 위하여 컴퓨터값 출력
		System.out.printf("%s %s %s %n",com1,com2,com3);
		//판별
		while(strike != 3) {
			System.out.println("첫번째 숫자를 입력하세요.(0~9)>> ");
			user1 = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요.(0~9)>> ");
			user2 = sc.nextInt();
			System.out.println("세번째 숫자를 입력하세요.(0~9)>> ");
			user3 = sc.nextInt();
			/*
			if(isCheck(user1,user2,user3)) {
				System.out.println("잘못된 값입니다.");
				continue;
			}
			*/
			if(com1 == user1) strike++;
			else if(com1 == user2) ball++;
			else if(com1 == user3) ball++;
			else out++;
			if(com2 == user2) strike++;
			else if(com2 == user1) ball++;
			else if(com2 == user3) ball++;
			else out++;
			if(com3 == user3) strike++;
			else if(com3 == user1) ball++;
			else if(com3 == user2) ball++;
			else out++;
			if(strike == 3) break;
			//출력
			System.out.printf("%sS %sB %sO%n",strike,ball,out);
			strike=0; ball=0; out=0;
		}
		System.out.println("정답!");
	}
	//return true = 중복이 있다. return false = 중복이 없다.
	static boolean isCheck(int n1,int n2,int n3) {
		boolean check = n1==n2 || n2==n3 || n3==n1 ;
		return check;
	}

}
