# Chap 02 변수와 연산자

1. # 자바 프로그램의 실행

# 1.1. 자바 프로그램의 실행 단계

- 소스코드 작성 : Hello.java
- 소스 코드 컴파일  : javac Hello.java
- JVM을 이용해서 실행 : java Hello
- Class File Loader > Verifier > Interpreter > Runtime



# 2.1 Hello.java

```
public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, world.");
	}
}
```
# 컴파일 및 실행

- javac Hello.java
- javc Hello

# 실행순서

- 클래스파일 Hello.class 로드
- 파일 검사
- 클래스에서 main(String[] args) 호출



2. # 식별자

식별자란 자바 코드에서 사용되는 변수, 메소드, 클래스, 배열 등의 이름

# 2.1 식별자 정의 규칙

- 대소문자 구분
- A~Z, a~Z, _, $
- 숫자는 두 번째 문자 부터 가능
- 키워드는 사용 불가

# 예약어

```
abstract  continue  for         new        switch
assert    default   goto        package    synchronized
boolean   do        if          private    this
break     double    implements  protected  throw
byte      else      import      public     throws
case      enum      instanceof  return     transient
catch     extends   int         short      try
char      final     interface   static     void
class     finally   long        strictfp   volatile
const     float     native      super      while
```

# 2.2 식별자 이름 규칙(코딩 관습 상 지켜지는 규칙등 )

- 클래스 :  첫문자 대문자, 두단어 합쳐지는 경우 두 번째 단어 첫단어도 대문자 : GameTest
- 메소드(동사) : 소문자, 두단어 합쳐지는 경우 두 번째 단어 첫단어 대문자 : go(), getTime()
- 변수(명사) : 소문자, 두단어 합쳐지는 경우 두 번째 단어 첫단어 대문자 : age, myName
- 상수 :  모든문자 대문자, 두단어 합쳐지는 경우 두 번째 단어 _로 연결 : PI, MAX_NUM



3. # 주석

- // : 한 줄  주석
- /* */ : 여러 줄 주석
- /** */ : 여러 줄 주석, 자바 도큐먼트 생성 할때 자주 사용

```
public class CommentTest01 {
	
	public static void main(String[] args) {
		// 한 줄 주석
		System.out.println("한 줄 주석");	
		/* 여러 줄 주석
		  여러 줄 주석
		 */
		System.out.println("여러 줄 주석");
	}
}
```



4. # 변수

# 4-1 변수의 의미

- 특정 타입의 데이터를 메모리상에 담을 수 있는 영역
- 단 하나의 값을 저장할 수 있는 메모리 공간
- int a = 1; 메모리 a 변수 영역에 1 값이 저장
- a + 1;  메모리 a 변수 영역의 값을 가져와서 1과 더해 주는 연산 수행
- 새로운 값을 저장 하면 기존의 값은 새로운 값으로 변경



#  변수의 선언과 초기화

- 변수타입 변수이름;
- int age; // age 라는 이름의 정수형 변수 선언
- 변수타입 : 변수에 저장 될 값의 타입 (정수형, 실수형, 문자형 등)
- 변수이름 : 값을 저장할 메모리공간의 이름
- 변수 선언 : 변수 타입에 맞는 저장공간 확보 하고 그 공간은 변수 이름을 통해 사용
- 변수 초기화 : 변수를 사용하기 전에 처음으로 값을 저장하는 것
- int a; int a, b, c;
- int a=1; int a=1,b=2,c=3;



# 4.2 데이터 타입

- 사용할 메모리의 영역의 크기와 갑의 종류 지정
- 기본형(primitive type) 과 참조형(reference type)
- 기본형 : 실제 값(data)를 저장 
- 참조형 : 주소(momory address) 값을 저장(C언처 처럼 참조형 변수 간 연산 불가)
- 기본형 8개를 제외한 나머지 타입
- 정수형 long형은 L 또는 l, 실수형 float 형에는 F 또는f 을 붙임



4. # 2.1 기본형

