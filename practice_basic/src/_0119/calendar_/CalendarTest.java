package _0119.calendar_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
//		ct.test1();
//		ct.test2();
		ct.test3();

	}

	public void test3() {
		// 현재 날짜, 시각 정보 조회
		Calendar cal1 = Calendar.getInstance(); // new Calendar 불가능 왜??추상클래스 라서
		Calendar cal2 = new GregorianCalendar();

		Date date = new Date(cal1.getTimeInMillis());	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 ");
		
		// 요일(일1, 월2, 화3, 수4, 목5, 금6, 토7)
		char[] dayOfWeek = {'일', '월', '화', '수', '목', '금', '토' };
		System.out.println(sdf.format(date) + (dayOfWeek[cal1.get(Calendar.DAY_OF_WEEK) - 1]) + "요일");

	}
	

	private void test2() {
		Calendar cal = Calendar.getInstance(); //현재시간으로 세팅
		cal.set(1994, 1, 6);
		cal.set(Calendar.HOUR_OF_DAY, 12);
//		cal.set(1994, 1, 6, 17, 58, 30);
//		System.out.println(cal);
		
//		Date date = new Date(); //현재시간
		Date date = new Date(cal.getTimeInMillis()); //1970년 1월 1일 9시 0분 0초
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 W요일");
		String s = sdf.format(date);
		
		System.out.println(s);
		
	}

	private void test1() {
		Calendar cal = Calendar.getInstance();
		cal.set(1994, 1, 6);
		
		Calendar today = Calendar.getInstance();
		
		long bday = cal.getTimeInMillis();
		long tday = today.getTimeInMillis();
		
		long diff = tday - bday;
		
		int age = (int)(diff/1000/60/60/24/365);
		
		System.out.println("만나이 : " + age);
		
	}
}
