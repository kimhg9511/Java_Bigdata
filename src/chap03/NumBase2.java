package chap03;

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
		int userNum = 0;
		int comNum = 0;
		int[] cNum = new int[3];
		int[] uNum = new int[3];
		Scanner sc = new Scanner(System.in);
		// 컴퓨터가 랜덤한 수를 생성
		do{
			comNum = (int)(Math.random()*1000);
			ntoDigit(comNum,cNum);
			//System.out.println(comNum);
		} while(cNum[2] == cNum[1] || cNum[2] == cNum[0] || cNum[1] == cNum[0] || comNum < 100);
		
		//유저가 수를 맞추는 과정
		while(comNum != userNum) {
			//유저에게서 숫자를 입력받음
			System.out.print("숫자를 입력하세요>>");
			userNum = sc.nextInt();
			//sc.nextLine();
			//유저가 입력한 숫자를 자릿수별로 가공
			ntoDigit(userNum,uNum);
			
			//S, B 판별
			int sCount = 0;
			int bCount = 0;
			sCount = judgeS(uNum,cNum);
			bCount = judgeB(uNum,cNum);
			
			//정답판별
			if(sCount==0&&bCount==0) {System.out.println("OUT!");}
			else if(sCount == 3) {break;}
			else {System.out.printf("%dS : %dB%n",sCount,bCount);}
			sCount = 0;
			bCount = 0;
		}
		System.out.println("정답! 답은 " + comNum + "입니다.");
	}
	static int judgeB(int uNum[],int cNum[]) {
		int bCount = 0;
		//자릿수와 숫자를 카운트
		if(cNum[2] == uNum[1] || cNum[2] == uNum[0]) {bCount++;}
		if(cNum[1] == uNum[0] || cNum[1] == uNum[2]) {bCount++;}
		if(cNum[0] == uNum[1] || cNum[0] == uNum[2]) {bCount++;}
		//System.out.println("B : " + bCount);
		return bCount;
	}
	static int judgeS(int uNum[],int cNum[]) {
		int sCount = 0;
		//자릿수와 숫자를 카운트
		if(cNum[2] == uNum[2]) {sCount++;}
		if(cNum[1] == uNum[1]) {sCount++;}
		if(cNum[0] == uNum[0]) {sCount++;}
		//System.out.println("S : " + sCount);
		return sCount;
	}
	static void ntoDigit(int num,int[] temp) {
		int j=0;
		for(int i=num;num!=0;num/=10) {
			temp[j] = num % 10;
			//System.out.println(temp[j]);
			j++;
		}
	}
	static void comSol(int num) {
		
	}
}

