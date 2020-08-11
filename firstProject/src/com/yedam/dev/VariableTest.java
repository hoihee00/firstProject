package com.yedam.dev;

public class VariableTest {
	public static void main(String[] args) {
		// b = b + 1;
		// 1 ~ 10까지 더하기
		int b = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) { // i = i + 1;
			b = b + 1; // b++
			sum = sum + b; // sum += b;
			System.out.println("SUM = " + sum + ", b = " + b);
		}
		System.out.println("합계 : " + sum);
		int i = 0;
	}
}
