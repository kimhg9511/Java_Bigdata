package member.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

abstract class fileIO {
	//File 입출력 디렉터리 지정
	String path = "D:\\BigData\\JavaStudy\\WorkSpace\\Java_Bigdata\\IOtest";	
	
	FileReader fr = null;			// 파일을 읽을 때 사용
	FileWriter fw = null;			// 파일을 쓸 때 사용
	BufferedReader bfr = null;		// 파일을 읽을 때 사용할 버퍼
	StringTokenizer st = null;		// 구분자 단위로 문자열을 쪼갤 때 사용
}
