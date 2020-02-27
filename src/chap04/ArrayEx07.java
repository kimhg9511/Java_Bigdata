package chap04;

import java.util.Arrays;

public class ArrayEx07 {
	/**
	 * 섞기 & 로또번호 만들기
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
		boolean isOverlap = false;
		int randomDigit=0,tmp=0,myNum=0,myNumDigit=0,count=0;
		//array initialize(type : int size : 10)
		int[] numArr = new int[10];	
		for(int i=0;i<numArr.length;i++) numArr[i] = i;
		//type : int size : 45
		int[] lottonum = new int[45];
		for(int i=0;i<45;i++) lottonum[i] = i+1;
		int[][] myLottoNum6 = new int[6][6];
		int[] preLotto = {8, 19, 20, 21, 33, 39};
		
		//STEP.5 Upgrade(전 주 번호를 1장당 1개씩 추가, 전체 구매수 6장, 번호 5자리 뽑고 + 1자리(1번요구사항)추가)
		while(true) {
			for(int i=0;i<1000;i++) {
				randomDigit = (int)(Math.random()*45);
				myNumDigit = (int)(Math.random()*6);
				tmp = lottonum[0];
				lottonum[0] = lottonum[randomDigit];
				lottonum[randomDigit] = tmp;
			}
			myNum = preLotto[myNumDigit];
			for(int i=0;i<myLottoNum6[count].length-1;i++) {
				if(myNum == lottonum[i]) {isOverlap = true; break;}
				myLottoNum6[count][i] = lottonum[i];
			}
			//check overlaped number(previous lotto number) vs (random lotto number) 
			if(isOverlap) {
				isOverlap = false;
				continue;
			}
			myLottoNum6[count][5] = myNum;
			count++;
			System.out.printf("Lotto Number[%s]: %s%n",count,Arrays.toString(myLottoNum6[count-1]));
			//print 
			if(count == 5) break;
		}	
	}
}
//System.out.println(Arrays.toString(myLottonum5)); wrong!! address value return..
/*previous code
//		
//		STEP.1 shuffle logic creation
//		//random value create(target digit)	
//		int randomDigit = (int)(Math.random()*10);
//		System.out.println(randomDigit);
//		//values in array shuffle 1 time.
//		int tmp = numArr[0];
//		numArr[0] = numArr[randomDigit];
//		numArr[randomDigit] = tmp;
//		//check shuffled value
//		System.out.println(Arrays.toString(numArr));
//		//STEP.2 repeatation 
//		for(int i=0;i<100;i++) {
//			randomDigit = (int)(Math.random()*10);
//			tmp = numArr[0];
//			numArr[0] = numArr[randomDigit];
//			numArr[randomDigit] = tmp;
//			
//		}
//		//check shuffled value
//		System.out.println(Arrays.toString(numArr));
//		//STEP.3 lotto number creation 	
//		int[] myLottonum = new int[6];
//		for(int i=0;i<100;i++) {
//			randomDigit = (int)(Math.random()*45);
//			tmp = lottonum[0];
//			lottonum[0] = lottonum[randomDigit];
//			lottonum[randomDigit] = tmp;
//		}
//		for(int i=0;i<6;i++) {
//			myLottonum[i] = lottonum[i];
//		}
//		//print 
//		System.out.println("Shuffled Lotto : " + Arrays.toString(lottonum));
//		System.out.println("Lotto Number : " + Arrays.toString(myLottonum));
//		//STEP.4 lotto number creation 5 times.	
//		for(int j=0;j<5;j++) {
//			for(int i=0;i<100;i++) {
//				randomDigit = (int)(Math.random()*45);
//				tmp = lottonum[0];
//				lottonum[0] = lottonum[randomDigit];
//				lottonum[randomDigit] = tmp;
//			}
//			for(int i=0;i<6;i++) {
//				myLottonum5[j][i] = lottonum[i];
//			}
//			//print 
//			System.out.printf("Lotto Number[%s]: %s%n",(j+1),Arrays.toString(myLottonum5[j]));
//		}
*/