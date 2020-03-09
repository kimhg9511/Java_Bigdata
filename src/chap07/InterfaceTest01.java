package chap07;

interface Interface1 {
	int interVar = 10; // public static

	void interface1Method(); // abstract
}

class Interface1Impl implements Interface1 {
	public void interface1Method() {
		System.out.println("implements interface1Method");
	};
}

public class InterfaceTest01 {
	/**
	 * 인터페이스 구현 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1Impl in1Impl = new Interface1Impl();
		System.out.println("in1Impl.interVar = " + in1Impl.interVar);
		System.out.println("Interface1.interVar = " + Interface1.interVar);
		in1Impl.interface1Method();

	}
}