| 분류   | 타입                   | 설명                                                         |
| ------ | ---------------------- | ------------------------------------------------------------ |
| 논리형 | boolean                | true 와 false 중 하나의 값을 가짐, 조건식과 논리적 계산에 사용 |
| 문자형 | char                   | 변수에 하나의 문자를 저장 시 사용                            |
| 정수형 | byte, short, int, long | 정수 저장시 사용, 주로 int 사용                              |
| 실수형 | float, double          | 주로 double 사용                                             |

| 분류   | 타입                                     | 값                               |
| ------ | ---------------------------------------- | -------------------------------- |
| 논리형 | boolean 1byte(8bit)                      | true or false                    |
| 문자형 | char 2byte(16bit)                        | 0~65535(2^16 - 1)                |
| 정수형 | byte, short, int 4byte(32bit), long      | 약 +- 20억(-2^31 ~ 2^31-1)       |
| 실수형 | float 4byte(32bit) , double 8byte(64bit) | 1.4E-45~3.4E38, 4.9E-324~1.8E308 |

- 실수형은 정수형과 저장방식이 달라 같은 크기라도 큰 값 저장이 가능하나 오차가 존재

```
public class DataTypeTest {
	public static void main(String[] args) {
		//boolean 
		boolean var_boolean = true;
		
		//byte
		byte var_byte  = 127;
		
		//short
		short var_short = 32767;
		
		//char
		char var_char1 = 66;
		char var_char2 = 'A';
		char var_char3 = '\u0041';
		
		//그 이상의 숫자들
		
		//int
		int var_int = 100000;
		
		//long
		long var_long = 1000000;
		
		//float
		float var_float = 3.14f;
		
		//double
		double var_double = 3.14;

		//출력
		System.out.println("var_boolean = " + var_boolean);
		System.out.println("var_byte = " + var_byte);
		System.out.println("var_short = " + var_short);
		System.out.println("var_char1 = " + var_char1);
		System.out.println("var_char2 = " + var_char2);
		System.out.println("var_char3 = " + var_char3);
		System.out.println("var_int = " + var_int);
		System.out.println("var_long = " + var_long);
		System.out.println("var_float = " + var_float);
		System.out.println("var_double = " + var_double);
	}
}

```

- 두 변수의 값 교환하기
```
class VarChangeTest {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0;
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x:"+ x + " y:" + y);
	}
}
```
- 문자열과의 덧셈(모두 문자열로 형 변환됨)

```
class StringCastTest {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}

```

5. # 형 변환
- 변수의 데이터 타입과 변수에 들어갈 값의 데이터 타입이 같아야 함
- 변수에 들어갈 값의 데이터 타입이 다르면 같게 만들어 주는 것

# 5.1 형 변환 방법

- 큰 타입 변수 = 작은 타입 값 (자동 형 변환)
- 작은 타입 변수 = (작은 타입) 큰 타입 값 (명식적 형 변환)
- int형 보다 작은 형(byte, short)는 int형으로 자동 형 변환 후 연산
- char 형은 정수 연산이 가능
- 그 외 연산은 피연산자 중 가장 큰 형으로 변환 후 연산 

