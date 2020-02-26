package chap04;

import java.util.Scanner;

public class ArrayTest04 {
	/**
	 * 이름 찾기 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동", "전우치", "이도", "세종대왕", "이민지", "이나라", "이민수"};
		Scanner sc = new Scanner(System.in);
		int index = -1;
		while(true) {
			System.out.print("이름을 입력하세요.>>");
			String name = sc.nextLine();
			for(int i=0;i<names.length;i++) {		
				if(names[i].equals(name)) index = i;
			}
			if(index != -1) {
				System.out.printf("names배열 %s번째 방에서 이름 %s을(를) 찾았습니다.",index,name);
				break;
			}
			System.out.println("해당되는 이름을 찾지 못했습니다.");
		}
	}

}
