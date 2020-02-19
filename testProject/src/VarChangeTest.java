package javabasic;

public class VarChangeTest {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0;
		//String sX = x + "";
		//String pt = "x:" + x + " y:" + y;
		//System.out.println(pt);
		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x:" + x + " y:" + y);
	}

}
