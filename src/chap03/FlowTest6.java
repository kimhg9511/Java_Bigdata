package chap03;

public class FlowTest6 {
/**
 * 직급별 연봉 출력
 * switch문 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String job = "사장";
		int salary = 0;
		switch(job) {
		case "사원":
			salary = 20000000;
			break;
		case "대리":
			salary = 35000000;
			break;
		case "과장":
			salary = 50000000;
			break;
		case "부장":
			salary = 80000000;
			break;
		default:
			salary = 100;
			break;
		}
		System.out.println("당신의 연봉은 " + salary + "원 입니다.");
	}

}
