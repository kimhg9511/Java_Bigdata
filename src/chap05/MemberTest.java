package chap05;

import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Member Class Test
		Member member = new Member("홍길동", 180, 60, "조선");
		//System.out.println("tostring = " + member.toString());
		String name = member.getName();
		System.out.println(name);
		member.setName("임꺽정");
		System.out.println(member.getName());
		member.setHeight(-100);
		// SearchService Class Test
		Member searchResult = new Member();
		Scanner sc = new Scanner(System.in);
		SearchService search = new SearchService();

		do {
			System.out.print("검색할 이름을 입력하세요>>");
			String sName = sc.nextLine();
			searchResult = search.searchMember(sName);
		} while (!searchResult.isSearch());
		search.printInfo(searchResult);
		sc.close();
		
	}
}
