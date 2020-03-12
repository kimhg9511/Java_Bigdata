//MemberService.java
package member.array;

import java.util.Scanner;

public class MemberService {    // 실제 시스템의 비즈니스를 구현하는 객체
    void process(Action action,Scanner sc) {
        action.execute(sc);        // execute() 호출
    }
}