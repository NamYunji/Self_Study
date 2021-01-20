package _0118.calendar;

import java.util.Calendar;

/*
 * 내가 태어난 날 ~ 지금까지 몇 밀리초를 살아왔는가?
 * 
 */
public class TimeInMillis {
	public static void main(String[] args) {

		//현재시간 세팅
		Calendar cal = Calendar.getInstance();
		//내 생년월일
		cal.set(1997, 4, 5);

		//현재시간 세팅
		Calendar cal2 = Calendar.getInstance();
		
		double diff = cal2.getTimeInMillis() - cal.getTimeInMillis();
		System.out.println("유룽 살아온 밀리초 : " + diff);
		System.out.println("유룽 살아온 초: " + diff/1000);
		System.out.println("유룽 살아온 분 : " + diff/(1000*60));
		System.out.println("유룽 살아온 시간 : " + diff/(1000*60*60));
		System.out.println("유룽 살아온 날 : " + diff/(1000*60*60*24));
		System.out.println("유룽 살아온 달 : " + diff/1000/60/60/24/30);
		System.out.println("유룽 살아온 년 : " + diff/1000/60/60/24/365);
		
	}
}
