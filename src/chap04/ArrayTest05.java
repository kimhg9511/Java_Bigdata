package chap04;

public class ArrayTest05 {
/**
 * 개선된,향상된 for문
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동", "전우치", "이도", "세종대왕", "이민지", "이나라", "이민수"};
		for(String name : names) {
			System.out.println(name);
		}
//		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]);
//		} //원래의 for문
	}

}
