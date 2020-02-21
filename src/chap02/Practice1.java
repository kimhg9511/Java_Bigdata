package chap02;
import java.util.Scanner;

public class Practice1 {
/**
 * 주민등록번호를 숫자로 저장하고자 한다
 * 주민등록번호 : regNo = ;
 * System.out.println(regNo);
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("주민등록번호를 입력하세요>");
		Scanner sc = new Scanner(System.in);
		int regNo = sc.nextInt();
		System.out.println(regNo);
	}

}
