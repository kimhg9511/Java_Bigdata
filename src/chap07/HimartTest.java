package chap07;

import java.util.Vector;

class Himart {
	int price;
	int bonusPoint;

	public Himart(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10);
	}
}

class Tv extends Himart {
	public Tv() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Audio extends Himart {
	public Audio() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
}

class Computer extends Himart {
	public Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;

	//Himart[] item = new Himart[10];
	Vector item = new Vector();
	
	int i = 0;
	
	void buy(Himart p) {
		if(money<p.price) {
			System.out.println("돈없음.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"를 구입하셨습니다. 잔액 : " + money);
		//item[i++] = p;
		item.add(p);
	}
	
	void summary() {
		int sum = 0;
		int bSum = 0;
		String itemList = "";
//		for(Himart h : item) {
//			if(h == null) break;
//			sum += h.price;
//			bSum += h.bonusPoint;
//			itemList += h + " ";
//		}
		if(item.isEmpty()) {
			System.out.println("구입한 제품 없음");
			return;
		}
		for(int i=0;i<item.size();i++) {
			Himart p = (Himart)item.get(i);
			sum += p.price;
			bSum += p.bonusPoint;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("======SUMMARY======");
		System.out.println("물건합계 = " + sum);
		System.out.println("보너스포인트 = " + bSum);
		System.out.println("구매품목 = " + itemList);
	}
}

public class HimartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
//		System.out.println("현재 남은 돈 : " + b.money + "만원");
//		System.out.println("현재 보너스포인트 : " + b.bonusPoint + "포인트");
		b.summary();
	}

}
