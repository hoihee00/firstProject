package com.yedam.cond;

public class MethodExample {

	public static void main(String[] args) {
		multiTable(3, 5);
		multiTable(6);
//		int num = 2;
//		for (; num <= 9; num++)
//			multiTable(num); // (3)에서 괄호 안의 내용 매개값(파라미터)
	}

	public static void multiTable(int a, int b) {
		for (int i = a; i <= b; i++)
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
	}

	public static void multiTable(int a) { // (int a) 매개변수
		int num1 = a;
		for (int i = 1; i < 10; i++)
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
	}

	public static void multiTable() {
		int num1 = 2;
		for (int i = 1; i < 10; i++)
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
	}

}
