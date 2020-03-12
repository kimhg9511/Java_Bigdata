package chap08;

import java.util.Random;

public class RandomTest {
/**
 * Random 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random(5);
		Random r2 = new Random(5);
		
		for(int i=0;i<9;i++) {
			System.out.println(r1.nextInt());
			System.out.println(r2.nextInt());
		}
	}

}
