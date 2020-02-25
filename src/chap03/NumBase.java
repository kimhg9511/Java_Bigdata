package chap03;

import java.util.Scanner;

public class NumBase {
	/**
	 * 숫자야구 프로그램
	 * 000~999 사이의 숫자를 컴퓨터가 랜덤으로 지정
	 * 자릿수와 숫자가 맞으면 1s, 숫자는 맞지만 자릿수가 틀리면 1b 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 0;
		int comNum = 0;
		int cNum100 = 0;
		int cNum10 = 0;
		int cNum1 = 0;

		Scanner sc = new Scanner(System.in);
		// 컴퓨터가 랜덤한 수를 생성
		do{
			comNum = (int)(Math.random()*1000);
			int temp = comNum;
			cNum1 = temp % 10;
			temp /= 10;
			cNum10 = temp % 10;
			temp /= 10;
			cNum100 = temp % 10;
			temp /= 10;
			//System.out.println(comNum);
		} while(cNum100 == cNum10 || cNum100 == cNum1 || cNum10 == cNum1);
		//유저가 수를 맞추는 과정
		while(comNum != userNum) {
			//유저에게서 숫자를 입력받음
			System.out.print("숫자를 입력하세요>>");
			userNum = sc.nextInt();
			//sc.nextLine();
			//유저가 입력한 숫자를 자릿수별로 가공
			int temp = userNum;
			int sCount = 0;
			int bCount = 0;
			
			int uNum1 = temp % 10;
			temp /= 10;
			int uNum10 = temp % 10;
			temp /= 10;
			int uNum100 = temp % 10;
			temp /= 10;
			//자릿수와 숫자를 카운트
			if(cNum100 == uNum100) {sCount++;}
			if(cNum10 == uNum10) {sCount++;}
			if(cNum1 == uNum1) {sCount++;}
			if(cNum100 == uNum10 || cNum100 == uNum1) {bCount++;}
			if(cNum10 == uNum100 || cNum10 == uNum1) {bCount++;}
			if(cNum1 == uNum100 || cNum1 == uNum10) {bCount++;}
			//정답판별
			if(sCount==0&&bCount==0) {System.out.println("OUT!");}
			else if(sCount == 3) {break;}
			else {System.out.printf("%dS : %dB%n",sCount,bCount);}
			sCount = 0;
			bCount = 0;
		}
		//컴퓨터가 수를 맞춤
		
		System.out.println("정답! 답은 " + comNum + "입니다.");
	}
}
