package chap03;

import java.util.Scanner;

public class FlowTest4 {
/**
 * 나이대 판별
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요>>");
		int gen = sc.nextInt();
		
		//if문의 실행 순서를 이용하여 판별
		if(gen < 10) {
			System.out.println("어린이");
		}
		else if(gen < 20) {
			System.out.println("10대");
		}
		else if(gen < 30) {
			System.out.println("20대");
		}
		else if(gen < 40) {
			System.out.println("30대");
		}
		else if(gen < 50) {
			System.out.println("40대");
		}
		else if(gen >= 50) {
			System.out.println("어르신");
		}
		else {
			System.out.println("나이값이 올바르지 않습니다.");
		}
		//명확한 식을 이용하여 판별
		if(gen/10 == 0) {
			System.out.println("어린이");
		}
		else if(gen/10 == 1) {
			System.out.println("10대");
		}
		else if(gen/10 == 2) {
			System.out.println("20대");
		}
		else if(gen/10 == 3) {
			System.out.println("30대");
		}
		else if(gen/10 == 4) {
			System.out.println("40대");
		}
		else if(gen/10 >= 5) {
			System.out.println("어르신");
		}
		else {
			System.out.println("나이값이 올바르지 않습니다.");
		}
	}

}
