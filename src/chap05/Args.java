package chap05;

public class Args {
	int x;
	
	void add(int x) {
		x = x + 50;
	} 
	 
	void add(Args arg) {
		System.out.println("arg address(func) = " + arg);
		arg.x = arg.x + 40;
		
	}
	
	void add(int[] arr) {
		arr[0]++;
	}
	
	void addNew(Args arg) {
		arg = new Args();
		System.out.println("arg address(func) = " + arg);
	}
}
