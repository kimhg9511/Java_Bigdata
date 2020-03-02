package chap05;

public class House {
	int price;
	String dong;
	int size;
	String kind;

	public House() {
		this(100,"상계동",32,"아파트");
		//new house(100,"상계동",32,"아파트");와 구분되는 점을 기억해둘 것.
	}
	public House(int price) {
		this(price,"상계동",32,"아파트");
	}
	public House(int price, String dong) {
		this(price,dong,32,"아파트");
	}
	public House(int price, String dong, int size) {
		this(price,dong,size,"아파트");
	}
	public House(int price, String dong, int size, String kind) {
		this.price = price;
		this.dong = dong;
		this.size = size;
		this.kind = kind;
	}
}
