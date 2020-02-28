package chap05;

public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Args arg = new Args(); // x = 0
		
		arg.x = 100; // x = 100
		int[] arr = new int[1];
		
		arg.add(arg.x); // 값에 의한 전달
		System.out.println("arg.x = " + arg.x); // x = 100
		
		System.out.println("arg address(main) = " + arg); 
		arg.add(arg); // 참조에 의한 전달
		System.out.println("arg.x = " + arg.x); // x = 140

		System.out.println("arg address(main) = " + arg); 
		arg.addNew(arg); 
		System.out.println("arg.x = " + arg.x); // x = 140
		System.out.println("arg address(main) = " + arg); 
		arg.add(arr);	//참조에 의한 전달
		System.out.println("arr[0] = " + arr[0]); // arr[0] = 1
	}
}
