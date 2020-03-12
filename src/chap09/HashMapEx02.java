package chap09;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Entry) it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}

		set = map.keySet();
		System.out.println("참가자 명단 : " + set);

		Collection<Integer> values = map.values();
		it = values.iterator();

		int total = 0;

		while (it.hasNext()) {
			int i = (Integer) it.next();
			total += i;
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float) total / set.size());
		System.out.println("최고 : " + Collections.max(values));
		System.out.println("최저 : " + Collections.min(values));
	}

}