```
public class ConversionTest {
	/**
	 * 형 변환 예제
	 */
	public static void main(String[] args) {
		//큰 타입으로 자동 변환
		byte var_byte1 = 10;
		int var_int1 = var_byte1;
		System.out.println("var_int1 = " + var_int1);
		
		//명시적 형 변환: 큰 타입의 값을 작은 타입의 변수에 할당
		//명시적으로 형 변환해 주지 않으면 컴파일 오류 발생
		int var_int2 = 100;
		byte var_byte2 = (byte)var_int2;
		
		//char와 short
		short var_short1 = 200;
	    char var_char1 = (char)var_short1;
		System.out.println("var_char1 = " + var_char1);
		
		//int 타입보다 작은 타입의 정수 연산 : int형으로 변환됨
		//int형보다 작은 타입의 변수에 값을 할당하려면 명시적으로 형 변환해 주어야 함
		byte var_byte3 = 20;
		byte var_byte4 = 40;
		byte var_result1 = (byte)(var_byte3 + var_byte4);
		
		char var_char2 = 'A';
		int var_int_result1 = var_char2 + 1;
		System.out.println("var_int_result1 = " + var_int_result1);
					
		//연산시 피연산자 중 보다 큰 타입으로 형 변환된 후 연산됨
		int var_int3 = 100;
		long var_long1 = 100;
		long var_long_result1 = var_int3 + var_long1;
		System.out.println("var_long_result1 = " + var_long_result1);
		
		//정수와 실수를 연산하면 실수 타입으로 자동 형 변환됨
		long var_long2 = 100;
		float var_float1 = 3.14f;
		float var_float_result1 = var_long2 + var_float1;
		System.out.println("var_float_result1 = " + var_float_result1);
		
		//float 타입과 double 타입을 연선하면 double 타입으로 변환됨
		float var_float2 = 3.33f;
		double var_double3 = 4.22;
		double var_long_result2 = var_float2 + var_double3;
		System.out.println("var_long_result2 = " + var_long_result2);		
	}
}
```

6. # 연산자

# 6.1 연산자 우선 순위

- 산술 > 비교 > 논리 > 대입 (대입은 제일 마지막에 수행)
- 단항(1) > 이항(2) > 삼항(3)
- 단항 연산자와 대입 연산자를 제외한 모든 연산의 진행 방향은 왼쪽에서 오른쪽


| 종류        | 연산자            | 설명                                         |
| ----------- | ----------------- | -------------------------------------------- |
| 최우선 연산자| . [] ()       |                          |
| 단항 연산자| ++ -- ! ~        |                          |
| 산술 연산자 | `+ - * / %`       | 사칙연산 나머지 연산                         |
| 비교 연산자 | `> < >= <= == !=` | 크고 작음 같음 다름                          |
| 논리 연산자 | `&& ||`           | 그리고 (AND) 와 또는 (OR) 조건 연결          |
| 대입 연산자 | =                 | 우변의 값을 좌변에 대입                      |
| 기타        |                   | 삼항연산자, 형변환연산자, instnace 연산자 등 |



# 6.2 산술 연산자

- +, - , *, /, %

```
public class OperatorTest01 {
	/**
	 * 산술 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		int var_int1 = 10;
		int var_int2 = 2;
		
		// + 연산
		result = var_int1 + var_int2;
		System.out.println("var_int1 + var_int2 = " + result);
		
		// - 연산
		result = var_int1 - var_int2;
		System.out.println("var_int1 - var_int2 = " + result);
		
		// * 연산 
		result = var_int1 * var_int2;
		System.out.println("var_int1 * var_int2 = " + result);
		
		// / 연산 
		result = var_int1 * var_int2;
		System.out.println("var_int1 / var_int2 = " + result);
		
		// % 연산 
		result = var_int1 % var_int2;
		System.out.println("var_int1 % var_int2 = " + result);
	}
}

```

- long 으로 변환 전에 이미 int의 범위를 넘어섬

```
class OperatorTest02 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1백만 
		int b = 2000000;    // 2,000,000   2백만 

		long c = a * b;     // a * b = 2,000,000,000,000 ?
		long d = (long)a * b;
		System.out.println(c);
	}
}

```

```

class OperatorTest03 {
	public static void main(String args[]) { 
		long a = 1000000 * 1000000;// int * int  오버플로우 발생
		long b = 1000000 * 1000000L;

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

```

```

class OperatorTest04 {
	public static void main(String args[]) { 
		int a = 1000000;

		int result1 = a * a / a;   // 1000000 * 1000000 / 1000000 오버플로우 발생
		int result2 = a / a * a;   // 1000000 / 1000000 * 1000000

		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); 
		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); 	
	}
}
```

# int / int 

- 나눗셈 결과는 int
- 나머지는 반올림(X) -> 버림

