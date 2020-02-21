package chap03;

import java.util.Scanner;

public class FlowTest5 {
/**
 * int kor,mat,eng
 * 성적(국,영,수)을 입력 받아 합격, 불합격 결정
 * 총점이 180점 이상 합격
 * 단 한 과목이라도 40점 미만이면 불합격
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=0,mat=0,eng=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요(국 영 수) : ");
		if (sc.hasNextInt()){
		kor = sc.nextInt();
		mat = sc.nextInt();
		eng = sc.nextInt();		
		}
		else {
			System.out.println("ERROR!");
			System.exit(0);
		}
		
		if(kor < 40 || mat < 40 || eng < 40 || kor+mat+eng < 180)
		System.out.println("불합격입니다.");
		else
		System.out.println("합격입니다.");
	}
	static boolean check(int sub1,int sub2,int sub3) {
		return sub1 < 40 || sub2 < 40 || sub3 < 40;
	}
}
