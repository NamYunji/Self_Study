package _0115.calendar;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
		ct.test1();
		ct.test2();
	}

	//현재시간 - 내 생일
	private void test2() {
		Calendar bth = Calendar.getInstance();
		bth.set(1997, (5-1), 5);	
		long bday = bth.getTimeInMillis();
		
		Calendar today = Calendar.getInstance();
		today.set(2021, (1-1), 17);
		long tday = today.getTimeInMillis();
		
		double diff = (double)(tday - bday)/(1000*60*60*24);
		System.out.println(diff);
	}

	private void test1() {
		//생일을 calendar객체로 만듦 -> simpleDateFormat사용하여 출력
		Calendar birth = Calendar.getInstance();
		birth.set(1997, (5-1), 5);
		System.out.println(birth);
		SimpleDateFormat b = new SimpleDateFormat("yyyy년 MM월 dd일");
		//simpleDateFormat은 date객체만 사용가능 -> calendar객체를 date객체로 바꾸어주는 과정 필요
		Date date = new Date(birth.getTimeInMillis());
		String result = b.format(date);
		System.out.println(result);		
	}

}
