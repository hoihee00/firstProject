package com.yedam.classes;

import java.util.Calendar;

public class CalendarExample {

	static Calendar cal = Calendar.getInstance(); //2020-8-19
	public static void main(String[] args) {
		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH)); //월: 0~11월
		System.out.println(cal.get(Calendar.DATE));
		
		cal.set(2020, 7, 1); //2020년 8월 1일, 마지막날 계산하려면 (2020, 2, 0)
		System.out.println(cal.get(Calendar.YEAR)); 
		System.out.println(cal.get(Calendar.MONTH)); //월: 0~11월
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //결과값 1이면 일요일
		System.out.println(cal.get(Calendar.DATE));

		createCalendar(2020, 8);

	}
	
	
	public static void createCalendar(int year, int month) { //메인 메소드와 타입 맞춰줌 static 
		//2020년 8월 달력
		System.out.println("  일   월   화   수    목   금   토");
		cal.set(year, month-1, 1);
		int a = cal.get(Calendar.DAY_OF_WEEK);
		cal.set(year, month, 0);
		int l = cal.get(Calendar.DATE);
		for(int i=1; i<a; i++) {
			System.out.printf("%3d",0);
		}
		int day = 1;
		for(int i=0; i<l; i++) {
			System.out.printf("%3d",day++);
			if((i+a)%7==0)
				System.out.println();
		}

	}


	
} //end of class
