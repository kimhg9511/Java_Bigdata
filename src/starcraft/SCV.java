package starcraft;

public class SCV extends GroundUnit implements Repairable{
	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			u.hitPoint = MAX_HP;
			System.out.println("" + u + " 수리 완료");
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}
}