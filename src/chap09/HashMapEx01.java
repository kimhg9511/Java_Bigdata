package chap09;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		// System.out.println(map.get("asdf")); // asdf = 1234
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim();

			System.out.print("password : ");
			String password = s.nextLine().trim();

			if (!map.containsKey(id)) {
				System.out.println("존재하지 않는 id");
			} else {
				String mapPassword = map.get(id);
				if (!mapPassword.equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				} else {
					System.out.println("id 비밀번호 확인");
					break;
				}
			}
		}//while
	}//main

}//class
