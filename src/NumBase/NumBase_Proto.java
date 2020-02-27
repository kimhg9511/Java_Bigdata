package NumBase;

public class NumBase_Proto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*take1. 값을 고정한 채 처리 먼저 구현*/
		//com
		int com1 = 9;
		int com2 = 3;
		int com3 = 4;
		//user(Scanner)
		int user1 = 3;			// com: 9	3	4
		int user2 = 5;			// user:3	
		int user3 = 4;			// S : 1 B : 1 O : 1
		//S, B, O
		int strike=0, ball=0, out=0;
		//판별
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
		//출력
		System.out.printf("%sS %sB %sO",strike,ball,out);
	}

}
