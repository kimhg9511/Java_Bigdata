

package starcraft;

public class Marine extends GroundUnit implements Fightable{
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	void stpack() {
	}

	@Override
	public void move(int x, int y) { // TODO Auto-generated method stub
		System.out.printf("[%s,%s] Marine Move!!%n", x, y);
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Marine";
	}
}
