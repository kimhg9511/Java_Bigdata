# List(Collection) 개요





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



