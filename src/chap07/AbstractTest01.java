package chap07;

abstract class AbstractClass {
	// 변수 선언
	int age;

	// 구현된 메소드
	void generalMethod() {
		System.out.println("일반 메소드");
	}

	// 추상 메소드
	abstract void abstractMethod();
}

class AbstractChildClass extends AbstractClass {
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("추상 메소드 구현");
	}
}

public class AbstractTest01 {
	/**
	 * 추상 클래스로 객체 생성하기
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 추상 클래스로 객체 생성
		// AbstractClass ac = new AbstractClass(); ( X )

		// 자식 클래스로 객체 생성
		AbstractChildClass acc = new AbstractChildClass();
		acc.abstractMethod();
		System.out.println(acc.age);
		acc.generalMethod();
	}
}
