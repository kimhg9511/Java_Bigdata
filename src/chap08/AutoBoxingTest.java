package chap08;

public class AutoBoxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.4 이하
		int var_int1 = 3;
		Integer intObj1 = new Integer(var_int1);
		
		// 1.5이상 (오토 박싱)
		intObj1 = var_int1;
		System.out.println("intObj1 = " + intObj1);
		
		// 1.4이하
		Integer intObj2 = new Integer("4");
		int var_int2 = intObj2.intValue();
		
		// 1.5이상 (오토 언박싱)
		var_int2 = intObj2;
		System.out.println("var_int2 = " + var_int2);
	}

}