```

class OperatorTest05 { 
	public static void main(String[] args) { 
		float pi = 3.141592f; 
		float shortPi = (int)(pi * 1000) / 1000f; 

		System.out.println(shortPi); // 3.141
	} 
} 
```

- 반올림 해보기

```

class OperatorTest06 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;

		System.out.println(shortPi);
	}
}
```
- Math.round() 사용 : 소수점 첫째자리에서 반올림

```

class OperatorTest07 {
	public static void main(String args[]) { 
		double pi = 3.141592; 
		double shortPi = Math.round(pi * 1000) / 1000.0;

		System.out.println(shortPi);
	}
}
```

# 나머지 연산자 : %

- 나눗셈에서는 나누는 수(오른쪽 피연자)는 0 사용 불가
- 피연산자로 정수만 허용
- 짝수, 홀수 판별 또는 배수 검사 등에 주로 사용

```

class OperatorTest08 {
	public static void main(String args[]) { 
		int x = 10;
		int y = 8;
        int rs1 = x / y;
        int rs2 = x % y;
		System.out.printf("%d을 %d로 나누면, %n", x, y); 
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", rs1, rs2); 
	}
}

```

# 점수를 입력 받아 총점과 평균 구하기

# 인자값 전달로 입력 받기

- Run > Run Configuration > ArgsTest 검색 > Arguments 에 값 입력 (스페이스공백이나 엔터로 값 입력)
- cmd 콘솔에서 java ch02.ArgsTest aaa bbb 실행

```


public class ArgsTest {
	/**
	 * 인자 값 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String args1 = args[0];
		String args2 = args[1];
		
		System.out.println("args1 = " +  args1);
		System.out.println("args2 = " +  args2);
	}

}

```
```


public class OperationTest2 {
	/**
	 * 총점, 평균 구하기 예제
	 */
	public static void main(String[] args) {
		int total = 0;
		int avg = 0;
		int kor = Integer.parseInt(args[0]);
		int mat = Integer.parseInt(args[1]);
		int eng = Integer.parseInt(args[2]);
		
		total = kor + mat + eng;
		avg = total / 3;
		
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
	}
}

```

# 화면에서 입력 받기 - Scanner 클래스

```

import java.util.*;    // Scanner를 사용하기 위해 추가

class ScannerTest01 { 
	public static void main(String[] args) { 

        String sInput = null;
		int iInput = 0;

		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

		System.out.print("정수를 입력해주세요>");

        sInput = scanner.nextLine(); // 입력대기 상태에서 엔터 입력시 문자열 반환
        //sInput = scanner.next(); // 값을 스페이스 기준으로 받을 때
        //iInput = scanner.nextInt(); // 값을 정수값
        iInput = Integer.parseInt(sInput); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("iInput = " + iInput);
	}
}


```

```

import java.util.*;    // Scanner를 사용하기 위해 추가

class ScannerTest02 { 
	public static void main(String[] args) { 

        int total = 0;
		int avg = 0;

		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

		System.out.print("정수를 입력해주세요(70 80 90).>");

        int kor = scanner.nextInt();
		int mat = scanner.nextInt();
		int eng = scanner.nextInt();

		total = kor + mat + eng;
		avg = total / 3;
		
		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
	} 
}


```

- import java.util.*;  // Scanner 클래스
- Scanner scanner = new Scanner(System.in); // 사용할 클래스 객체 생성
- nextLine(); // 입력대기 상태에서 엔터 입력시 문자열 반환

# 6.3 비교 연산자

- >, >=, <, <=, ==, !=
- boolean 타입의 데이터 반환
- 참이면 true, 거짓이면 false 결과 반환
- 두 피연산자를 비교하는 데 사용되는 연산자
- 주로 조건문과 반복문의 조건식에 사용
- 비교하는 피연산자 타입이 다른 경우 큰 자료형으로 자동 형변환 후 비교


