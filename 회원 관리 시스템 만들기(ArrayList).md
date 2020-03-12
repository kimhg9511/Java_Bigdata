# Intro

지난 포스팅에서는 객체 배열을 사용하여 회원정보를 저장하여 관리하는 콘솔 프로그램을 제작했었습니다.

오늘은 회원정보를 저장할 자료형을 객체 배열에서 ArrayList 클래스로 바꾸어 보겠습니다.



# List(Collection) 개요

바꾸기 전에 List 인터페이스에 대하여 간단히 짚고 넘어가겠습니다. List 인터페이스는 Collection 프레임워크의 일종으로 주요한 특징으로는 중복을 허용하며, 순서가 있는 저장공간이라는 점입니다. List 인터페이스를 구현한 클래스로는 LinkedList, Vector, ArrayList가 있습니다. 



이 중에서 우리가 사용할 클래스는 ArrayList 클래스이며, 이 클래스는 단방향 포인터 구조로 되어있어 각 데이터에 대한 인덱스를 가지고 있으며, 조회 기능에 성능이 뛰어나다는 장점이 있습니다.



해당 시스템에서 ArrayList를 사용할 때에 얻는 가장 큰 이점으로는 자료형의 사이즈가 가변형이기 때문에 객체 배열이었을 당시 구현해주어야 했던 배열 사이즈의 변화를 알아서 처리해 준다는 점입니다. 이 장점에 대해서는 AddAction.java와 DeleteAction.java를 수정할 때 다시 언급하겠습니다.



# MemberMain.java 수정

```java
//MemberMain.java
package member.arraylist;

//import java.util.Arrays;	***
import java.util.Scanner;
import java.util.ArrayList;
public class MemberMain {
	
    //static MemberVO[] members;// 회원정보를 저장할 객체배열 members[] 생성 ***
	static ArrayList<MemberVO> members; // 회원정보를 저장할 ArrayList members 생성

    public static void main(String[] args) {
        //선언부
        MemberService ms = new MemberService();
        Scanner sc = new Scanner(System.in);
        //members = new MemberVO[0]; ***
        members = new ArrayList<MemberVO>();
        
        boolean isStop = false;
        //메뉴구현
        do {
            System.out.println("메뉴 선택");
            System.out.println("============");
            System.out.println("1.회원 가입");
            System.out.println("2.회원 목록 보기");
            System.out.println("3.회원 삭제");
            System.out.println("4.회원 정보 수정");
            System.out.println("5.종료");
            System.out.println("============");
            String command = sc.next();
            Action action = null;
            switch (command) {
            case "1":
                action = new AddAction();
                ms.process(action, sc);
                break;
            case "2":
                action = new ListAction();
                ms.process(action, sc);
                break;
            case "3":
                action = new DeleteAction();
                ms.process(action, sc);
                break;
            case "4":
                action = new UpdateAction();
                ms.process(action, sc);
                break;
            case "5":
                isStop = true;
                break;
            default:
                System.out.println("유효한 값을 입력하세요.");
            }
        } while (!isStop);
    }
}
```



가장 먼저 Main부터 수정하겠습니다. static 으로 선언되어 있었던 memberVO[] member를 삭제하고 대신
ArrayList를 사용하는 모습을 볼 수 있습니다. 그에 따라 초기화도 자연스럽게 ArrayList를 초기화하고 있습니다.



ArrayList 우측의 꺽쇠"<>"안의 내용은 자료형을 정의하는 곳입니다. 



본래 Collection 프레임워크를 정의할 때에는 자료형에 관계없이 데이터를 넣을 수 있게 구성을 했었고, 실제로 꺽쇠 안에 자료형을 명시하지 않으면 ArrayList는 자료형에 관계없이 데이터를 저장할 수 있습니다. 하지만, 본래 개발 의도와는 달리 개발자들은 저장되는 자료형이 하나뿐인 경우가 더 많았고, 결과 꺽쇠 안에 자료형을 명시할 수 있게 하였습니다. 



저렇게 자료형을 명시함으로 인하여 얻는 이점은 잘못된 데이터 체크(아예 컴파일 오류가 발생합니다), 데이터를 사용할 때 자료형 명시 생략 가능 등등이 있습니다. 



Main을 수정하였다면, 남은 것은 기능을 구현한 ~~Action.java 에 저장된 클래스들의 구현부 뿐입니다. 
이처럼 개발 시에 기능에 따라 모듈화를 잘 수행했다면 유지 보수에 큰 이점을 가지게 됩니다.



# AddAction.java 수정

```java
//AddAction.java
package member.arraylist;

import java.util.Scanner;
//import java.util.ArrayList;

public class AddAction implements Action{	//1.회원 가입

	@Override
	public void execute(Scanner sc) {
		System.out.println("==========");
		System.out.println("회원 정보 입력");
		System.out.println("==========");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		String age = sc.next();
		System.out.print("이메일: ");
		String email = sc.next();
		System.out.print("국가: ");
		String nation = sc.next();
		System.out.print("전화번호: ");
		String tel = sc.next();
		
		MemberVO member = new MemberVO(Integer.parseInt(age), name, tel, email, nation);
		//addMember(member); ***
		MemberMain.members.add(member);
	}

//	private void addMember(MemberVO member) { ***
//		int index = MemberMain.members.length;
//		MemberVO[] temp = new MemberVO[index+1];
//		for(int i=0;i<MemberMain.members.length;i++) {
//			temp[i] = MemberMain.members[i];
//		}
//		temp[index] = member;
//		MemberMain.members = temp;
//		MemberMain.members.add(member);
//	} ***
}
```



