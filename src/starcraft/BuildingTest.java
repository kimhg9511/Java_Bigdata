package starcraft;

public class BuildingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academy academy = new Academy();
		Bunker bunker = new Bunker();
		Barrack barrack = new Barrack();
		Factory factory = new Factory();
		System.out.println("barrack HP : " + barrack.MAX_HP);
		barrack.move(100, 200);
		barrack.liftOff();
		barrack.move(100, 200);
		barrack.land();
		barrack.move(100, 200);
		
		System.out.println("factory HP : " + factory.MAX_HP);
		factory.move(100, 200);
		factory.liftOff();
		factory.move(100, 200);
		factory.land();
		factory.move(100, 200);
	}

}
