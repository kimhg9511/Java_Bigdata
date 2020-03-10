package starcraft;

interface Movable {
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}

interface Fightable extends Movable, Attackable{
	
}
abstract public class Fighter extends Unit implements Fightable{

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public
	abstract void move(int x, int y);
	
}