package chap02;

public class OperationTest09 {
	public static void main(String[] args) {
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%x%n",hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	}
}
