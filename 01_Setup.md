Chapter 01.  자바의 개요 및 환경 설정

1. 자바의 탄생

- 썬 마이크로시스템즈(Sun Microsystems, Inc, 이하 썬)에서 개발한 대표적인 객체 지향 프로그래밍 언어
- 2010년 썬이 오라클(Oracle) 사에 인수 되면서 오라클 사의 제품이 됨
- 1996년 1월 JDK 1.0 발표
- 현재 JDK 11 , 계속 업데이트 중

2. 자바의 특징

- 가장 대표적인 객체 지향 언어
- 플랫폼 독립적인 언어
- JVM을 통해 메모리 관리
- 사용하지 않는 객체가 존재하면 GC(Garbage Collector)가 자동 소멸 시킴
- 언어 차원에서 스레드를 지원
- 인터프리터에 의해 실행 
- 소스(.java) > 컴파일 > 바이트코드(.class) > JVM 인터프리터가 해당 플랫폼으로 변환

3. JDK(Java Devleopment Kit)의 종류

- Java SE : 자바 프로그래밍 기본적인고 핵심 패키지  
- Java EE : 서버 측 프로그램을 위한 다양한 API 지원
- Java ME: 소형기기를 위한 자바 플랫폼

4. 환경설정

- 오라클 홈페이지 나 검색으로 jdk 8 또는 9 download 및 설치

4.1 환경변수 설정

- 내컴퓨터(내PC) > 속성 > 고급 시스템 설정 > 고급 > 환경 변수
- 새로만들기 > JAVA_HOME : 자바 설치 폴더
- 새로만들기 > CLASSPATH: %JAVA_HOME%\bin;.;
- Path : %JAVA_HOME%\bin 추가

4.2 bin 디렉토리 주요 실행 파일

- javac.exe : 자바 컴파일러, 자바소스코드를 바이트코드로 컴파일
 - javac Hello.java

- java.exe or javaw.exe : 자바 인터프리터, 자바 컴파일러가 생성한 바이트코드를 해석하고 실행
 - java Hello

- javadoc.exe : 자동 문서 생성기, 소스 파일의 주석(`/** */`) 을 이용 Java API 같은 형식 문서 생성
 - javadoc Hello

- jar.exe : 압축프로그램, 클래스파일과 프로그램 실행에 관련된 파일을 하나의 jar 파일(.jar)로 압축 하거나 해제
 - 압축 : jar cvf Hello.jar Hello1.class Hello2.class
 - 해제 : jar xvf Hello.jar\

4. 3 Java API 문서 설치하기

- google 에서 javadoc 검색 download -> 적당한 곳에 압축 해제  (자바 설치 폴더 등)
- /docs/api/index.html 실행

4.4 Java 개발 툴(Editor)

- Eclipse : google eclipes 검색 > Eclipse IDE for Java Developers 다운로드
- Eclipse > Window > Preferences > encoding 검색 > Workspace > Text file encoding >  UTF8 로 변경
- IntelliJ,netbeans, editplus, notepad++ 등

참고

환경설정 : http://programmerchoo.tistory.com/212

