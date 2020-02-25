package chap03;

public class FlowTest20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int outer=1;outer<=3;outer++){
			for(int inner=1;inner<=3;inner++) {
				System.out.printf("outer= %s, inner= %s /",outer,inner);
			}
			System.out.println("");
		}
		//5x5로 25까지 출력
		for(int i=0;i<5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.printf(" %2d ",5*i+j);
			}
			System.out.println("");
		}
		//세모만들기
		for(int i=1;i<=10;i++){
			if(i<=5) {
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
			}
			else {
				for(int j=1;j<=10-i;j++)
					System.out.print(j);
			}
			System.out.println("");
		}
		//별로 사각형 만들기
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//별로 삼각형 만들기
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//정삼각형만들기
		for(int i=1;i<=10;i++) {
			if(i<=5) {
				for(int j=1;j<=5-i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i*2-1;j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
			else {
				for(int j=1;j<=i-5;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(10-i)*2-1;j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		//주사위 두 눈의 합이 6이 되는 경우의 수 출력
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.printf("(%d, %d)",i,j);
				}
			}
			System.out.println("");
		}
		//연립방정식 2x+4y=10의 해(0<=x<=10,0<=y<=10)
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if((2*x)+(4*y) == 10)
					System.out.printf("(%d, %d)",x,y);
			}
		}
		System.out.println("");
		// 1~100 2,3,5,7의 배수를 제외한 수를 한 행에 10개씩 출력하는 프로그램
		int count=0;

		for(int i=1;i<=100;i++) {
			if(!(i%2==0 || i%3==0 || i%5==0 || i%7==0)) {
				System.out.printf("%2d ",i);
				count++;
				//System.out.println(count);
			}
			if(count%10 == 0 && count != 0) {
				System.out.println("");
				count = 0;
			}
		}

	}
}






