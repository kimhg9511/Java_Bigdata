package chap05;

public class Boiler {
	String maker;
	int temp;
	String color;
	
	void tempUp() {
		temp++;
	}
	
	void tempUp(int amount) {
		temp += amount;
	}
}
