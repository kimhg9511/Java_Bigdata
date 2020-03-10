package starcraft;

public class Building extends Unit {
	public Building(int hp) {
		super(hp);
	}
}

class Academy extends Building implements Repairable {
	public Academy() {
		super(500);
	}
}

class Bunker extends Building implements Repairable {
	public Bunker() {
		super(350);
	}
}

abstract class MovableBuilding extends Building implements Liftable, Repairable {
	boolean isLift;

	public MovableBuilding(int hp) {
		super(hp);
		isLift = false;
	}

	@Override
	public void liftOff() {
		System.out.println("Lift Off...");
		isLift = true;
	}

	@Override
	public void land() {
		System.out.println("Landing...");
		isLift = false;
	}

}

class Barrack extends MovableBuilding {
	public Barrack() {
		super(1000);
	}

	@Override
	public void move(int x, int y) {
		if (isLift)
			System.out.printf("[%s,%s] Barrack Move!!%n", x, y);
		else
			System.out.println("Barrack is not lifting..");
	}
}

class Factory extends MovableBuilding {
	public Factory() {
		super(1250);
	}

	@Override
	public void move(int x, int y) {
		if (isLift)
			System.out.printf("[%s,%s] Factory Move!!%n", x, y);
		else
			System.out.println("Factory is not lifting..");
	}
}

interface Liftable extends Movable {
	void liftOff();

	void land();
}