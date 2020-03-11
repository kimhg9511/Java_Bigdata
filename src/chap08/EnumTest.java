package chap08;

class Student1{
	SchoolType school;
	public Student1(SchoolType school) {
		this.school = school;
	}
}
enum SchoolType{
	ELEMENTARY, MIDDLE, HIGH, UNIVERSITY
}
public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 st1 = new Student1(SchoolType.ELEMENTARY);
		Student1 st2 = new Student1(SchoolType.MIDDLE);
		
		System.out.println("st1.school = " + st1.school);
		if(st1.school == SchoolType.ELEMENTARY) {
			System.out.println("초등학생");
		}
		System.out.println();
	}

}
