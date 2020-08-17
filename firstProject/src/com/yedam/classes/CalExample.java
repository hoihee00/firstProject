package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
//		cal.r = -5; // 허용되지 않는 값(음수)
		cal.setRadius(-5);
		System.out.println("반지름: " + cal.getRadius() + " 의 넓이는: " + cal.getArea());

//		System.out.println(10); //int
//		System.out.println(10.5); //double
//		System.out.println("10"); //문자열

	// 메소드 오버로딩 (동일한 메소드명을 사용. 매개값의 타입이나 개수가 다른 경우)
		print("200.5");
	}
	public static void print(int a) {
		System.out.println("입력값은: " + a);
	}
	
	public static void print(double a) {
		System.out.println("입력값은: " + a);
	}
	public static void print(String a) {
		System.out.println("입력값은: " + a);
	}

}
