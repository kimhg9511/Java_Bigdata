package chap07;

abstract class Vehicle {
	abstract void move();
}

class Car extends Vehicle {
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("차도로 다닌다.");
	}
}

class Ship extends Vehicle {
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("수로로 다닌다.");
	}
}

class Plane extends Vehicle implements Flyable{
	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("하늘로 다닌다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날아다닌다.");
	}
}

class VehicleUse {
	void getMoveStyle(Vehicle vehicle) {
		vehicle.move();
	}
}

public class AbstractTest03 {
	/**
	 * 추상 클래스의 다형성 테스트
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Ship ship = new Ship();
		Plane plane = new Plane();
		VehicleUse vUse = new VehicleUse();
		
		vUse.getMoveStyle(car);
		vUse.getMoveStyle(ship);
		vUse.getMoveStyle(plane);
		plane.fly();
	}

}