AddAction.java입니다. 사용자로부터 회원정보를 입력받는 부분은 변함이 없고, 그 뒤 memberVO 객체를 생성하여 members ArrayList에 전달하는 과정이 변화하였습니다. 우선 배열일때 수행해야 했던 배열의 크기를 늘리는 코딩이 필요가 없어졌고, 단순히 ArrayList에 구현된 메소드 add()만을 사용하여 처리할 수 있었던 모습입니다.



# ListAction.java 수정

```java
//ListAction.java
package member.arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class ListAction implements Action {//2.회원 정보 보기

    @Override
    public void execute(Scanner sc) {
        //MemberVO[] members = MemberMain.members; ***
    	ArrayList<MemberVO> members = MemberMain.members;
        //출력할 데이터가 있는지?
       // if (members.length >= 1) { ***
    	if(members.size()>=1) {
            printMember(members);        //데이터를 출력하는 메서드
        } else {
            System.out.println("member not found");
        }
    }
	//private void printMember(memberVO[] members) { ***
    private void printMember(ArrayList<MemberVO> members) {
        for (MemberVO member : members) {
            String name = member.getName();
            int age = member.getAge();
            String email = member.getEmail();
            String nation = member.getNation();
            String tel = member.getTel();

            String s = "name : %s, age : %s, email : %s";
            s = s + ", nation : %s, tel : %s %n";

            System.out.printf(s, name, age, email, nation, tel);
        }
    }
}
```



ListAction.java에서는 printMember() 메소드에서 받는 매개변수가 memberVO[]에서 ArrayList로 변화하였을 뿐 큰 차이점이 없습니다. 

Collection 프레임워크의 자료구조들은 공통적으로 향상된 for문의 우변에 위치하여 값을 하나씩 전달할 수 있습니다. 숙지하시고 사용하시면 Iterator를 이용한 순차탐색보다 더 효율적인 경우도 종종 있으니 기억해두시면 좋겠습니다. 



# DeleteAction.java 수정

```java
//DeleteAction.java
package member.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAction implements Action {	// 3.회원 삭제

	@Override
	public void execute(Scanner sc) {
		//MemberVO[] members = MemberMain.members; ***
		ArrayList<MemberVO> members = MemberMain.members;
		//MemberVO member; ***
		
		System.out.println("삭제할 회원의 이름을 넣으시오");
		System.out.println("이름 : ");
		
		String name = sc.next();
		for(MemberVO member : members) {
			if(member.getName().equals(name)) {
				members.remove(member);
				System.out.println("Delete complete.");
				return;
			}
		}
		System.out.println("삭제할 회원이 없습니다.");
//		for(int i=0;i<members.size();i++) {
//			member = members.get(i);
//			if(member.getName().equals(name)) {
//				members.remove(i);
//			}
//		}
		//deleteMember(name);
	}

//	private void deleteMember(String name) {	
//		int deleteIndex = -1; // 회원이 없을 때의 값
//		MemberVO[] members = MemberMain.members;
//		MemberVO[] temp = null;
//		int count = 0;
//		for (MemberVO member : members) {
//			if (member.getName().equals(name)) {
//				deleteIndex = count;
//				break;
//			}
//			count++;
//		}
//		if (deleteIndex == -1) {
//			System.out.println("member name not found..");
//			return;
//		}
//		temp = new MemberVO[members.length - 1];
//		for (int i = 0; i < members.length; i++) {
//			if (i == deleteIndex) {
//				continue;
//			} else if (i > deleteIndex) {
//				temp[i - 1] = members[i];
//			} else {
//				temp[i] = members[i];
//			}
//
//		}
//		MemberMain.members = temp;
//	}
}
```



DeleteAction.java에서 가장 큰 변화가 생겼습니다.  사실상 탐색, 삭제 등 구현이 다 의미가 없어지고 반복문을 통하여 삭제하고자 하는 값을 찾으면 바로 그 값을 가진 객체의 참조값을 삭제하여 데이터를 삭제할 수 있게 되었습니다. 데이터 사이즈도 가변형이므로 후처리를 할 필요도 없습니다. Good!



# UpdateAction.java 수정

```java
//UpdateAction.java
package member.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAction implements Action {	// 4.회원 정보 수정
	//MemberVO[] members = MemberMain.members; ***
	ArrayList<MemberVO> members = MemberMain.members;
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("수정할 이름을 넣어주세요");
		System.out.print("이름 : ");
		String name = sc.next();

		MemberVO member = getUpdateMember(name);
		if (member == null) {
			System.out.println("Member not found.. ");
		} else {
			updateMember(member, sc);
		}
	}

	private void updateMember(MemberVO member, Scanner sc) {
		System.out.println("전화번호 : ");
		String tel = sc.next();
		System.out.println("국가 : ");
		String nation = sc.next();
		System.out.println("나이 : ");
		String age = sc.next();
		System.out.println("이메일 : ");
		String email = sc.next();
		member.setAge(Integer.parseInt(age));
		member.setEmail(email);
		member.setNation(nation);
		member.setTel(tel);
	}

	private MemberVO getUpdateMember(String name) {
		// 수정할 멤버 확인
		MemberVO member = null;
		for (MemberVO tempMember : members) {
			if (tempMember.getName().equals(name)) {
				member = tempMember;
			}
		}	
		return member;
	}
}
```



UpdateAction.java에서도 큰 변화는 없습니다. 넘겨주는 자료구조가 MemberVO[]에서 ArrayList로 바뀌었습니다. 간단하네요. 

ArrayList를 이용하여 구현한 회원관리 시스템은 여기까지입니다. 회원 정보가 지금까지는 메모리에 저장되어 프로그램이 종료되면 모두 사라지게 되어있는데, 회원을 관리하려면 자료가 남아야겠죠? 다음 포스팅은 파일 시스템에 회원 정보를 기록하여 저장하는 법을 알아보도록 하겠습니다.