package chap03;

public class FlowTest2 {
	/** 
	 * 중첩 i f문
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 11;
		if (n > 0) {
			System.out.println("n은 양수입니다.");
			if (n%2 == 0) System.out.println("n은 짝수입니다.");
			else System.out.println("n은 홀수입니다."); 
		} else if (n == 0) {
			System.out.println("n은0입니다.");
		} else {
			System.out.println("n은 음수입니다.");
		}
	}
}
