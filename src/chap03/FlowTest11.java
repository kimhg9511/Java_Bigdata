package chap03;

import java.util.Scanner;

public class FlowTest11 {
/**
 * 단순 for문 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		//0부터 50까지의 합
		for (int i=0;i<=50;i++) { //지역변수
			sum += i;
			//System.out.println("sum : " + sum);
		}
		System.out.println("0부터 50까지의 합은 " + sum + "입니다.");
		sum = 0;
//		//0부터 50까지의 홀수
//		for (int i=1;i<=50;i=i+2) {
//			System.out.println(i);
//		}
		//0부터 2씩 증가하는 50까지의 합
		for(int i=0;i<=50;i+=2) {
			sum += i;
		}
		System.out.println("0부터 50까지의 짝수의 합은 " + sum + "입니다.");
		sum = 0; 
		//50부터 1씩 감소하는 수의 합
		for (int i=50;i>0;i--) {
			sum += i;
		}
		System.out.println("50부터 0까지의 합은 " + sum + "입니다.");
		sum =0;
		//입력받은 정수부터 1까지의 합
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 더할 마지막 수를 입력하세요 >>");
		if(sc.hasNextInt())
			num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			sum += i;
		}
		System.out.println(num + "까지의 합은 " + sum + " 입니다.");
		sum = 0;
		//조건문을 사용한 짝수의 합
		for(int i=0;i<=50;i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("50까지의 짝수의 합은 " + sum + "입니다.");
		sum = 0;
		//조건을 만족하지 않는 수의 합
		for(int i=1;i<=20;i++) {
			if(!(i%2 == 0 || i%3 == 0)) {
				sum += i;
				//System.out.println(i);
			}
		}
		System.out.println("2의 배수와 3의 배수를 제외한 20까지의 합은 " + sum + "입니다.");
		sum = 0;
		//다중 for문
		for(int i=1;i<11;i++) {
			for(int j=1;j<i;j++)
				sum += j;
			System.out.println("break : " + sum);
		}
		System.out.println("result : " + sum);
		sum = 0;
		//
		boolean b = true;
		int a = 0;
		for(int i=1;b;i++) {
			if(i%2 == 0)
			sum += -i;
			else
			sum += i;
			
			if(sum >= 100) {
			b = false;
			a = i;
			}
		}
		System.out.println(a);
	}

}