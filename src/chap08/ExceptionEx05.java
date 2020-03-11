package chap08;

public class ExceptionEx05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("5-2");
		} catch (Exception e) {
			System.out.println("5-3");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println(6);
	}

}
