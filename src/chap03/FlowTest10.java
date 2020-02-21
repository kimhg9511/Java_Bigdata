package chap03;
import java.util.*;

public class FlowTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regNo = "";
		char gender;
		String sGender = "";
		int iGender;
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요.>>");
		regNo = sc.nextLine();
		
		gender = regNo.charAt(7);
		
		//case 1. switch문 활용
		switch(gender) {
		case '1':case '3':
			System.out.println("남자입니다.");
			break;
		case '2':case '4':
			System.out.println("여자입니다.");
			break;
		default:
			System.out.println("잘못된 주민등록번호입니다.");
			break;
		}
		
		//case 2. if문 활용
		if(gender == '1' || gender == '3') {
			System.out.println("남자입니다.");
		} else if(gender == '2' || gender == '4') {
			System.out.println("여자입니다.");
		} else System.out.println("잘못된 주민등록번호입니다.");
		
		//char (-> String) -> int
		sGender += gender;
		iGender = Integer.parseInt(sGender);
		System.out.println(iGender);
	}
		
}
