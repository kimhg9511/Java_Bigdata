package chap07;

final class Singleton{
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		
		return s;
	}
	
	public void getName() {
		System.out.println("My name is Singleton");
	}
}

public class SingletonTest{
		public static void main(String[] args) {
			Singleton s1 = Singleton.getInstance();
			Singleton s2 = Singleton.getInstance();
			Singleton s3 = Singleton.getInstance();
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			s1.getName();
		}
}