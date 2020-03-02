package chap05;

import java.util.Arrays;

public class VariableArgument {
	/**
	 * Variable Argument Test
	 */
	void printInfo(String ...infos) {
		if(infos.length != 0) {
			//for(String a : infos) System.out.printf("%s ",a);
			System.out.println(Arrays.toString(infos));
			//System.out.println("");
		}
		else System.out.println("인자가 없습니다.");
	}
	public static void main(String[] args) {
		VariableArgument vt = new VariableArgument();
		System.out.print("인자 없이 : ");
		vt.printInfo();
		System.out.print("인자 하나 : ");
		vt.printInfo("aaa"); 
		System.out.print("인자 두개 : ");
		vt.printInfo("aaa","bbb");
		System.out.print("인자 세개 : ");
		vt.printInfo("aaa","bbb","ccc");
		
		System.out.println();
	}
}
