package chap03;

import java.util.Scanner;

public class GugudanTest01 {
	/**
	 * 구구단
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan = 0;
		Scanner sc = new Scanner(System.in);
			System.out.print("보고싶은 단의 수를 입력하세요.(0: 전부)>>");
			if(sc.hasNextInt()) {
				dan = sc.nextInt();
			}
		if(dan == 0) { // 전부 출력
			//구분선
			for(int i=0;i<95;i++)
				System.out.print("=");
			System.out.println("");
			for(int i=2;i<=9;i++) {
				System.out.print(i + "단                 ");
			}
			System.out.println("");
			//구분선
			for(int i=0;i<95;i++)
				System.out.print("=");
			System.out.println("");
			//구구단
			for(int i=1;i<=9;i++) {
				for(int j=2;j<=9;j++) {
					System.out.printf("%d x %d = %2d  ",j, i, i*j);
				}
				System.out.println("");
			}
			//구분선
			for(int i=0;i<95;i++)
				System.out.print("=");
			System.out.println("");
		}
		else { //원하는 단만 출력
			//구분선
			for(int i=0;i<10;i++)
				System.out.print("=");
			System.out.println("");
			//구구단
			for(int i=1;i<=9;i++) {
				System.out.printf("%d x %d = %2d%n",dan, i, dan*i);
			}
			//구분선
			for(int i=0;i<10;i++)
				System.out.print("=");
			System.out.println("");
		}
	}
}
