package chap09;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// ArrayList //
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(new Integer(5));// 0
		list1.add(new Integer(4));// 1
		list1.add(new Integer(2));// 2
		list1.add(new Integer(0));// 3
		list1.add(new Integer(1));// 4
		list1.add(new Integer(3));// 5
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1);
		print(list2);
		
		//void 메서드 - 바뀐 값이 알아서 저장됨
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1);
		print(list2);
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list2);
		
		list2.set(3, "AA");
		print(list2);
		System.out.println(list1.retainAll(list2));
		
		for(int i=list2.size()-1; i>=0;i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list2);
	}//main
	static void print(ArrayList list) {
		System.out.println("list : " + list);
	}
}//class
