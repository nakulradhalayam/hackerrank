package com.hackerrank.algorithms;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class ScoreComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Date date= (java.util.Date) Calendar.getInstance().getTime();
		
		TimeZone tz= TimeZone.getTimeZone("EST");

		Calendar userCalendar = GregorianCalendar.getInstance(tz);
		
		Calendar currentCalendarDate = Calendar.getInstance();
		
		userCalendar.setTime(date);
		
		  currentCalendarDate.set(Calendar.YEAR, userCalendar.get(Calendar.YEAR));
	        currentCalendarDate.set(Calendar.MONTH, userCalendar.get(Calendar.MONTH));
	        currentCalendarDate.set(Calendar.DAY_OF_MONTH, userCalendar.get(Calendar.DAY_OF_MONTH));
	        currentCalendarDate.set(Calendar.HOUR_OF_DAY, userCalendar.get(Calendar.HOUR_OF_DAY));
	        currentCalendarDate.set(Calendar.MINUTE, userCalendar.get(Calendar.MINUTE));
	        currentCalendarDate.set(Calendar.SECOND, 0);
	        currentCalendarDate.set(Calendar.MILLISECOND, 0);
		System.out.println(userCalendar.getTime());
	        System.out.println(currentCalendarDate.getTime());
	        
	}
}
