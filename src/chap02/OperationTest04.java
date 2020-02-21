package chap02;

public class OperationTest04 {
	/**
	 * 논리 연산자 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int y = 200;
		boolean result = false;

		//&&
		result = x < y && y >= 200; 
		System.out.println("x < y && y >= 200 = " + result);

		result = x < y && y < 200; 
		System.out.println("x < y && y <  200 = " + result);

		result = x > y && y++ > 200; 
		System.out.println("x < y && y >= 200 = " + result);
		System.out.println("y = " + y);

		//||
		result = x < y || y >= 200; 
		System.out.println("x < y || y >= 200 = " + result);

		result = x < y || y < 200; 
		System.out.println("x < y || y <  200 = " + result);

		result = x > y || y++ > 200; 
		System.out.println("x < y || y >= 200 = " + result);
		System.out.println("y = " + y);

		// !
		result = !(x > y);
		System.out.println("!(x > y) = " + result);
	}

}
