package chap03;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = new int[3];
		ntoDigit(123,temp);
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
	}
	static void ntoDigit(int num,int[] temp) {
		int j=0;
		for(int i=num;num!=0;num/=10) {
			temp[j] = num % 10;
			System.out.println(temp[j]);
			j++;
		}
	}
}
