package com.yedam.classes;

public class Calculator {
	static double pi = 3.14;
	
	// 가로, 세로 => 넓이를 반환해주는 메소드(getRectangle) - 방법1
	public static void getRectangle(int a, int b) {
		System.out.println("가로 " + a + ", 세로 " + b + "인 직사각형의 넓이는 " + a * b + "입니다.");
	}
	
	// 가로, 세로 => 넓이를 반환해주는 메소드(getRectangle) - 방법2
	public static String getRectangle2(int a, int b) {
		return "가로 " + a + ", 세로 " + b + "인 직사각형의 넓이는 " +calRectangle(a,b) + "입니다.";
	}
		public static int calRectangle(int a, int b) {
		return a * b;
	}
	
	
	public static int add(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	public static double add(double x, double y) {
		return x + y;
	}
	
	public static void getArea(double a) { //매개값은 있는데 반환 타입은 없음 -> return 구문 없음
		double result = pi * a * a;
		System.out.println("반지름이 " + a + "인 원의 넓이는 " + result + "이다.");
	}
	
}
