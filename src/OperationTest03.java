
public class OperationTest03 {
	/**
	 * 비교 연산자 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		boolean result = false;

		// > 
		result = x > y; 
		System.out.println("x >  y = " + result);
		// <
		result = x < y; 
		System.out.println("x <  y = " + result);
		// >=
		result = x >= y; 
		System.out.println("x >= y = " + result);
		// <=
		result = x <= y; 
		System.out.println("x <= y = " + result);
		// ==
		result = x == y; 
		System.out.println("x == y = " + result);
		// !=
		result = x != y; 
		System.out.println("x != y = " + result);
	}

}
