package chap06;

public class CastingTest {
	/**
	 * Casting 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		President president1 = new President();
		president1.setSalary(500);

		// president1 객체를 상위 클래스인 Person 클래스 레퍼런스 변수에 참조시킴
		// president1 객체가 자동으로 Person 타입으로 UpCasting 되면서 참조됨
		Person person1 = president1;

		person1.showSleepStyle(); // 오버라이딩된 메소드는 자식의 것이 사용된다.

		// person1 레퍼런스 변수의 참조 값을 President 타입의 레퍼런스 변수에 할당함
		// 부모 클래스 타입의 참조 값을 자식 클래스 타입의 참조 변수에 할당하므로 명시적 캐스팅
		President president2 = (President) person1;
		System.out.println(president2.getSalary()); // 500 : casting 후에도 값은 사라지지 않는다.

		// Person 객체 생성
		Person person2 = new Person();

		// Person 객체를 President 타입의 레퍼런스 변수에 참조시킴 (X)
		// President president3 = (President)person2;

		// 같은 부모 클래스를 상속받는 클래스 타입끼리 캐스팅 (X)
		// Student student = (Student)president2;

		// instanceof
		if (person1 instanceof President) {
			President president3 = (President) person1;
			System.out.println("person1을 President 타입으로 캐스팅 성공");
		} else {
			System.out.println("person1을 캐스팅 할수 없다.");
		}
		if (person2 instanceof President) {
			President president4 = (President) person2;
			System.out.println("person2를 President 타입으로 캐스팅 성공");
		} else {
			System.out.println("person2를 캐스팅 할수 없다.");
		}
		
	}

}
