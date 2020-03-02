package chap05;

public class Person {
	int age;
	String name;
	int height;
	int weight;
	public Person() {
		
	}
	public Person(int age) {
		this.age = age;
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Person(int age, String name, int height, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}
