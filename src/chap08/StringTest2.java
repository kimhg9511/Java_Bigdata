package chap08;

public class StringTest2 {
	public static void main(String[] args) {
		String source1 = "aaabbbcccdddfffaaadddfffddd";
		String source2 = "AAAbbbcccdddfffaaadddfffddd";

		System.out.println("원본 문자열 : " + source1);
		//charAt
		System.out.println("첫 번째 문자 : source1.charAt(0) : " + source1.charAt(0));
		System.out.println("네 번째 문자 : source1.charAt(0) : " + source1.charAt(3));
		//indexOf
		System.out.println("aaa 문자열의 인덱스 : source1.indexOf(\"aaa\") : " + source1.indexOf("aaa"));
		System.out.println("aaa 문자열의 뒤에서부터 검색한 위치 : source1.lastIndexOf(\"aaa\") : " + source1.lastIndexOf("aaa"));
		//substring
		System.out.println("3번 인덱스 문자부터 마지막 문자까지 출력 : source1.substring(3) : " + source1.substring(3));
		System.out.println("3번 인덱스 문자부터 5번 인덱스 문자까지 출력 : source1.substring(3, 6) : " + source1.substring(3, 6));
		System.out.println("aaa 문자열을 ggg로 변경 : source1.replace(\"aaa\",\"ggg\") : " + source1.replace("aaa", "ggg"));
		System.out.println("source1 문자열이 ddd문자열로 끝나는지 확인 : source1.endsWith(\"ddd\") : " + source1.endsWith("ddd"));
		System.out
				.println("source1 문자열이 aaa 문자열로 시작되는지 확인 : source1.startsWith(\"aaa\") : " + source1.startsWith("aaa"));
		System.out.println("source1 문자열에 aaa 문자열이 포함되어 있는지를 판단 : source1.contains(\"aaa\") " + source1.contains("aaa"));
		System.out.println("source1 문자열의 길이 : source1.length() : " + source1.length());
		System.out.println("source1과 source2의 비교 : source1.equals(source2) : " + source1.equals(source2));
		System.out.println("source1과 source2의 대소문자 무시한 비교 : source1.equalsIgnoreCase(source2) : "
				+ source1.equalsIgnoreCase(source2));
		System.out.println("source2 전체를 대문자로 변경 : source2.toUpperCase() : " + source2.toUpperCase());
		System.out.println("source2를 소문자로 변경 : source2.toLowerCase() : " + source2.toLowerCase());
		System.out.println();

		String source3 = "aaa,bbb,ccc";
		System.out.println("원본 문자열 : " + source3);
		String[] splitStr = source3.split(",");
		System.out.println("source3.split(\",\") 로 반환된 배열 요소");
		for (String str : splitStr) {
			System.out.println(str);
		}
		System.out.println();

		String source4 = " java ";
		System.out.println("원본 문자열 : '" + source4 + "'");
		System.out.println("공백 제거 후 source4 문자열 : source4.trim() : '" + source4.trim() + "'");
	}
}
