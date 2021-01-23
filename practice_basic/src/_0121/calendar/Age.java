package _0121.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Age {
	public static void main(String[] args) {
		Age ca = new Age();
		ca.test1();
		ca.test2();
	}

	//SimpleDateFormat
	private void test2() {
		Calendar bday = Calendar.getInstance();
		bday.set(1997, 4, 5);
		
		Date bd = new Date(bday.getTimeInMillis());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
		String s = sdf.format(bd);
		System.out.println(s);
		
		
	}

	private void test1() {
		Calendar cal = Calendar.getInstance();
		cal.set(1997, 4, 5);
		
		Calendar tday = Calendar.getInstance();
		
		long diff = tday.getTimeInMillis()-cal.getTimeInMillis();
		
		System.out.println("만나이 : " + diff/1000/60/60/24/365);
	}

}
