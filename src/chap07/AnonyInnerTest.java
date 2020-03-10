package chap07;

public class AnonyInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommandProcess cp = new CommandProcess();
		cp.process(new Command() {
			@Override
			public void execute() {
				System.out.println("내용보기 실행");
			}
		});
	}
}
