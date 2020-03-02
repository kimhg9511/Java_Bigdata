package chap06;

class OverridingParent{
	int money = 20;
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent{
	String money = "20원";
	@Override
	void parentMethod() {
		System.out.println("overriding method");
	}
}

public class OverridingTest {
/**
 * 변수 재정의 테스트
 * @param args
 */
	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
		
		oc.money = "30원";
		System.out.println("oc.money = " + oc.money);
		
	}

}
