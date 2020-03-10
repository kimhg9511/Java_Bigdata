package starcraft;

public abstract class Unit {
	int x, y;
	final int MAX_HP;
	int hitPoint;
	public Unit() {
		MAX_HP = 0;
	}

	public Unit(int hp) {
		MAX_HP = hp;
	}

	void stop() {

	}
}

class GroundUnit extends Unit {
	public GroundUnit() {
		// TODO Auto-generated constructor stub
	}
	public GroundUnit(int hp) {
		super(hp);

	}
}

class AirUnit extends Unit {
	public AirUnit() {
		// TODO Auto-generated constructor stub
	}
	public AirUnit(int hp) {
		super(hp);

	}
}
