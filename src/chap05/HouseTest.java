package chap05;

public class HouseTest {
/**
 * this() 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house1 = new House();
		System.out.printf("house1.price = %s, house1.size = %s, house1.dong = %s, house1.kind = %s%n",
				house1.price, house1.size, house1.dong, house1.kind);
		House house2 = new House(300);
		System.out.printf("house2.price = %s, house2.size = %s, house2.dong = %s, house2.kind = %s%n",
				house2.price, house2.size, house2.dong, house2.kind);
		House house3 = new House(300,"서초동");
		System.out.printf("house3.price = %s, house3.size = %s, house3.dong = %s, house3.kind = %s%n",
				house3.price, house3.size, house3.dong, house3.kind);
		House house4 = new House(300,"서초동",40);
		System.out.printf("house4.price = %s, house4.size = %s, house4.dong = %s, house4.kind = %s%n",
				house4.price, house4.size, house4.dong, house4.kind);
		House house5 = new House(300,"서초동",40,"빌라");
		System.out.printf("house5.price = %s, house5.size = %s, house5.dong = %s, house5.kind = %s%n",
				house5.price, house5.size, house5.dong, house5.kind);
	}
	
}
