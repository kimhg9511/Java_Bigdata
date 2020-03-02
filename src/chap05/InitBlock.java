package chap05;

public class InitBlock {
	int num;
	String str;
	
	static { // static block => 클래스 로딩 시 1회
		System.out.println("static 초기화 블록 실행");
	}

	{ // instance block => 생성자 호출 시 마다 실행
		System.out.println("instance 초기화 블록 실행");
	}
	
	public InitBlock() { //생성자 실행
		System.out.println("생성자 실행");
		num = 1;
		str = "abc";
	}
	
	public InitBlock(int num, String str) { // 생성자 실행
		System.out.println("생성자 실행");
		this.num = num;
		this.str = str;
	}
	public static void main(String[] args) {
		InitBlock ib1 = new InitBlock();
		InitBlock ib2 = new InitBlock();
		InitBlock ib3 = new InitBlock();
		System.out.println("main");
	}
}
