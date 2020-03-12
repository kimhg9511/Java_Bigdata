package chap09;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx02 {

	public static void main(String[] args) {
		ArrayList<String> original = new ArrayList<String>();
		ArrayList<String> copy1 = new ArrayList<String>();
		ArrayList<String> copy2 = new ArrayList<String>();
		
		for(int i=0;i<10;i++) original.add(i+"");
		
		Iterator<String> it = original.iterator();
		
		while(it.hasNext()) copy1.add(it.next());
	
		System.out.println("= Original에서 copy1로 복사(copy) = ");
		System.out.println("original : " + original);
		System.out.println("copy1 : " + copy1);
		
		//다시 사용하기 위해서는 iterator를 재정의해야한다.
		it = original.iterator();
		
		while(it.hasNext()) copy2.add(it.next());
		
		System.out.println("= Original에서 copy1로 복사(copy) = ");		
		System.out.println("copy2 : " + copy2);
	}
}
