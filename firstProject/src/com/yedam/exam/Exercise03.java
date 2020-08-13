package com.yedam.exam;

public class Exercise03 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i%3 == 0) {
				sum = sum + i;
//				continue;
			}
		}
		System.out.println("1~100까지 3의 배수의 총합: " + sum);
	}
}
