package starcraft;

public class Tank extends GroundUnit implements Fightable, Repairable {
	void changeMode() {
	}

	public Tank() {
		super(150);
		hitPoint = MAX_HP;
	}

	@Override
	public void move(int x, int y) { // TODO Auto-generated method stub
		System.out.printf("[%s,%s] Tank Move!!%n", x, y);
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Tank";
	}
}