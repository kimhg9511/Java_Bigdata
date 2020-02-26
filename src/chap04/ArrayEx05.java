package chap04;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 총합, 평균
		int[] scores = {100, 88, 100, 100, 90};
		int sum = 0;
		double avg = 0.0;
//		for(int i=0;i<score.length;i++) {
//			sum += score[i];
//		}
		for(int score : scores) {
			sum += score;
		}
		
		avg = (double)sum/scores.length;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
	}

}
