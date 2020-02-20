
public class OperationTest07 {
/**
 * 비트 연산자 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		int y = 3;
		int result = 0;
		boolean bResult = false;
		/* 비트로 변경
		 * 8 : 00000000 00000000 00000000 00001000
		 * 3 : 00000000 00000000 00000000 00000011
		 */
		
		//&
		result = x & y;
		System.out.println("x & y = " + result);
		bResult = true & false;
		System.out.println("true & false = " + bResult);
		
		//|
		result = x | y;
		System.out.println("x | y = " + result);
		bResult = true | false;
		System.out.println("true | false = " + bResult);
		
		//^
		result = x ^ y;
		System.out.println("x ^ y = " + result);
		bResult = true ^ false;
		System.out.println("true ^ false = " + bResult);
	}

}
