package chap03;

public class FlowTest24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		//1부터 50까지의 합 구하기

		while(i<=50) {
			sum += i;
			//System.out.println("sum : " + sum);
			i++;
		}
		System.out.println(sum);
		sum = 0;
		i = 1;

		//1부터 50까지의 합 구하기(2)
		while(true) {
			sum += i;
			i++;
			if(i > 50)break;
		}
		System.out.println(sum);
		//피보나치 수열의 10번째 숫자
		double n1 = 1;
		double n2 = 1;
		for(int i1=3;i1<=1000;i1++) {
			n2 = n2 + n1;
			n1 = n2 - n1;
			System.out.println("n2 : " + n2);
		}
		
	}
}