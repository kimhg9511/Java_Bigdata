package chap05;

public class OverloadingTest {
/**
 * Overloading 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boiler bo = new Boiler();
		System.out.println("현재 온도 : " + bo.temp); //0
		bo.tempUp();
		System.out.println("tempUp() : " + bo.temp); //1		
		bo.tempUp(20);
		System.out.println("tempUp(amount) : " + bo.temp); //21
		
	}

}