```


public class OperationTest03 {
	/**
	 * 비교 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		boolean result = false;
		
		// >
		result = x > y;
		System.out.println("x > y = " + result);
		
		// <
		result = x < y;
		System.out.println("x < y = " + result);
	
		// >=
		result = x >= y;
		System.out.println("x >= y = " + result);
		
		// <=
		result = x <= y;
		System.out.println("x <= y = " + result);
		
		// <=
		result = x == y;
		System.out.println("x == y = " + result);
		
		// !=
		result = x != y;
		System.out.println("x <= y = " + result);
	}
}

```

# 6.4 논리 연산자 - `&& || !`

- 두 개 이상의 조건이 결합된 경우 사용
- 그리고(AND) 나 또는(OR) 로 연결하여 하나의 식으로 표현
- `||` OR 결합 : 피연산자 중 어느 한 쪽만 true 이면 true
- `&&` AND 결합 : 피연산자 양 쪽 모두  true 이면 true 


|   x   |   y   | x \|\| x | x && y |
| :---: | :---: | :------: | :----: |
| true  | true  |   true   |  true  |
| true  | false |   true   | false  |
| false | true  |   true   | false  |
| false | false |  false   | false  |

```


public class OperationTest04 {
	/**
	 * 논리 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int y = 200;
		boolean result = false;
		
		// &&
		result = x < y && y >= 200;
		System.out.println("x < y && y >= 200 = " + result);
		
		result = x < y && y < 200;
		System.out.println("x < y && y < 200 = " + result);
		
		result = x > y && y++ > 200;
		System.out.println("x > y && y++ > 200 = " + result);
		System.out.println("y = " + y);
		
		//||
		result = x < y || y >= 200;
		System.out.println("x < y || y >= 200 = " + result);
		
		result = x < y || y < 200;
		System.out.println("x < y || y < 200 = " + result);
		
		result = x > y || y++ > 200;
		System.out.println("x > y || y++ > 200 = " + result);
		System.out.println("y = " + y);
		
		result = x < y || y++ > 200;
		System.out.println("x < y || y++ > 200 = " + result);
		System.out.println("y = " + y);
		
		// !
		result = !(x > y);
		System.out.println("!(x > y) = " + result);		
	}
}

```

# 6.5 증감 연산자 ++ --

- 증가 연산자(++) 피연산자의 값을 1 증가 시킴
- 감소 연산자(--) 피연산자의 값을 1 감소 시킴
- 전위형 : 값이 참조되기 전에 증가 :  j = ++i;
- 후위형 : 값이 참조된 후에 증가 : j = i ++;

```


public class OperationTest05 {
	/**
	 * 증감 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var_inc = 1;
		int var_dec = 1;
		int result = 0;

		// ++
		result = var_inc++;
		System.out.println("result = " + result);
		System.out.println("var_inc = " + var_inc);
		
		result = ++var_inc;
		System.out.println("result = " + result);
		System.out.println("var_inc = " + var_inc);
		
		// --
		result = var_dec--;
		System.out.println("result = " + result);
		System.out.println("var_dec = " + var_dec);
		
		result = --var_dec;
		System.out.println("result = " + result);
		System.out.println("var_dec = " + var_dec);
	}

}

```



# 부호 연산자 + -

```


class OperationTest06 {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);

		i=-10;
		i = -i;
		System.out.println(i);
	}
}
```

# 6.6 비트 연산자 ` & | ^ ~ << >>`

|  x   |  y   | x \| y | x & y | x ^ y |
| :--: | :--: | :----: | :---: | :---: |
|  1   |  1   |   1    |   1   |   0   |
|  1   |  0   |   1    |   0   |   1   |
|  0   |  1   |   1    |   0   |   1   |
|  0   |  0   |   0    |   0   |   0   |

