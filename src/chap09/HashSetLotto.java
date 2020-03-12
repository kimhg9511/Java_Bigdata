package chap09;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 5; i++) {
			
			while (set.size() < 6) {
				int num = (int) (Math.random() * 45) + 1;
				set.add(new Integer(num));
			}
			//정렬(Collections.sort)를 위하여 Set을 List로 변환
			LinkedList<Integer> list = new LinkedList<Integer>(set);
			Collections.sort(list);
			System.out.println(list);
			set.clear();
		}
		
	}

}
