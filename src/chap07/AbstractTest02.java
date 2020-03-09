package chap07;
abstract class AbClass1{
	abstract void abMethod1();
}
abstract class AbClass2 extends AbClass1{
	abstract void abMethod2();
}

class GeneralClass extends AbClass2{
	void abMethod1() {
		System.out.println("abMethod1");
	};
	
	@Override
	void abMethod2() {
		// TODO Auto-generated method stub
		System.out.println("abMethod2");
	}
}
public class AbstractTest02 {
/**
 * 추상 클래스 사이의 상속 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneralClass gc = new GeneralClass();
		gc.abMethod1();
		gc.abMethod2();
	}

}
