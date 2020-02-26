package chap04;

public class ArrayEx06 {
/**
 * 최대값(int max), 최소값(int min) 구하기
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {79, 88, 91, 33, 100, 55, 95};
		int max = 0;
		int min = 0;
		
		for(int score : scores) {
			if(max == 0) max = scores[0];
			if(min == 0) min = scores[0];
			if(max < score) {
				max = score;
			}
			if(min > score) {
				min = score;
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
