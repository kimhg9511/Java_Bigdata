package chap02;

public class Practice3 {
/**
 * 섭씨 C = 5/9 x (F - 32)
 * 소수점 반올림 3자리에서 한 값 구하기
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double F = 229;
		
		double tmp = (F - 32) / 9 * 5 ;
		double c = (double)Math.round(tmp * 100) / 100;
		System.out.printf("섭씨 C = %.02f", c);
	}

}
