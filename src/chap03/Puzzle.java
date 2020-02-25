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

		//홀수 마방진 공식 호출
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
		else if(dim%4 == 2 && dim > 2) {
			int[][] t1,t2,t3,t4 = new int[dim/2][dim/2];
			int left = (dim/2-1)/2;
			int right = left - 1;
			t1 = getOddPuzzle(dim/2,0);
			t4 = getOddPuzzle(dim/2,dim*dim/4);
			t2 = getOddPuzzle(dim/2,dim*dim/2);
			t3 = getOddPuzzle(dim/2,dim*dim/4*3);

			for(int i=0;i<dim;i++) {
				for(int j=0;j<dim;j++) {
					if(i<dim/2 && j<dim/2) {
						n[i][j] = t1[i][j];
					}
					else if(i<dim/2 && j>=dim/2) {
						n[i][j] = t2[i][j-dim/2];
					}
					else if(i>=dim/2 && j<dim/2) {
						n[i][j] = t3[i-dim/2][j];
					}
					else {
						n[i][j] = t4[i-dim/2][j-dim/2];
					}

				}

			}
			while(!(left==0&&right==0)) {
				if(left != 0) {
					for(int i=0;i<dim/2;i++) {
					n[i][left-1] = t3[i][left-1];
					n[i+dim/2][left-1] = t1[i][left-1];
					}
					left--;
				}
				if(right != 0) {
					for(int i=0;i<5;i++) {
					n[i][dim-right] = t4[i][dim/2-right];
					n[i+dim/2][dim-right] = t2[i][dim/2-right];
					}
					right--;
				}
			}


			n[dim/4][dim/4] = t3[dim/4][dim/4];
			n[dim/4][dim/4-1] = t1[dim/4][dim/4-1];
			n[dim/4+dim/2][dim/4] = t1[dim/4][dim/4];
			n[dim/4+dim/2][dim/4-1] = t3[dim/4][dim/4-1];
			
		} else {
			System.out.println("구할 수 없는 차수입니다.");
			System.exit(0);
		}

		//결과를 화면에 출력 
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				System.out.printf("%3d ",n[i][j]);
			}
			System.out.println("");
		}

	}
	//홀수마방진
	static int[][] getOddPuzzle(int dim,int sNum){
		int[][] temp = new int[dim][dim];
		for(int i=0;i<dim;i++) {
			for(int j=0;j<dim;j++) {
				temp[(dim-j+i*2)%dim][(dim+j-i+dim/2)%dim] = i*dim + j + 1 + sNum;
			}
		}
		return temp;
	}
}

