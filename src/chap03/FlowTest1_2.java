package chap03;

public class FlowTest1_2 {
	/**
	 * if ~ else문 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 10;
		if (n > 10) {
			System.out.println("n은 10 이상 입니다.");
		} else if (n == 10) {
			System.out.println("n은 10입니다.");
		} else {
			System.out.println("n은 10 미만 입니다.");
		}
		//조건문중 하나라도 실행되면 해당 위치로 실행 포인트 이동
	}
}
