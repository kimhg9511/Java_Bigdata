package chap02;
public class StringCastTest {

	public static void main(String[] args) {
		String name = "Ja"+"va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		
//		int a = 7;
//		int b = 7;
//		int c = a+b;
//		String s1 = c + "";
//		String s2 = "" + a;
//		String s3 = s2 + b;		
//		System.out.println(s1);
//		System.out.println(s3);
		System.out.println(7 + 7 + "");//14
		System.out.println("" + 7 + 7);//77

	}

}
