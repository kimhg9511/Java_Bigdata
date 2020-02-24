package chap03;

import java.util.Scanner;

public class Puzzle {
	public static void main(String[] args) {
		//선언부
		int dim = 0;
		Scanner sc = new Scanner(System.in);

		//마방진의 차수를 입력받음
		System.out.print("구하고자 하는 마방진의 차수를 입력하세요.>>");
		if(sc.hasNextInt()) {
			dim = sc.nextInt();
		}else {
			System.out.println("ERROR!");
			System.exit(0);
		}

		//마방진에 사용할 정사각형 배열 생성
		int n[][] = new int[dim][dim]; 
		int temp[][] = new int[dim][dim];

		//홀수 마방진 공식
		if(dim%2 == 1) { 
			n = getOddPuzzle(dim,0);
		}

		//4의 배수 마방진 공식
		else if(dim%4 == 0) {

			for(int i=0;i<dim;i++) {
				for(int j=0;j<dim;j++) {
					n[i][j] = dim*i + j + 1;
					temp[i][j] = dim*dim-(dim*i + j);
					if((j+1 > dim/2-dim/4 && j+1 <= dim/2+dim/4)&&(i+1<=dim/4 || i+1>dim/2+dim/4)) {
						n[i][j] = temp[i][j];
					} else if((i+1 > dim/2-dim/4 && i+1 <= dim/2+dim/4)&&(j+1<=dim/4 || j+1>dim/2+dim/4)) {
						n[i][j] = temp[i][j];
					}
				}
			}
		} 
		//6의 배수 마방진 공식
		else if(dim%4 == 2) {
			int[][] t1,t2,t3,t4 = new int[dim/2][dim/2];
			t1 = getOddPuzzle(dim/2,0);
			t4 = getOddPuzzle(dim/2,dim*dim/4);
			t2 = getOddPuzzle(dim/2,dim*dim/2);
			t3 = getOddPuzzle(dim/2,dim*dim/4*3);
			for(int i=0;i<dim;i++) {
				for(int j=0;j<dim;j++) {
					if(i<3 && j<3) {
						n[i][j] = t1[i][j];
						temp[i][j] = t1[i][j];	
					}
					else if(i<3 && j>=3) {
						n[i][j] = t2[i][j-3];
						temp[i][j] = t2[i][j-3];
					}
					else if(i>=3 && j<3) {
						n[i][j] = t3[i-3][j];
						temp[i][j] = t3[i-3][j];
						}
					else {
						n[i][j] = t4[i-3][j-3];
						temp[i][j] = t4[i-3][j-3];
					}
					if(i==(dim/2+1)/2-1) {
						
					}
				}
			}
			
		} else {
			System.out.println("구할 수 없는 차수입니다.");
			System.exit(0);
		}

		//결과를 화면에 출력
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				System.out.printf("%2d ",n[i][j]);
			}
			System.out.println(" ");
		}
	}
	static int[][] getOddPuzzle(int dim,int sNum){
		int[][] temp = new int[3][3];
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				temp[(dim-j+i*2)%dim][(dim+j-i+dim/2)%dim] = i*dim + j + 1 + sNum;
			}
		}
		return temp;
	}
}

//n[0][1]
//n[2][2]
//n[1][0]
//---------
//n[2][0]
//n[1][1]
//n[0][2]
//---------
//n[1][2]
//n[0][0]
//n[2][1]
//1씩감소/1씩증가
//[i%3+2][i%3]
