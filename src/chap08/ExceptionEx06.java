package chap08;

public class ExceptionEx06 {
	public void exceptionMethod() throws Exception{
		throw new Exception();
	}
	public static void main(String[] args) {
		ExceptionEx06 et6 = new ExceptionEx06();
		try {
			et6.exceptionMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
