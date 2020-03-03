package chap06;
//Class Sawon
class Sawon{
	String name;
	String dept;
	int salary;
	
	public Sawon(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	String displayInfo() {
		return "이름 : " + name + " 부서 : " + dept + " 연봉 : " + salary ; 
	}
}

//Class Sales
class Sales extends Sawon{
	int commition;

	public Sales(String name, String dept, int salary, int commition) {
		//super() used.
		super(name, dept, salary);
		this.commition = commition;
	}
	@Override
	String displayInfo() {
		return super.displayInfo() + ", 수당 : " + commition;
	}
}

//Test Field
public class SuperConstructorTest {

	public static void main(String[] args) {
		Sales sales = new Sales("오정원", "영업부", 100000000, 70000000);
		System.out.println(sales.displayInfo());
	}

}
