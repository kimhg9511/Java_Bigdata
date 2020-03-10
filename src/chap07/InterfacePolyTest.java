package chap07;

interface Command{
	void execute();
}

class WriteCommand implements Command{
	@Override
	public void execute() {
		System.out.println("글을 새로 작성한다.");
	}
}

class ListCommand implements Command{
	@Override
	public void execute() {
		System.out.println("전체 목록을 보여준다.");
	}
}

class CommandProcess{
	public void process(Command command) {
		command.execute();
	}
}

public class InterfacePolyTest {
/**
 * 인터페이스 다형성 테스트
 * @param args
 */
	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		WriteCommand wc = new WriteCommand();
		ListCommand lc = new ListCommand();
		
		cp.process(wc);
		cp.process(lc);
	}
}
