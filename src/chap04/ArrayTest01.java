package chap04;

import java.util.Arrays;

public class ArrayTest01 {
	/**
	 * 배열 선언, 배열 객체 생성 테스트
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		//배열 선언
		//		//int[] score = new int[5]; //초기값없이 초기화
		//		int[] score = /*new int[]*/{50, 60, 70, 80, 90};
		//		for(int i=0;i<score.length;i++) {
		//			score[i] = i;
		//		}
		//		for(int i=0;i<score.length;i++) {
		//			System.out.println(score[i]);
		//		}
		//		//		System.out.println(score[1]);
		//		//		System.out.println(score[2]);
		//		//		System.out.println(score[3]);
		//		//		System.out.println(score[4]);		
		//		//		System.out.println(score.length);
		//		//문자열의 길이는 메소드, 배열의 길이는 속성-
		//		Arrays.toString(score);
		//		String s = "abcdef";
		//		System.out.println(s.length());
		//배열 선언
		int ages[];
		String names[] = {"홍길동","이순신","세종대왕"};
		//배열 객체 생성
		ages = new int[3];
		//		names = new String[3];
		//초기화
		for(int i=0;i<3;i++) {
			ages[i] = i+1;
		}
		//값 출력
		for(int i=0;i<ages.length;i++) {
			System.out.printf("ages[%s] = %s%n",i,ages[i]);
			System.out.printf("names[%s] = %s%n",i,names[i]);
		}
	}
}

