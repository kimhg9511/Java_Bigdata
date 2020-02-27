package chap04;

public class ArrayEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = {
				{100, 90, 80}
				, {10, 20, 30}
				, {40, 50, 60}
				, {70, 50, 40}
				, {80, 90, 10}
		};
		//과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int korAvg = 0;
		int engAvg = 0;
		int mathAvg = 0;
		int sum = 0;
		int avg = 0;
		double allAvg = 0;
		System.out.printf("번호\t 국어\t 영어\t 수학\t 총점\t 평균%n");
		System.out.println("============================================");
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				sum += score[i][j];
			}
			avg = sum/score[i].length;
			System.out.printf("%s\t %3d\t %3d\t %3d\t %3d\t %3d%n",(i+1),score[i][0],score[i][1],score[i][2],sum,avg);
			sum = 0;
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
		}
		korAvg = korTotal/score.length;
		engAvg = engTotal/score.length;
		mathAvg = mathTotal/score.length;
		allAvg = (double)(korAvg + engAvg + mathAvg)/3;
		System.out.printf("과목총점\t %3d\t %3d\t %3d\t 반평균\t %.2f%n",korTotal,engTotal,mathTotal,allAvg);
		System.out.printf("과목평균\t %3d\t %3d\t %3d%n",korAvg,engAvg,mathAvg);
	}

}
