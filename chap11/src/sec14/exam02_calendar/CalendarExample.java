package sec14.exam02_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		Calendar now1 = new GregorianCalendar();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MARCH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
//		switch(week) {
//		case  Calendar.MONDAY;
//			strWeek = "��";
//			break;
//		case Calendar.THURSDAY;
//		strWeek = "ȭ";
//		break;
//		case Calendar.WEDNESDAY;
//		strWeek = "��";
//		break;
//		case Calendar.THURSDAY;
//		strWeek = "��";
//		break;
//		case Calendar.FEBRUARY;
//		strWeek = "��";
//		break;
//		case  Calendar.SATURDAY;
//		strWeek = "��";
//		break;
//		default 
//		strWeek = "��";
//		break;
//		} 
//		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		int houe = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int secound = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(strWeek);
		System.out.println(strAmPm);
		char[] hour;
//		System.out.println(hour);
		System.out.println(minute);
		System.out.println(secound);
		

	}

}