```


public class OperationTest07 {
	/**
	 * 비트 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		int y = 3;
		int result = 0;
		boolean bResult = false;
		
		/* 비트로 변경
		 * 8 : 00000000 00000000 00000000 00001000
		 * 3 : 00000000 00000000 00000000 00000011
		 */
		
		// &
		result = x & y;
		System.out.println("x & y = " + result);
		bResult = true & false;
		System.out.println("true & false = " + bResult);
		
		// |
		result = x | y;
		System.out.println("x | y = " + result);
		bResult = true | false;
		System.out.println("true | false = " + bResult);
		
		// ^
		result = x ^ y;
		System.out.println("x ^ y = " + result);
		bResult = true ^ false;
		System.out.println("true ^ false = " + bResult);			
	}
}

```

# 쉬프트 연산자 : << >>

- 피연사자이 자리수를 오른쪽 ` >>`  또는 왼쪽 ` <<` 이동 시킴
- 자리 이동으로 벗어난 값은 버려지고 빈자리는 0으로 채워짐
- 8 << 2 `0 0 0 0 1 0 0 0 ` ->   ` x x `  ` 0 0 1 0 0 0` `0 0`
- x << n 은 x * 2^n 의 결과
- x >> n 은 x / 2^n 의 결과

```


public class OperationTest08 {
	/**
	 * 시프트 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int result = 0;
		
		// <<
		result = x << 2;
		System.out.println("x << 2 = " + result);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(result));
		
		// >>
		x = -1;
		result = x >> 1;
		System.out.println("x >> 1 = " + result);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(result));
		
		// >>>
		result = x >>> 1;
		System.out.println("x >>> 1 = " + result);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(result));
	}
}
```

# 마스크 연산 - 원하는 값 구하기

```

class OperationTest09 {
	public static void main(String[] args) {
		int hex  = 0xABCD;
		int mask = 0xF;

		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	} 
}

```

# 6.7 대입 연산자 ` = `

- 변수와 같은 저장 공간에 값 또는 수식의 연산 결과를 저장
- x =  3; x 를 lvalue(left value) , 3을 rvalue(right value) 
- 3 = i + 3; -> (x);  i + 3 = i; -> (x), i = i + 3; ->(0) 
- rvalue : 변수, 식, 상수등 모두 가능
- lvalue : 반드시 변수 처럼 값을 변경 할 수 있는 것이야 함

# 복합 대입 연산자(연산 후 대입 연산자)

| op =          | =                  |
| ------------- | ------------------ |
| i += 3;       | i = i + 3;         |
| i -= 3;       | i = i - 3;         |
| i *= 3;       | i = i * 3;         |
| i /= 3;       | i = i / 3;         |
| i %= 3;       | i = i % 3;         |
| i  *= 10 + j; | i  = i * (10 + j); |

```


public class OperationTest10 {

	/**
	 * 복합 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		
		// +=
		x += 5;
		System.out.println("x += 5 = " + x);
		x += 3.1;
		System.out.println("x += 3.1 = " + x);
		
		// *=
		x *= 2;
		System.out.println("x *= 2 = " + x);
		
		// /=
		x /= 2;		
		System.out.println("x /= 2 = " + x);
		
		// -=
		x -= 5;
		System.out.println("x -= 5 = " + x);
		
		// %=
		x %= 2;
		System.out.println("x %= 2 = " + x);		
		}
}

```

# 6.8 삼항 연산자

- 조건식 ? 식1 : 식2 
- 조건식이 true 이면 식1, false 면 식2가 실행 됨

```

public class OperationTest11 {
	/**
	 * 삼항 연산자 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(args[0]);
		String msg = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + " 은 " + msg + " 입니다.");
	}
}

```

```

class OperationTest12 {
	public static void main(String args[]) { 
		int  x, y, z;
		int  absX, absY, absZ;
		char signX, signY, signZ;

		x = 10;
		y = -5;
		z = 0;

		absX = x >= 0 ? x : -x;  // x의 값이 음수이면, 양수로 만든다.
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;

		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');  // 조건 연산자를 중첩
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-'); 
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 

		System.out.printf("x=%c%d%n", signX, absX);
		System.out.printf("y=%c%d%n", signY, absY);
		System.out.printf("z=%c%d%n", signZ, absZ);
	}
}

```
