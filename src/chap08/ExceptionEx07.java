package chap08;

class ArgsException extends Exception {
	private int argsNumber;

	public int getArgsNumber() {
		return argsNumber;
	}

	public void setArgsNumber(int argsNumber) {
		this.argsNumber = argsNumber;
	}

	public ArgsException(String msg) {
		super(msg);
	}
}

public class ExceptionEx07 {
	/**
	 * 사용자 정의 예외 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			if(args.length != 2) {
				ArgsException ae = new ArgsException("인자를 두 개 입력해야 합니다.");
				ae.setArgsNumber(args.length);
				throw ae;
			} else {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			}
		} catch (ArgsException e) {
			System.out.println(e.getMessage());
			System.out.println("당신이 입력한 인자 수는 " + e.getArgsNumber() + "개 입니다.");
		}
	}
}
