package starcraft;

public class Dropship extends AirUnit implements Movable, Repairable {
	public Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}
	void load() {
	}

	void unload() {
	}

	@Override
	public void move(int x, int y) { // TODO Auto-generated method stub
		System.out.printf("[%s,%s] Dropship Move!!%n", x, y);
	}
	@Override
	public String toString() {
		return "Dropship";
	}
}
