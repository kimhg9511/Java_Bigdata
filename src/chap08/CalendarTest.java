package chap08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
/**
 * Calendar 클래스 테스트
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar myCalendar = Calendar.getInstance();	// singleton
		
		//값 설정
		myCalendar.set(Calendar.YEAR, 2020);
		myCalendar.set(Calendar.MONTH, 3);
		myCalendar.set(Calendar.DAY_OF_MONTH, 12);
		myCalendar.set(Calendar.HOUR_OF_DAY, 10);
		myCalendar.set(Calendar.MINUTE, 24);
		myCalendar.set(Calendar.SECOND, 0);
		
		//출력 형식 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
		DateFormat df = DateFormat.getDateTimeInstance();
		Date date = myCalendar.getTime();
		
		//날짜 출력
		System.out.println(sdf.format(date));
		System.out.println(df.format(date));
	}

}
