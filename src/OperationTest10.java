
public class OperationTest10 {
/**
 * 복합 연산자 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		// +=
		x += 5;
		System.out.println("x += 5 =" + x);
		x += 3.1;
		System.out.println("x += 3.1 = " + x);

		// *=
		x *= 2;
		System.out.println("x *= 2 = " + x);
		
		// /=
		x /= 2;
		System.out.println("x /= 2 = " + x);
		
		// -=
		x -= 5;
		System.out.println("x -= 5 = " + x);
		
		// %=
		x %= 2;
		System.out.println("x %= 2 = " + x);
		
	}

}
