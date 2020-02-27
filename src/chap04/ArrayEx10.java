package chap04;

import java.util.Arrays;

public class ArrayEx10 {
	public static void main(String args[]) {
		boolean isChanged = true;
		int count = 0;
		int[] numArr = new int[10];
		for(int j=0;j<numArr.length;j++) {
			numArr[j] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(numArr));
		while(true) {
			isChanged = false;
			for(int i=0;i<numArr.length-1-count;i++) {
				if(numArr[i] > numArr[i+1]) {
					int temp = numArr[i];
					numArr[i] = numArr[i+1];
					numArr[i+1] = temp;
					isChanged = true;
				}
			}
			if(!isChanged)break;
			System.out.println(Arrays.toString(numArr));
			count++;
		}
	}
}
