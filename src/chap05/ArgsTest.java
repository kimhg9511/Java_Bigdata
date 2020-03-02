package chap05;

public class ArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Args arg = new Args(); // x = 0
		Args arg2 = new Args(); 
		
		arg.x = 100; // x = 100
		arg2.x = 200;
		int[] arr = new int[1];
		
		arg.add(arg.x); // 값에 의한 전달
		System.out.println("arg.x = " + arg.x); // x = 100
		
		System.out.println("arg(main) address = " + arg); 
		arg.add(arg); // 참조에 의한 전달
		System.out.println("arg.x = " + arg.x); // x = 140

		System.out.println("arg(main) address = " + arg); 
		arg.addNew(arg); // 참조에 의한 전달
		System.out.println("arg.x = " + arg.x); // x = 140
		
		System.out.println("arg(main) address = " + arg); 
		arg.add(arr);	//참조에 의한 전달
		System.out.println("arr[0] = " + arr[0]); // arr[0] = 1
		//++ java는 값에 의한 전달만을 사용한다. 다만, 넘겨주는 값이 참조형 변수의 주소일 뿐
		
		//Car
		Car car = new Car();
		car.add(arg, arg2);
		System.out.println("arg.x : " + arg.x);
		System.out.println("arg2.x : " + arg2.x);
	}
}
