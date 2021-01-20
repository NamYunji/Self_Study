package _0118.calendar;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
		ct.test1();
		ct.test2();
	}


	//만나이 계산
	private void test1() {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(1997, 4, 5);
		
		Calendar cal2 = Calendar.getInstance();
		
		long diff = cal2.getTimeInMillis() - cal1.getTimeInMillis();
		long old = diff/1000/60/60/24/365;
		System.out.println("만나이 : " + old);
		
	}

	//생일을 Calendar -> SimpleDateFormat으로 출력
	private void test2() {
		Calendar cal = Calendar.getInstance();
		cal.set(1997, 4, 5);
		
		Date date = new Date(cal.getTimeInMillis());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String format = sdf.format(date);
		System.out.println(format);
		
	}
}
