package chap06;

class PersonInfo {
	void showSleepingType(Person person) {
		person.showSleepStyle();
	}
	void showSleepingType(Person[] persons) {
		for(Person person : persons) {
			person.showSleepStyle();
		}
	}
}

public class ParamPolyTest {
	/**
	 * Parameter 다형성 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PersonInfo pf = new PersonInfo();
		Person person = new Person();
		Employee employee = new Employee();
		Student student = new Student();
		President president = new President();
		
		pf.showSleepingType(person);
		pf.showSleepingType(employee);
		pf.showSleepingType(student);
		pf.showSleepingType(president);
		person = student;
		
		// Array
		Person[] pArray = new Person[3];
		pArray[0] = new Employee();
		pArray[1] = new Student();
		pArray[2] = new President();
		
		pf.showSleepingType(pArray);
	}

}
