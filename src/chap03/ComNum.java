package chap03;

import java.util.Scanner;

public class ComNum {
/**
 * 컴퓨터가 낸 랜덤 숫자 맞추기
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int userNum = 0;
		int count = 0;
		int comNum = (int)(Math.random()*100);
		
		while(!(comNum == userNum)) {
			System.out.print("컴퓨터의 수를 예측해보세요.>>");
			userNum = sc.nextInt();
			if(comNum > userNum) {
				System.out.println("그거보단 커요");
			} else if(comNum < userNum){
				System.out.println("그거보단 작아요");
			}
			count++;
		}
		System.out.println("맞췄습니다! 컴퓨터의 수는 " + comNum + "였습니다.(" + count + "번만에 성공)");
	}

}
