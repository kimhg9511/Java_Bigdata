package javabasic;
import java.util.*;

public class ScannerTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sInput = null;
		int iInput = 0;
		
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
	
		System.out.print("정수를 입력해주세요>");
		
		sInput = scanner.nextLine(); // 입력대기 상태에서 엔터 입력시 문자열 반환
		//sInput = scanner.next(); // 입력대기 상태에서 스페이스 입력시 문자열 반환
		//sInput = scanner.nextInt(); // 입력대기 상태에서 정수값 입력시 문자열 반환
		iInput = Integer.parseInt(sInput); //입력받은 문자열을 숫자로 변환
		
		System.out.println("iInput = " + iInput);
		scanner.close();
	}
}
