package chap03;

import java.util.Scanner;

public class FlowTest3 {
	/**
	 * 윤년 판별
	 * 판별식 : 400으로 나누어떨어지거나 / 4로 나누어떨어지고 100으로 나누어떨어지지 않을 때
	 * &&가 ||보다 우선순위가 높음
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요>>");
		int year = sc.nextInt();
		//case1. if문의 중첩을 이용하여 해결
		if (year%400 == 0) {
			System.out.println("case1: 윤년");
		}
		else if(year%4 == 0) {
			if(year%100 != 0) {
				System.out.println("case1: 윤년");
			}
			else {
				 System.out.println("case1: 윤년이 아니야");
			}
		} else {
			System.out.println("case1: 윤년이 아니야");
		}

		//case2. 논리 연산자를 이용하여 해결
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("case2: 윤년");
		}
		else {
			System.out.println("case2: 윤년이 아니야");
		}
	}

}
