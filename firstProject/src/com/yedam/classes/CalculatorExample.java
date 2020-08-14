package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();

		System.out.println("10 + 20 = " + cal.add(10, 20)); // int 타입
		System.out.println("10.0+20.0 = " + cal.add(10.0, 20.0)); // double 타입
		
		double r1 = 3.5;
				cal.getArea(r1);
				
		// => 가로 4, 세로 5의 넓이는 20 입니다.

		cal.getRectangle(4,5); // 방법1.에 활용
		
		System.out.println(cal.getRectangle2(4,5)); // 방법2.에 활용

	}
}
