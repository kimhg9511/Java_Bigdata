package chap08;

class Student3 {
	String name;
	int number;

	public Student3(String name, int number) {
		this.name = name;
		this.number = number;
	}
	@Override
	public boolean equals(Object obj) {
		Student3 st = null;
		boolean b = false;
		if(obj instanceof Student3) {
			st = (Student3)obj;
		}
		b = (st != null && st.name.equals(name) && st.number == number);
		return b;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		Student3 st1 = new Student3("오정원",1);
		Student3 st2 = new Student3("오정원",1);
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));
		
	}

}
