package chap04;

public class ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int sum = 0;
		int[][] score = {
				{10,	20,		30},
				{40,	50},
				{70,	80,		90},
				{100,	110,	120,	130}
		};
		
		System.out.println(score[0][0]);	//10
		System.out.println(score[1][1]);	//50
		System.out.println(score);			//[[I@3fb6a447(2차원배열([[)의 int형 주소(I@)3fb6a447
		System.out.println(score[0]);		//[I@79b4d0f(1차원배열([)의 int형 주소(I@)79b4d0f
		System.out.println(score.length);	//4
		System.out.println(score[0].length);//3
		//String s = "[%s][%s]\t";
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%3s\t",score[i][j]);	
				sum += score[i][j];
			}
			System.out.println();
		}
		System.out.println("sum = " + sum);
	}
}

