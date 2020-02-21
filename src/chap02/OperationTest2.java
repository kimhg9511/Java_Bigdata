package chap02;
import java.util.*;

public class OperationTest2 {
	/**
	 * 총점, 평균 구하기 예제
	 * argument 주석 코드부분//
	 * Run Configuration > OperationTest2 > Arguments에 값을 입력하면 return값이 나온다.
	 * 비즈니스 파트를 먼저 설계하고 값의 처리 등을 후순위로 처리한다.
	 * @param args
	 */
	public static void main(String[] args) {
		int total = 0;
		int avg = 0;
//		String args1 = args[0];
//		String args2 = args[1];
//		String args3 = args[2];
//		int kor = Integer.parseInt(args1);
//		int mat = Integer.parseInt(args2);
//		int eng = Integer.parseInt(args3);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력해주세요.>");
		
		int kor = scanner.nextInt();
		int mat = scanner.nextInt();
		int eng = scanner.nextInt();

		total = kor + mat + eng;
		avg = total / 3;
		
		System.out.println("total = " +  total);
		System.out.println("avg = " + avg);
		
		scanner.close();
	}
}
