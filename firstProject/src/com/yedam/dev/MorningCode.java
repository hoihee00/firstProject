package com.yedam.dev;

public class MorningCode {

	public static void main(String[] args) { // void ~없음
		String str1 = "Hello";
		String str2 = "World";
		String name = "김다희";
		System.out.println(str1 + ", " + name);

		int v1 = 150, v2 = 270;
		int result = add(v1, v2);
		System.out.println("결과값: " + result);

		introduce("전지현");

		minus(v1, v2);
	}

	// minus method 정의
	public static int minus(int a, int b) {
		int result = minus(a, b);
		System.out.println("결과는 " + result);
	}

	public static void introduce(String name) {
		System.out.println("안녕 난 " + name + "야!");
	}

	public static int add(int x, int y) { // method
		int sum = x + y;
		return sum;
	}
}
