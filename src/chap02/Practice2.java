package chap02;
import java.util.Scanner;

public class Practice2 {
/**
 * 십의 자리 아래 숫자를 모두 버림하는 연산을 제작하시오.
 * ex) 400~499 -> 400, 111 -> 100
 * @param args
 */
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버림할 수를 입력하세요>");
		int num = sc.nextInt();
		
		System.out.println("버림할 자릿수를 입력하세요>");
		int n = sc.nextInt();
		
		int rs =num / (int)(Math.pow(10,n)) * (int)(Math.pow(10,n)) + 1;
		System.out.println(rs);
	}
}
