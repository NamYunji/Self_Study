package _0118.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Calendar to Date
 * 바꾸는 이유 : SimpleDateFormat은 date밖에 쓸 수가 없다
 * 그런데 date에 원하는 날짜를 입력하려면, calendar에서 getTimeInMillis를 사용하여 설정
 */
public class CalendarToDate {
	public static void main(String[] args) {
		//Calendar
		Calendar cal = Calendar.getInstance();
		cal.set(1997, 4, 5);
		System.out.println(cal);
		//Date
		//1. 기본생성자 사용 : 현재시간을 객체로 만들어준다
		//2. parameter생성자 사용 : ms를 입력받아, 그에 해당하는 날짜로 설정
		Date date = new Date(cal.getTimeInMillis());
		//Mon May 05 02:03:25 KST 1997
		System.out.println(date);
		
		//Date객체를 SimpleDateFormat을 사용하여 원하는 형식으로 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String result = sdf.format(date);
		//1997년 5월 5일
		System.out.println(result);
	}

}
