package NumBase;

import java.util.Scanner;

public class NumBase2 {
	/**
	 * 숫자야구 프로그램
	 * 000~999 사이의 숫자를 컴퓨터가 랜덤으로 지정
	 * 자릿수와 숫자가 맞으면 1s, 숫자는 맞지만 자릿수가 틀리면 1b 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시각화
		int DIGIT1 = 0;
		int DIGIT10 = 1;
		int DIGIT100 = 2;
		int STRIKE = 0;
		int BALL = 1;
		//선언부
		int userNum = 0;
		int comNum = 0;
		int[] cNum = new int[3];
		int[] uNum = new int[3];
		Scanner sc = new Scanner(System.in);
		// 컴퓨터가 랜덤한 수를 생성
		do{
			comNum = (int)(Math.random()*1000);
			ntoDigit(comNum,cNum);
			System.out.println(comNum);
		} while(isOverlap(cNum[DIGIT1],cNum[DIGIT10],cNum[DIGIT100])|| comNum < 102); 
		// 각 자릿수가 중복되지 않는 수로 3자리 수를 생성(최소 102)

		//유저가 수를 맞추는 과정
		while(comNum != userNum) {
			//유저에게서 숫자를 입력받음
			System.out.print("숫자를 입력하세요>>");
			if(sc.hasNextInt()) {
				userNum = sc.nextInt();
				sc.nextLine();
			}
			else {
				System.out.println("숫자를 입력해 주세요.");
				sc.nextLine();
				continue;
			}
			//sc.nextLine();
			//유저가 입력한 숫자를 자릿수별로 가공
			ntoDigit(userNum,uNum);
			
			if(isOverlap(uNum[DIGIT1],uNum[DIGIT10],uNum[DIGIT100]) || comNum < 102) {
				System.out.println("올바르지 않은 숫자값입니다.");
				continue;
			}

			//S, B 판별
			int[] Counts = new int[2];
			Counts = judge(uNum,cNum);

			//정답판별
			if(Counts[STRIKE]==0&&Counts[BALL]==0) {System.out.println("OUT!");}
			else if(Counts[STRIKE] == 3) {break;}
			else {System.out.printf("%dS : %dB%n",Counts[STRIKE],Counts[BALL]);}
			Counts[STRIKE] = 0;
			Counts[BALL] = 0;
		}
		System.out.println("정답! 답은 " + comNum + "입니다.");
	}

	static void ntoDigit(int num,int[] temp) {
		int j=0;
		for(int i=num;num!=0;num/=10) {
			temp[j] = num % 10;
			//System.out.println(temp[j]);
			j++;
		}
	}

	static boolean isOverlap(int digit1,int digit10, int digit100) {
		return digit1 == digit10 || digit10 == digit100 || digit100 == digit1;
	}

	static int[] judge(int uNum[],int cNum[]) {
		int[] Counts = new int[2];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(cNum[i] == uNum[j]) {
					if(i==j) Counts[0]++;
					else Counts[1]++;
				}
			}
		}
		//System.out.printf("S : %s B : %s%n", Counts[0], Counts[1]);
		return Counts;
	}
}

