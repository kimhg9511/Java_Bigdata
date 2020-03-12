package chap08;

import java.util.Random;

public class MathTest {
	/**
	 * Math 클래스 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// range : 1~100
		int num = (int) (Math.random() * 100) + 1;
		
		Random r = new Random();
		
		for(int i=0;i<10;i++) {
			double dnum = r.nextDouble();
			System.out.println(dnum);
		}
	}
}
