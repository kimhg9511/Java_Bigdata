package chap09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorEx01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
		}
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}		
	}
}
