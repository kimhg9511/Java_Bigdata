package chap03;

import java.util.Scanner;

public class CalcTest {
	/**
	 * Operation 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0;
		double num1 = 0,num2 = 0;
		String op = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("계산할 식을 입력하세요");
		if(sc.hasNextDouble()) {
			num1 = sc.nextDouble();
		}else {
			System.out.println("ERROR!");
			System.exit(0);
		}
		if(sc.hasNext()) {
			op = sc.next();
		}else {
			System.out.println("ERROR!");
			System.exit(0);
		}
		if(sc.hasNextDouble()) {
			num2 = sc.nextDouble();
		}else {
			System.out.println("ERROR!");
			System.exit(0);
		}

		if(op.equals("+")) {
			result = num1 + num2;
		}
		else if(op.equals("-")) {
			result = num1 - num2;
		}
		else if(op.equals("*")) {
			result = num1 * num2;
		}
		else if(op.equals("/")) {
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}else {
				result = num1 / num2;
			}
		}
		else if(op.equals("%")) {
			result = num1 % num2;
		} else {
			System.out.println("잘못된 계산식입니다.");
			System.exit(0);
		}
		System.out.printf("%.3f %s %.3f = %.3f 입니다.",num1,op,num2,result);
	}

}
