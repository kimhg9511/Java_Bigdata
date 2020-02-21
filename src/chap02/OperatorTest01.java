package chap02;
public class OperatorTest01 {
	/**
	 * 산술 연산자 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		int result = 0;
		int var_int1 = 10;
		int var_int2 = 2;
		// + 연산 
		result = var_int1 + var_int2; 
		System.out.println("var_int1 + var_int2 = " + result);
		// - 연산 
		result = var_int1 - var_int2; 
		System.out.println("var_int1 - var_int2 = " + result);
		// * 연산 
		result = var_int1 * var_int2; 
		System.out.println("var_int1 * var_int2 = " + result);
		// / 연산 
		result = var_int1 / var_int2; 
		System.out.println("var_int1 / var_int2 = " + result);
		// % 연산
//		int rs = var_int1 / var_int2;
//		int rs2 = var_int1 - (var_int2 * rs);
//		System.out.println(rs2);
		result = var_int1 % var_int2; 
		System.out.println("var_int1 % var_int2 = " + result);
		
		//오버플로우
		int a = 1000000;
		int rs1 = a * a / a;
		int rs2 = a / a * a;
		System.out.printf("이 계산의 결과는 %s입니다. %n",rs1);
		System.out.printf("%s / %s * %s = %s %n",a,a,a,rs2);
		
		//소숫점 처리방식과 디버깅
		double pi = 3.141592;
//		pi = pi + 0.0005f;
//		double tmp = pi * 1000;
//		int iTmp = (int)tmp;
//		double shortPi = iTmp / 1000;
		double shortPi = Math.round(pi * 1000) / 1000; 
		System.out.println("shortPi : " + shortPi);
	}
}
