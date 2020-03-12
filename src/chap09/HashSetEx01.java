package chap09;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = { "1", new Integer(2), 2, "2", "3", "3", "4", "4", "4" };
		Set set = new HashSet();

		for(Object obj : objArr) {
			set.add(obj);
		}
		System.out.println(set);
	}

}
